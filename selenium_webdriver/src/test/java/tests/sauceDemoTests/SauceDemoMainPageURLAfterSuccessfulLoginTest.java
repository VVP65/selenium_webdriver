package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoMainPageURLAfterSuccessfulLoginTest extends BaseTest {
    @Test
    public void sauceDemoMainPageURLAfterSuccessfulLoginCheck() {
        User testUser = UserCreator.withCredentialsFromProperty();
        String sauceDemoMainPageURL = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getPageURL();

        log.info(String.format("Sauce Demo Main Page Title: %s", sauceDemoMainPageURL));
        assertTrue(sauceDemoMainPageURL.contains("https://www.saucedemo.com/inventory.html"), "Current page does not belong to Sauce Demo project");
    }
}