package com.cydeo.day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequestWithPath {
    /**
     * Task 2:
     * <p>
     * 1. Send request to HR url and save the response
     * 2. GET /employees/150
     * 3. Store the response in Response Object that comes from get Request
     * 4. Print out followings
     * - First Name
     * - Last Name
     * - Verify status code is 200
     * - Verify First Name is "Peter"
     * - Verify content-Type is application/json
     */

    @Test
    public void test1(){
        Response response = RestAssured.get("http://107.21.162.145:1000/ords/hr/employees/150");
response.prettyPrint();
String firstName=response.path("first_name");
//check the link href
        response.path("links[0].href").toString()
;


    }}
