package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoDeleteItemFromCartTest extends BaseTest {

    @Test
    public void oneCanDeleteItemFromCartCheck() {
        User testUser = UserCreator.getStandardUser();
        String itemWasDeletedFromCart = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton()
                .clickDeleteFromCartButton()
                .getSauceLabsBackPackItemAddToCartButtonText();

        assertEquals(itemWasDeletedFromCart, "ADD TO CART", "An item was not successfully deleted from cart.");
    }
}