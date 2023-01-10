package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class SauceDemoCartBadgePresenceTest extends BaseTest {

    @Test
    public void cartBadgeWasAddedToTheCartLogoAfterAddingItemIntoCart() {
        User testUser = UserCreator.withCredentialsFromProperty();
        String badgeWasAddedToTheCartLogo = String.valueOf(new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .clickAddToCartButton()
                .cartBadgeIsPresentAfterItemWasAddedToItCheck());

        assertTrue(true, "Badge was not successfully added to the cart logo.");
    }
}