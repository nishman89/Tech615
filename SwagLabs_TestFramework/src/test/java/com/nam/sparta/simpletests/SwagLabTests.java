package com.nam.sparta.simpletests;


import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.util.List;

public class SwagLabTests{
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private WebDriver webDriver;
    private static ChromeDriverService service;

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
//        options.setImplicitWaitTimeout(Duration.ofSeconds(10));

        return options;
    }
    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }
    @BeforeEach
    public void setup() {

        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll
    static void afterAll() {
        service.stop();
    }

    @AfterEach
    public void afterEach(){
        webDriver.quit();
    }

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() throws InterruptedException {
        webDriver.get(BASE_URL);
        Assertions.assertEquals("https://www.saucedemo.com/", webDriver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", webDriver.getTitle());
    }

    @Test
    @DisplayName("Give I enter a valid username and password,, when I click login, then I should be directed to the inventory page")
    public void successfulLoginTest() throws InterruptedException {
        //Given (arrange)
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));

        // Then (act)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        // Then (assert)
        MatcherAssert.assertThat(webDriver.getCurrentUrl(), Matchers.is(BASE_URL + "inventory.html"));
    }

    @Test
    @DisplayName("Give I have logged in, when I view the inventory page, then I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage()  {
        //Given (arrange)
        Wait<WebDriver> webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));

        // Then (act)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        List<WebElement> products = webDriver.findElements(By.className("inventory_item"));
//        Thread.sleep(10000);
        // Then (assert)
        int productCount = products.size();
        webDriverWait.until(webDriver -> webDriver.getCurrentUrl().contains("/inventory.html"));
        MatcherAssert.assertThat(productCount, Matchers.is(6));
    }

    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void unsuccessfulLoginTest_InvalidPassword(){
        webDriver.get(BASE_URL);
        WebElement usernameField= webDriver.findElement(By.name("user-name"));
        WebElement passwordField= webDriver.findElement(By.name("password"));
        WebElement loginButton= webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("invalid");
        loginButton.click();
        WebElement alert = webDriver.findElement(By.className("error-message-container")).findElement(By.tagName("h3"));
        MatcherAssert.assertThat(alert.getText(), Matchers.containsString("Epic sadface"));
    }

    @Test
    public  void dragAndDropTest() throws InterruptedException {
        // Navigate to the page
        webDriver.get("https://demoqa.com/droppable/");


        // Find elements for dragging and dropping
        WebElement columnA = webDriver.findElement(By.id("draggable"));
        WebElement columnB = webDriver.findElement(By.id("droppable"));

        // Perform drag and drop action
        Actions action = new Actions(webDriver);
        action.dragAndDrop(columnA, columnB).perform();
        Thread.sleep(1000);
        MatcherAssert.assertThat(columnB.getText(), Matchers.is("Dropped!"));
    }

    @Test
    public void alertTest() throws InterruptedException {
        webDriver.get("https://demoqa.com/alerts/");
        WebElement promptButton = webDriver.findElement(By.id("promtButton"));
        promptButton.click();

        Alert alert = webDriver.switchTo().alert();
        MatcherAssert.assertThat(alert.getText(), Matchers.is("Please enter your name"));
        alert.sendKeys("Nish");
        alert.accept();

        WebElement promptResult = webDriver.findElement(By.id("promptResult"));
        Thread.sleep(1000);
        MatcherAssert.assertThat(promptResult.getText(), Matchers.containsString("You entered Nish"));
    }

    @Test
    public void retrieveProductInfo(){
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce", Keys.ENTER);



        List<WebElement> products = webDriver.findElements(By.className("inventory_item"));

        try (PrintWriter writer = new PrintWriter(new FileWriter("innventoryItems.txt"))) {
            //iterate through each webElement in prodcuts, get the name and price, write it to a text file and then print out
            for (WebElement product: products) {
                WebElement nameElement = product.findElement(By.className("inventory_item_name"));
                WebElement priceElement = product.findElement(By.className("inventory_item_price"));
                String productInfo = nameElement.getText() + ": " + priceElement.getText();
                writer.println(productInfo);
                System.out.println(productInfo);
            }
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
//        Thread.sleep(10000);
        int productCount = products.size();
        MatcherAssert.assertThat(productCount, Matchers.is(6));

    }

    @Test
    @DisplayName("Automation Exercise – Accept Cookies If Visible")
    public void automationExercisePopup() throws InterruptedException {
        webDriver.get("https://automationexercise.com/");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        // Use findElements to avoid exceptions if the button is not present
        List<WebElement> consentButtons = webDriver.findElements(By.cssSelector("button.fc-cta-consent"));

        if (!consentButtons.isEmpty() && consentButtons.get(0).isDisplayed()) {
            consentButtons.get(0).click();
            System.out.println("Consent popup appeared – clicked Accept.");

            // Wait until the popup disappears
            wait.until(ExpectedConditions.invisibilityOf(consentButtons.get(0)));
        } else {
            System.out.println("Consent popup did not appear.");
        }

        // Wait until the "Signup / Login" link is clickable before interacting with it
        WebElement signupLoginLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login"))
        );
        signupLoginLink.click();
        MatcherAssert.assertThat(webDriver.getCurrentUrl(), Matchers.containsString("login"));
    }

}