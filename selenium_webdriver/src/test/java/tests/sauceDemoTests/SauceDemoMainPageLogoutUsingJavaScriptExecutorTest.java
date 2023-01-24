package tests.sauceDemoTests;

import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoMainPageLogoutUsingJavaScriptExecutorTest extends BaseTest {

    @Test
    public void userCanLogoutFromMainPageUsingJavaScriptExecutorCheck() {
        User testUser = UserCreator.getStandardUser();

        String sauceDemoLoginPageURL = new SauceDemoLoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .logoutFromSauceDemoMainPageUsingJavaScriptExecutor(testUser)
                .getPageURL();

        assertTrue(sauceDemoLoginPageURL.contains("https://www.saucedemo.com"), "Current page does not belong to Sauce Demo project");
    }
}