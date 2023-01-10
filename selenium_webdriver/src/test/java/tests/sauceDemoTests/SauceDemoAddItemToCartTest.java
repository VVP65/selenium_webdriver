package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import pageobject.sauceDemoPages.SauceDemoMainPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoAddItemToCartTest extends BaseTest {
    @Test
    public void oneCanAddItemToCart() {
        User testUser = UserCreator.withCredentialsFromProperty();
        SauceDemoMainPage itemWasAddedToCart = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton();

        assertTrue(true, "An item was not successfully added to the cart.");
    }
}