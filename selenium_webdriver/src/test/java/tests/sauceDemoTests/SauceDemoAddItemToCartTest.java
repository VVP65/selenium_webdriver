package tests.sauceDemoTests;

import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import core.service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoAddItemToCartTest extends BaseTest {

    @Test
    public void oneCanAddItemToCart() {
        User testUser = UserCreator.getStandardUser();
        String buttonText = new SauceDemoLoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .clickAddToCartButton()
                .getSauceLabsBackPackItemRemoveFromCartButtonText();

        assertEquals(buttonText, "REMOVE", "REMOVE button is absent on the screen.");
    }
}