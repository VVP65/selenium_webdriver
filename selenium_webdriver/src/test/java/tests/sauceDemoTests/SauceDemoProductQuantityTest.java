package tests.sauceDemoTests;

import models.User;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import core.service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoProductQuantityTest extends BaseTest {

    @Test
    public void sauceDemoProductQuantityCheck() {
        User testUser = UserCreator.getStandardUser();
        int sauceDemoProductQuantity = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getTheFullItemsListSize();

        int expectedQuantity = 6;
        assertEquals(sauceDemoProductQuantity, expectedQuantity, "Total amount of Sauce Demo Items should be: " + expectedQuantity);
    }
}