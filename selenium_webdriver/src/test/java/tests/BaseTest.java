package tests;

import driver.DriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static Logger log = LogManager.getRootLogger();


    protected WebDriver driver;


    @BeforeMethod()
    public void browserSetUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverManager.closeDriver();
    }
}