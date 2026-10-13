package com.sparta.cucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class CalcStepdefs {
    private Calculator calculator;
    private int actual;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
    }

    @And("I enter {int} and {int} into the calculator")
    public void iEnterAndIntoTheCalculator(int num1, int num2) {
        calculator.setNum1(num1);
        calculator.setNum2(num2);
    }

    @When("I press add")
    public void iPressAdd() {
        // Write code here that turns the phrase above into concrete actions
        actual = calculator.add();
    }

    @When("I press subtract")
    public void iPressSubtract() {
        // Write code here that turns the phrase above into concrete actions
      actual = calculator.subtract();
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        // Write code here that turns the phrase above into concrete actions
        MatcherAssert.assertThat(actual, Matchers.is(expected));
    }


}