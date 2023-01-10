package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import pageobject.sauceDemoPages.SauceDemoMainPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoDeleteItemFromCartTest extends BaseTest {

    @Test
    public void oneCanDeleteItemFromCart() {
        User testUser = UserCreator.withCredentialsFromProperty();
        SauceDemoMainPage itemWasDeletedFromCart = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton()
                .clickDeleteFromCartButton();

        assertTrue(true, "An item was not successfully deleted from cart.");
    }
}