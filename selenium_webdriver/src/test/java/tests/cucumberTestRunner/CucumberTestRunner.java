package tests.cucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        plugin = {
                "pretty", "json:io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "html:target/cucumber-html-report"
        },
        glue = "stepdefinitions",
        features = "src/test/resources"
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}