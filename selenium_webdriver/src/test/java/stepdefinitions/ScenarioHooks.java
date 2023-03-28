package stepdefinitions;

import core.driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ScenarioHooks {

    @After
    public void afterScenario() {
        DriverSingleton.getInstance().close();
    }

    @After
    public void af(Scenario scenario) throws InterruptedException, IOException, IllegalMonitorStateException {
        if (scenario.isFailed()) {
            Allure.addAttachment("Failing Test Screenshot", new ByteArrayInputStream(((TakesScreenshot) DriverSingleton.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES)));
        }
    }
}