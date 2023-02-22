package stepdefinitions;

import core.driver.DriverSingleton;
import io.cucumber.java.After;

public class ScenarioHooks {

    @After
    public void afterScenario() {
        DriverSingleton.getInstance().close();
    }
}