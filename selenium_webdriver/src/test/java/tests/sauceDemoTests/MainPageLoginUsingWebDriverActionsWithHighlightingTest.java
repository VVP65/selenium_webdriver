package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class MainPageLoginUsingWebDriverActionsWithHighlightingTest extends BaseTest {

    @Test
    public void userCanLogInToMainPageUsingWebDriverActionsWithHighlightingCheck() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        String mainPageURL = new LoginPage(driver)
                .openLoginPage()
                .loginViaActionsWithHighlighting(testUser)
                .getPageURL();

        assertTrue(mainPageURL.contains("https://www.saucedemo.com/inventory.html"), "Current page does not belong to Sauce Demo project");
    }
}