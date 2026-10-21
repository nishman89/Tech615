package com.nam.sparta.tests;


import com.nam.sparta.pages.*;
import com.sparta.serenity.pages.InventoryPage;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class SwagLabSerenityTest_POM {
    @Managed
    private HomePage homePage;

    @Managed
    private InventoryPage inventoryPage;

    @Test
    @DisplayName("Give I enter a valid username and password, when I click login, then I should be directed to the inventory page")
    public void successfulLoginTest(){
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();
        assertThat(homePage.getDriver().getCurrentUrl(), is("https://www.saucedemo.com/inventory.html"));
    }

    @Test
    @DisplayName("Give I enter a valid username and invalid password, when I click login, then I should get an error message")
    public void unsuccessfulLoginTest(){
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("sefdsuce");
        homePage.clickLoginButton();
        assertThat(homePage.getErrorMessage(), containsString("Epic sadface"));
    }


    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage() {
        // Given
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();

        // When/Then
        assertThat(inventoryPage.getInventoryItemCount(), is(6));
    }

    @Test
    @DisplayName("Given I am logged in, when I add a product to the cart, then the cart count should increase")
    public void addingItemToCartShouldUpdateBadge() {
        // Given
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();

        // When
        inventoryPage.addFirstItemToCart();

        // Then
        assertThat(inventoryPage.getCartBadgeText(), is("1"));
    }

    @Test
    @DisplayName("Given I have a product in the cart, when I remove it, then the cart count should decrease accordingly")
    public void removeProductFromCart() {
        // Given
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();

        // Add a product to the cart
        inventoryPage.addFirstItemToCart();

        // Remove the product from the cart
        inventoryPage.removeFirstItemFromCart();

        // Then
        assertThat(inventoryPage.isCartBadgeDisplayed(), is(false)); // No badge when cart is empty
    }


    @Test
    @DisplayName("Given I am logged in, when I logout, then I should be redirected to the login page")
    public void logoutAndVerifyRedirection() {
        // Given
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();

        // When
        inventoryPage.openMenu();
        inventoryPage.clickLogout();

        // Then
        assertThat(homePage.isUserNameFieldDisplayed(), is(true));
        assertThat(inventoryPage.getDriver().getCurrentUrl(), is("https://www.saucedemo.com/"));
    }
}
