package com.nam.sparta.steps;

import com.sparta.serenity.pages.*;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class InventorySteps {

    @Managed
    private InventoryPage inventoryPage;

    @When("I land on the inventory page")
    public void iLandOnTheInventoryPage() {
        assertThat(inventoryPage.getDriver().getCurrentUrl(), containsString("/inventory.html"));
    }

    @Then("The number of products displayed on the inventory page is {int}")
    public void theNumberOfProductsDisplayedOnTheInventoryPageIs(int expected) {
        assertThat(inventoryPage.getInventoryItemCount(), is(expected));
    }

    @When("I add an item to the cart")
    public void iAddAnItemToTheCart() {
        inventoryPage.addFirstItemToCart();
    }

    @Then("The item count increases by one")
    public void theItemCountIncreasesByOne() {
        assertThat(inventoryPage.getCartBadgeText(), is("1"));
    }

    @And("The number of available products is {int}")
    public void theNumberOfAvailableProductsIs(int expected) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(inventoryPage.getInventoryItemCount(), is(expected));
    }
}