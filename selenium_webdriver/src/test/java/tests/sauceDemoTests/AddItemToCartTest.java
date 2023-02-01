package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class AddItemToCartTest extends BaseTest {

    @Test
    public void oneCanAddItemToCart() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        String buttonText = new LoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .clickAddToCartButton()
                .getSauceLabsBackPackItemRemoveFromCartButtonText();

        assertEquals(buttonText, "REMOVE", "REMOVE button is absent on the screen.");
    }
}