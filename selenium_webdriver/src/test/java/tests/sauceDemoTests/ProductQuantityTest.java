package tests.sauceDemoTests;


import core.enums.UserType;
import core.service.UserCreator;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class ProductQuantityTest extends BaseTest {

    @Test
    public void sauceDemoProductQuantityCheck() {
        User testUser = UserCreator.getUser(UserType.STANDARD_USER);

        int actualQuantity = new LoginPage(driver)
                .openLoginPage()
                .loginToMainPage(testUser)
                .getTheFullItemsListSize();

        int expectedQuantity = 6;
        assertEquals(actualQuantity, expectedQuantity, "Total amount of Sauce Demo Items should be: " + expectedQuantity);
    }
}