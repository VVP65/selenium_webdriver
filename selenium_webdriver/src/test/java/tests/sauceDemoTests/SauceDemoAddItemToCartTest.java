package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoAddItemToCartTest extends BaseTest {

    @Test
    public void oneCanAddItemToCart() {
        User testUser = UserCreator.getStandardUser();
        String buttonText = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton()
                .getSauceLabsBackPackItemRemoveFromCartButtonText();

        assertEquals(buttonText, "REMOVE", "An item was not successfully added to the cart.");
    }
}