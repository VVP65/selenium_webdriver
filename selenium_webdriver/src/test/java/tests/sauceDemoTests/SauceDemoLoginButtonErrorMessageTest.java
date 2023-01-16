package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoLoginButtonErrorMessageTest extends BaseTest {

    @Test
    public void lockedUserIsNotAbleToLoginCheck() {
        User testUser = UserCreator.getLockedOutUser();
        String sauceDemoLoginButtonErrorMessage = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getLoginErrorMessage();

        assertEquals(sauceDemoLoginButtonErrorMessage, "Epic sadface: Sorry, this user has been locked out.", "Current page does not belong to Sauce Demo project");
    }
}