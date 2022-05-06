package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.reset;

public class SpartanTestBase {
    @BeforeAll
    public static void beforeAll() {
        RestAssured.baseURI = "http://107.21.162.145:8000";
        RestAssured.basePath = "/api";
    }

    @AfterAll
    public static void resetApi() {
        reset();
    }
}
