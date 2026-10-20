package com.nam.sparta.tests;


import com.nam.sparta.pages.HomePage;
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
}
