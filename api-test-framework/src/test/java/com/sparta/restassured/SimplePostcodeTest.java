package com.sparta.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class SimplePostcodeTest {

    private static Response response;

    @BeforeAll
    static void setup(){
        response = RestAssured
                .given()
                    .baseUri("https://api.postcodes.io")
                    .basePath("/postcodes")
                .header("Accept", "text/json")
                    .when()
                    .get("/EC2Y5AS")
                .thenReturn();
    }

    @Test
    @DisplayName("Status code 200 returned")
    void testStatusCode200(){
        MatcherAssert.assertThat(response.statusCode(), Matchers.is(200));
    }

    @Test
    @DisplayName("Th server name in the headers is cloudflaure")
    void testServerNameInHeaders(){
        MatcherAssert.assertThat(response.header("Server"), Matchers.is("cloudflare"));
    }

    @Test
    @DisplayName("Correct postcode returned in response")
    void testCorrectPostcodeReturnedInResponse(){
        MatcherAssert.assertThat(response.jsonPath().getString("result.postcode"), Matchers.is("EC2Y 5AS"));
    }


    //

//    @Test
//    @DisplayName("Status code 200 returned v2")
//    void testStatusCode200_v2(){
//        RestAssured
//                .get("https://api.postcodes.io/postcodes/EC2Y5AS")
//                .then()
//                    .assertThat()
//                    .statusCode(200);
//    }
}
