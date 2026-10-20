package com.nam.sparta.simpletests;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class SwagLabsSerenityTest {

    @Managed
    WebDriver webDriver;

    private static final String BASE_URL = "https://www.saucedemo.com/";

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() throws InterruptedException {
        webDriver.get(BASE_URL);
        Assertions.assertEquals("https://www.saucedemo.com/", webDriver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", webDriver.getTitle());
    }

    @Test
    @DisplayName("Give I enter a valid username and password, when I click login, then I should be directed to the inventory page")
    public void successfulLoginTest()  {
        //Given (arrange)
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElementFacade loginButton = (WebElementFacade) webDriver.findElement(By.id("login-button"));
        loginButton.waitUntilVisible();
        // Then (act)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        // Then (assert)
        assertThat(webDriver.getCurrentUrl(), Matchers.is(BASE_URL + "inventory.html"));
    }
    @Test
    @DisplayName("Given I am logged in, when I add a product to the cart, then the cart count should increase")
    public void addProductToCartAndVerifyCount() {
        webDriver.get(BASE_URL);
        webDriver.findElement(By.name("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        webDriver.findElement(By.cssSelector(".inventory_item button")).click(); // Add first product
        WebElement cartBadge = webDriver.findElement(By.className("shopping_cart_badge"));
        assertThat(cartBadge.getText(), is("1"));
    }

    @Test
    @DisplayName("Given I have a product in the cart, when I remove it, then the cart count should decrease accordingly")
    public void removeProductFromCart() {
        webDriver.get(BASE_URL);
        webDriver.findElement(By.name("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        webDriver.findElement(By.cssSelector(".inventory_item button")).click(); // Add
        webDriver.findElement(By.cssSelector(".inventory_item .btn_secondary")).click(); // Remove
        List<WebElement> badges = webDriver.findElements(By.className("shopping_cart_badge"));
        assertThat(String.valueOf(badges.size()), is("0")); // No badge when cart is empty
    }

    @Test
    @DisplayName("Given I am logged in, when I logout, then I should be redirected to the login page")
    public void logoutAndVerifyRedirection() {
        webDriver.get(BASE_URL);
        webDriver.findElement(By.name("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        webDriver.findElement(By.id("react-burger-menu-btn")).click();
        webDriver.findElement(By.id("logout_sidebar_link")).click();
        assertThat(webDriver.getCurrentUrl(), is(BASE_URL));
    }


}
