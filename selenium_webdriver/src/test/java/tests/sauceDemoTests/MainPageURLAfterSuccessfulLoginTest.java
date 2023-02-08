package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class MainPageURLAfterSuccessfulLoginTest extends BaseTest {

    @Test
    public void sauceDemoMainPageURLAfterSuccessfulLoginCheck() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        String sauceDemoMainPageURL = new LoginPage()
                .openLoginPage()
                .loginToMainPage(testUser)
                .getPageURL();

        assertTrue(sauceDemoMainPageURL.contains("https://www.saucedemo.com/inventory.html"), "Current page does not belong to Sauce Demo project");
    }
}