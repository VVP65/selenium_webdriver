package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class LoginButtonErrorMessageTest extends BaseTest {

    @Test
    public void lockedUserIsNotAbleToLoginCheck() {
        User testUser = UserCreator.getUser(UserType.LOCKED_OUT_USER);

        String loginButtonErrorMessage = new LoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .getLoginErrorMessage();

        assertEquals(loginButtonErrorMessage, "Epic sadface: Sorry, this user has been locked out.", "Current page does not belong to Sauce Demo project");
    }
}