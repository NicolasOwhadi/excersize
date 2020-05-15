package com.utills;

import com.api.Variables;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.pojos.NewDeck;

import java.io.File;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APIUtilities extends Variables {
    private static String URI = ConfigurationReader.get("deckofcards_base_uri");

    /**
     * @return response object
     */
    public static Response brandNewDeckOfCards() {
        Response response = given().accept(ContentType.JSON)
                .and().get(Variables.GET_NEW_DECK);

        return response;
    }

    /**
     * @return response object
     */
    public static Response create_two_Jokers_in_the_deck() {

        Response response = given().accept(ContentType.JSON)
                .and().queryParams("jokers_enabled", true).get(Variables.GET_NEW_DECK);
        System.out.println("########################");
        System.out.println("#  [RESPONSE PAYLOAD]  #");
        return response;
    }

    /**
     * @param deckID
     * @return response object
     */
    public static Response draw_one_card_from_deck(String deckID) {

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("count", 1)
                .and().then().when()
                .get("deck/" + deckID + "/draw");
        return response;
    }
    /*
     */

    public static Response draw_cards_from_deck(int drawAmount, String deckID) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("count", drawAmount)
                .and().then().when()
                .get("deck/" + deckID + "/draw");

        return response;
    }
}
