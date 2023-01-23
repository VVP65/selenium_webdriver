package tests.sauceDemoTests;

import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import core.service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoDeleteItemFromCartTest extends BaseTest {

    @Test
    public void oneCanDeleteItemFromCartCheck() {
        User testUser = UserCreator.getStandardUser();
        String buttonText = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton()
                .clickDeleteFromCartButton()
                .getSauceLabsBackPackItemAddToCartButtonText();

        assertEquals(buttonText, "ADD TO CART", "ADD TO CART button is absent on the screen.");
    }
}