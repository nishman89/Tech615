package com.nam.sparta.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
//        tags = "@Happy",
        glue = "com.nam.sparta.steps",
        plugin = {
                "pretty",
                "html:target/testReport.html",
                "json:target/jsonReport.json"
        },
        publish = true
) class TestRunner {
}
