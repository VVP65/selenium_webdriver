package tests.sauceDemoTests;

import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class CartBadgePresenceTest extends BaseTest {

    @Test
    public void cartBadgeWasAddedToTheCartLogoAfterAddingItemIntoCartCheck() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        String badgeWasAddedToTheCartLogo = new LoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .clickAddToCartButton()
                .getCartBadgeMessageAfterItemWasAddedToIt();

        assertEquals(badgeWasAddedToTheCartLogo, "1", "Badge was not successfully added to the cart logo.");
    }
}