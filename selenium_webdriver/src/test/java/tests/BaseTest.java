package tests;

import core.driver.DriverManager;
import core.driver.DriverManagerFactory;
import core.driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    DriverManager driverManager;
    protected WebDriver driver;

    @BeforeMethod()
    public void browserSetUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME_REMOTE);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {

        driver.quit();
    }
}