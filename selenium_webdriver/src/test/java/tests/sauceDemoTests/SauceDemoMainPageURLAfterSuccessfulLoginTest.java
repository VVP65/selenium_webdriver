package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.SauceDemoLoginPage;
import service.UserCreator;
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