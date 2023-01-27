package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class MainPageLogoutUsingJavaScriptExecutorTest extends BaseTest {

    @Test
    public void userCanLogoutFromMainPageUsingJavaScriptExecutorCheck() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        String sauceDemoLoginPageURL = new LoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .logoutFromSauceDemoMainPageUsingJavaScriptExecutor(testUser)
                .getPageURL();

        assertTrue(sauceDemoLoginPageURL.contains("https://www.saucedemo.com"), "Current page does not belong to Sauce Demo project");
    }
}