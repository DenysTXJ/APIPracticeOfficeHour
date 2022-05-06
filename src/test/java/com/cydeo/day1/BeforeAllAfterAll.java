package com.cydeo.day1;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BeforeAllAfterAll {
    /**
     * Task 3:
     * 1. Send request to Spartan url and save the response
     * 2. GET /spartans
     * 3. Store the response in Response Object that comes from get Request
     * 4. Print out followings
     * - response
     * - Content-Type
     * - Status Code
     * - Get me third spartan
     * - Get me third spartan gender
     * - Get me third spartan name
     * - Get me all spartan name
     */

    @BeforeAll
    public void beforeAll(){
        RestAssured.baseURI="http://107.21.162.145:1000";
        RestAssured.basePath="/ords/hr";
    }
}
