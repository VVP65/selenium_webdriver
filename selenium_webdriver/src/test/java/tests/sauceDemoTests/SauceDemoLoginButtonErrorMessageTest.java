package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoLoginButtonErrorMessageTest extends BaseTest {

    @Test
    public void getLoginButtonErrorMessage() {
        User testUser = UserCreator.withCredentialsFromProperty();
        String sauceDemoLoginButtonErrorMessage = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getLoginErrorMessage();

        log.info(String.format("Sauce Demo Login Button Error Message: %s", sauceDemoLoginButtonErrorMessage));
        assertEquals(sauceDemoLoginButtonErrorMessage, "Epic sadface: Sorry, this user has been locked out.", "Current page does not belong to Sauce Demo project");
    }
}