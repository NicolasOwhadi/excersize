package com.step_definitions;

import com.api.Variables;
import com.pojos.NewDeck;
import com.utills.APIUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.io.File;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;

public class DeckOfCardsApiStepDefs extends Variables {

    Response response;
    JsonPath json;
    Map<String, ?> QueryParams;
    Map<String, ?> headers;
    NewDeck newDeckPojo;
    String deck_id;
    List<Map<String, Object>> listOfCards;

    @Given("All parameters for a new deck of cards")
    public void the_deck_of_cards_base_uri() {
        /*
           {
            "success": true,
            "deck_id": "3w972y7co5ko",
            "remaining": 52,
            "shuffled": false
           }
         */
        // this is the expected response for new deck of cards
        final boolean success = true;
        final int remaining = 52;
    }

    @When("I call in the GET new deck API")
    public void i_call_in_the_GET_new_deck_API() {
        response = APIUtilities.brandNewDeckOfCards();
        response.prettyPrint();
    }


    @When("I call in the GET new deck API Query Params to create two Jokers in the deck")
    public void i_call_in_the_GET_new_deck_API_Query_Params_to_create_two_Jokers_in_the_deck() {
        response = APIUtilities.create_two_Jokers_in_the_deck();
        response.prettyPrint();

    }


    @Then("I verify GET new deck response status code should be {int}")
    public void i_verify_GET_new_deck_response_code_should_be(int expStatusCode) {
        System.out.println("############################");
        System.out.println("Status code: " + response.statusCode());
        assertEquals(expStatusCode, response.statusCode());
    }

    @Then("I verify GET response payload should contain {string}: true")
    public void i_verify_GET_response_payload_should_contain_true(String success) {
        // convert a payload to a JsonPath object
        json = response.jsonPath();
        boolean exp_success_value = json.getBoolean(success);
        System.out.println("\"success\": " + response.body().path(success));
        assertEquals(exp_success_value, json.getBoolean(success));

    }

    @Then("I verify GET response payload should contain remaining value {int}")
    public void i_verify_GET_response_payload_should_contain(int expNumOfCards) {
        //convert a json payload to a POJO class
        newDeckPojo = response.body().as(NewDeck.class);
        /*
           {
            "success": true,
            "deck_id": "3w972y7co5ko",
            "remaining": 52,
            "shuffled": false
           }
         */
        System.out.println("\"remaining\": " + newDeckPojo.getRemaining());
        // verify "remaining": value for every Test Case
        assertEquals(newDeckPojo.getRemaining(), expNumOfCards);
    }

    @Then("I am saving deck_id")
    public void i_am_saving_deck_id() {
        // saving "deck_id" and usi it to make another GET request
        deck_id = response.body().path("deck_id");

    }

    @Then("I draw one card from deck using {string}")
    public void i_draw_one_card_from_deck_using(String deckID) {
        deckID = deck_id;
        response = APIUtilities.draw_one_card_from_deck(deckID);
        response.prettyPrint();

    }

    @Then("I draw {int} cards from deck using {string}")
    public void i_draw_cards_from_deck_using(int drawAmount, String deckID) {
        if (drawAmount > 52) {
            System.out.println("Ups... Max amount of cards is 52 but you trying to draw: " + drawAmount);

        } else {
            deckID = deck_id;
            response = APIUtilities.draw_cards_from_deck(drawAmount, deckID);
            listOfCards = response.body().path("cards");
            //checking if the "remaining": value it is as expected
            json = response.jsonPath();
            int exp_cards = 52 - drawAmount;
            System.out.println("exp_remaining_cards = " + exp_cards);
            int act_cards = json.getInt("remaining");
            System.out.println("act_remaining_cards = " + act_cards);
            assertEquals(exp_cards, act_cards);


        }
    }


    @Then("the response json format should match the schema BrandNewDeck.json")
    public void the_response_json_format_should_match_the_schema_BrandNewDeck_json() {
        // Send GET request and validate the Json Schema in one statement without Response interface
        given().accept(ContentType.JSON)
                .and().when().get(Variables.GET_NEW_DECK)
                .then().assertThat().body(matchesJsonSchema(new File("src/test/resources/test_data/payloads/BrandNewDeck.json")));
    }
}
