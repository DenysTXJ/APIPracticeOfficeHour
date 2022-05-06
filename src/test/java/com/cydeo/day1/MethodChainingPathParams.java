package com.cydeo.day1;

import com.cydeo.utilities.SpartanTestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MethodChainingPathParams extends SpartanTestBase {

    /**
     * Task 4:
     * <p>
     * 1. Given accept type is Json
     * 2. Path Parameters values are
     * - id —> 5
     * 3. When user sends GET request to /spartans/{id}
     * 4. Verify followings
     * - Status code should be 200
     * - Content Type is application/json
     * - ID is 5
     * - Name is "Blythe"
     * - gender is "Female"
     * - phone is 3677539542
     */

    @Test
    public void test(){


    }

}
