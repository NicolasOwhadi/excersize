$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DeckOfCards.feature");
formatter.feature({
  "name": "Open a brand new deck of cards",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BrandNewCards"
    }
  ]
});
formatter.scenario({
  "name": "Add new deck of cards and verify status code 200, \"success\": true, \"remaining\": 52",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BrandNewCards"
    },
    {
      "name": "@FinraExcersize"
    },
    {
      "name": "@newDeckOfCards"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "All parameters for a new deck of cards",
  "keyword": "Given "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.the_deck_of_cards_base_uri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I call in the GET new deck API",
  "keyword": "When "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_call_in_the_GET_new_deck_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET new deck response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_new_deck_response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET response payload should contain \"success\": true",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_response_payload_should_contain_true(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "New deck of cards with two Jokers in the deck",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BrandNewCards"
    },
    {
      "name": "@FinraExcersize"
    },
    {
      "name": "@DeckOfCardsJoker"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I call in the GET new deck API Query Params to create two Jokers in the deck",
  "keyword": "When "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_call_in_the_GET_new_deck_API_Query_Params_to_create_two_Jokers_in_the_deck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET new deck response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_new_deck_response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET response payload should contain \"success\": true",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_response_payload_should_contain_true(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Draw one or more cards from a deck",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BrandNewCards"
    },
    {
      "name": "@FinraExcersize"
    },
    {
      "name": "@drawOneCardFromDeck"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I call in the GET new deck API",
  "keyword": "When "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_call_in_the_GET_new_deck_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET new deck response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_new_deck_response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET response payload should contain \"success\": true",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_response_payload_should_contain_true(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am saving deck_id",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_am_saving_deck_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I draw one card from deck using \"deck_id\"",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_draw_one_card_from_deck_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Draw more cards from a deck",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BrandNewCards"
    },
    {
      "name": "@FinraExcersize"
    },
    {
      "name": "@drawCardsFromDeck"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I call in the GET new deck API",
  "keyword": "When "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_call_in_the_GET_new_deck_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET new deck response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_new_deck_response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify GET response payload should contain \"success\": true",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_verify_GET_response_payload_should_contain_true(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am saving deck_id",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_am_saving_deck_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I draw 10 cards from deck using \"deck_id\"",
  "keyword": "And "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.i_draw_cards_from_deck_using(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Json schema validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BrandNewCards"
    },
    {
      "name": "@FinraExcersize"
    },
    {
      "name": "@JS_schema"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the response json format should match the schema BrandNewDeck.json",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckOfCardsApiStepDefs.the_response_json_format_should_match_the_schema_BrandNewDeck_json()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});