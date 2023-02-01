package tests;

import core.driver.DriverManagerFactory;
import core.enums.DriverType;
import core.service.TestDataReader;
import core.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod()
    public void browserSetUp() {
        DriverType driverType = DriverType.getType((TestDataReader.getTestData("browser")));
        driver = DriverManagerFactory.getManager(driverType).getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
    }
}