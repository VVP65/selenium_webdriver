package tests.cucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        },
        glue = "stepdefinitions",
        features = "src/test/resources"
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}