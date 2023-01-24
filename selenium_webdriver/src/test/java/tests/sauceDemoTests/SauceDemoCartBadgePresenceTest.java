package tests.sauceDemoTests;

import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import core.service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoCartBadgePresenceTest extends BaseTest {

    @Test
    public void cartBadgeWasAddedToTheCartLogoAfterAddingItemIntoCartCheck() {
        User testUser = UserCreator.getStandardUser();
        String badgeWasAddedToTheCartLogo = new SauceDemoLoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .clickAddToCartButton()
                .getCartBadgeMessageAfterItemWasAddedToIt();

        assertEquals(badgeWasAddedToTheCartLogo, "1", "Badge was not successfully added to the cart logo.");
    }
}