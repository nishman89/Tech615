package com.nam.sparta.steps;

import com.nam.sparta.pages.HomePage;
import com.sparta.serenity.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class LoginStepDefs {

    @Managed
    HomePage homePage;


    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.open();
    }
    @Given("I have entered the username {string}")
    public void i_have_entered_the_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterUserName(username);
    }
    @Given("I have entered the password {string}")
    public void i_have_entered_the_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterPassword(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickLoginButton();
    }
    @Then("I should land on the inventory page")
    public void i_should_land_on_the_inventory_page() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.getDriver().getCurrentUrl(), containsString("/inventory.html"));
    }


    @Then("I should see an error message that contains {string}")
    public void iShouldSeeAnErrorMessageThatContains(String expected) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.getErrorMessage(), containsString(expected));

    }
}
