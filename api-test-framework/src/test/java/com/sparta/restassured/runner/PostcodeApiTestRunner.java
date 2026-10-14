package com.sparta.restassured.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/postcode",
        glue = "com.sparta.restassured.steps",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/report.json"
        },
        tags = "not @ignore",
        publish = false
)
public class PostcodeApiTestRunner {
}