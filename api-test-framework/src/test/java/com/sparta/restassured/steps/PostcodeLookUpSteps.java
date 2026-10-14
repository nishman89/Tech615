package com.sparta.restassured.steps;

import com.sparta.restassured.utils.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class PostcodeLookUpSteps {

    private RequestSpecification request;
    private Response response;

    @Given("I am using the postcodes API with the base path is set to {string}")
    public void iAmUsingThePostcodesAPIWithTheBasePathIsSetTo(String basePath) {
        request = RestAssured
                .given()
                .header("Accept", "application/json")
                .baseUri(Config.getBasePostcodeUri())
                .basePath(basePath);
    }

    @When("I look up the postcode {string}")
    public void iLookUpThePostcode(String postcode) {
        response = request
                .when()
                .get(postcode)
                .thenReturn();
    }

    @Then("I should get a {int} response code")
    public void iShouldGetAResponseCode(int responseCode) {
        MatcherAssert.assertThat(response.statusCode(), Matchers.is(responseCode));
    }

    @And("the returned postcode should be {string}")
    public void theReturnedPostcodeShouldBe(String expectedPostcode) {
        String actualPostcode = response.jsonPath().getString("result.postcode");
        MatcherAssert.assertThat(actualPostcode, Matchers.is(expectedPostcode));
    }

    @And("the region should be {string}")
    public void theRegionShouldBe(String expectedRegion) {
        String actualRegion = response.jsonPath().getString("result.region");
        MatcherAssert.assertThat(actualRegion, Matchers.is(expectedRegion));
    }
}