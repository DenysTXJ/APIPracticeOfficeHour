package com.cydeo.day1;

import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.response.Response;
import org.junit.*;
import org.junit.jupiter.api.Test;




public class SimpleGetRequest {
    /*
     * Task 1:
     *
     * 1. Send request to HR url and save the response
     * 2. GET /regions
     * 3. Store the response in Response Object that comes from get Request
     * 4. Print out followings
     *    - Headers
     *    - Content-Type
     *    - Status Code
     *    - Response
     *    - Date
     * 5. Verify response body has "Europe"
     * 6. Verify response has Date
     */


    @Test
    public void test1(){
        Response response=RestAssured.get("http://107.21.162.145:1000/ords/hr/regions/1");
        response.prettyPrint();
        System.out.println(response.headers());
        System.out.println(response.header("Date"));
        Assert.assertTrue(response.body().asString().contains("Europe"));
        Assert.assertTrue(response.headers().hasHeaderWithName("Date"));

    }




}
