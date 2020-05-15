package com.step_definitions;

import com.utills.ConfigurationReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
    /*
     @Before annotation will run before each scenario
     */
    @Before
    public void setUp() {
        System.out.println("###########");
        System.out.println();
        System.out.println("baseURI ===>> " + ConfigurationReader.get("deckofcards_base_uri"));
        RestAssured.baseURI = ConfigurationReader.get("deckofcards_base_uri");
        System.out.println();
        System.out.println("###########");
    }

    /*
        @After annotation will run after each scenario
        */
    @After
    public void tearDown() {
        // close all connections here after each scenario
        RestAssured.reset();

    }
}
