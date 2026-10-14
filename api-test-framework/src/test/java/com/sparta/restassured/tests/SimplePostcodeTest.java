package com.sparta.restassured.tests;

import com.sparta.restassured.pojos.SinglePostcodeResponse;
import com.sparta.restassured.utils.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimplePostcodeTest {

    private static Response response;
    private static final String BASE_URI = Config.getBasePostcodeUri();
    private static SinglePostcodeResponse pojoResponse;

    @BeforeAll
    static void setup(){

        response = RestAssured
                .given()
                    .baseUri(BASE_URI)
                    .basePath("/postcodes")
                .header("Accept", "text/json")
                    .when()
                    .get("/EC2Y5AS")
                .thenReturn();
        pojoResponse = response.as(SinglePostcodeResponse.class);

    }

    @Test
    @DisplayName("Status code 200 returned")
    void testStatusCode200(){
        MatcherAssert.assertThat(response.statusCode(), Matchers.is(200));
        MatcherAssert.assertThat(pojoResponse.getStatus(), Matchers.is(200));
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
        MatcherAssert.assertThat(pojoResponse.getResult().getPostcode(), Matchers.is("EC2Y 5AS"));
    }

    @Test
    @DisplayName("Number of code returned is 14")
    void testNumberOfCodesReturnedis14(){;

        var size = response.jsonPath().getMap("result.codes").size();
        MatcherAssert.assertThat( size,Matchers.is(29));
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
