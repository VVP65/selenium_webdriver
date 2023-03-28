package tests;

import core.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod()
    public void browserSetUp() {
        WebDriver driver = DriverSingleton.getInstance().getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {

        DriverSingleton.getInstance().close();
    }
}