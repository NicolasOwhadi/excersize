@BrandNewCards
Feature: Open a brand new deck of cards

  @FinraExcersize @newDeckOfCards
  Scenario: Add new deck of cards and verify status code 200, "success": true, "remaining": 52
    Given All parameters for a new deck of cards
    When I call in the GET new deck API
    Then I verify GET new deck response status code should be 200
    And I verify GET response payload should contain "success": true


  @FinraExcersize @DeckOfCardsJoker
  Scenario: New deck of cards with two Jokers in the deck
    When I call in the GET new deck API Query Params to create two Jokers in the deck
    Then I verify GET new deck response status code should be 200
    And I verify GET response payload should contain "success": true


  @FinraExcersize @drawOneCardFromDeck
  Scenario: Draw one or more cards from a deck
    When I call in the GET new deck API
    Then I verify GET new deck response status code should be 200
    And I verify GET response payload should contain "success": true
    Then I am saving deck_id
    And I draw one card from deck using "deck_id"

  @FinraExcersize @drawCardsFromDeck
  Scenario: Draw more cards from a deck
    When I call in the GET new deck API
    Then I verify GET new deck response status code should be 200
    And I verify GET response payload should contain "success": true
    Then I am saving deck_id
    And I draw 10 cards from deck using "deck_id"

  @FinraExcersize @JS_schema
  Scenario: Json schema validation
    Then the response json format should match the schema BrandNewDeck.json


