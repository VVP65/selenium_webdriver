package tests.sauceDemoTests;

import model.User;
import org.testng.annotations.Test;
import pageobject.sauceDemoPages.SauceDemoLoginPage;
import service.UserCreator;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class SauceDemoProductQuantityTest extends BaseTest {

    @Test
    public void sauceDemoProductQuantityCheck() {
        User testUser = UserCreator.withCredentialsFromProperty();
        int sauceDemoProductQuantity = new SauceDemoLoginPage(driver)
                .openSauceDemoLoginPage()
                .loginToSauceDemoMainPage(testUser)
                .getTheFullItemsList();

        log.info(String.format("Sauce Demo Product Quantity: %s", sauceDemoProductQuantity));
        assertEquals(sauceDemoProductQuantity, 6, "Total amount of Sauce Demo Items should be 6");
    }
}