package tests.sauceDemoTests;

import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoMainPageLoginUsingWebDriverActionsTest extends BaseTest {

    @Test
    public void userCanLogInToMainPageUsingWebDriverActionsCheck() {
        User testUser = UserCreator.getStandardUser();

        String sauceDemoMainPageURL = new SauceDemoLoginPage(driver)
                .openLoginPage()
                .loginViaActions(testUser)
                .getPageURL();

        assertTrue(sauceDemoMainPageURL.contains("https://www.saucedemo.com/inventory.html"), "Current page does not belong to Sauce Demo project");
    }
}