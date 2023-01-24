package tests;

import core.driver.DriverManagerFactory;
import core.driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod()
    public void browserSetUp() {
        DriverType driverType = DriverType.valueOf(System.getProperty("browser"));
        driver = DriverManagerFactory.getManager(driverType).getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {

        driver.quit();
    }
}