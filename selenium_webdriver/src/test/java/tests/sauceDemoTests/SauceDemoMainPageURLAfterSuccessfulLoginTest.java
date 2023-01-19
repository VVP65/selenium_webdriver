package tests.sauceDemoTests;

import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import core.service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoMainPageURLAfterSuccessfulLoginTest extends BaseTest {

    @Test
    public void sauceDemoMainPageURLAfterSuccessfulLoginCheck() {
        User testUser = UserCreator.getStandardUser();
        String sauceDemoMainPageURL = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getPageURL();

        assertTrue(sauceDemoMainPageURL.contains("https://www.saucedemo.com/inventory.html"), "Current page does not belong to Sauce Demo project");
    }
}