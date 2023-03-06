package pages;

import core.driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElement sauceLabsBackPackItemAddToCartButton;

    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']")
    private WebElement sauceLabsBackPackItemRemoveFromCartButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement sauceLabsBackPackItemIsAddedToCart;

    @FindBy(xpath = "//h3[@Data-test='error']")
    private WebElement loginErrorButton;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private List<WebElement> sauceDemoItemsList;

    public MainPage() {
        super(DriverSingleton.getInstance().getDriver());
        PageFactory.initElements(this.driver, this);
    }

    public MainPage clickAddToCartButton() {
        sauceLabsBackPackItemAddToCartButton.click();

        return this;
    }

    public MainPage clickDeleteFromCartButton() {
        sauceLabsBackPackItemRemoveFromCartButton.click();
        logger.info("I click to Delete from cart button");

        return this;
    }

    public String getLoginErrorMessage() {
        logger.debug("Login was unsuccessful");

        return loginErrorButton.getText();
    }

    public String getCartBadgeMessage() {
        logger.info("Cart badge message is present on the cart element on the screen");

        return sauceLabsBackPackItemIsAddedToCart.getText();
    }

    public String getSauceLabsBackPackItemAddToCartButtonText() {
        logger.info("Sauce LabsBack Pack Item was added to cart");

        return sauceLabsBackPackItemAddToCartButton.getText();
    }

    public String getSauceLabsBackPackItemRemoveFromCartButtonText() {
        logger.info("Sauce LabsBack Pack Item was removed from cart");

        return sauceLabsBackPackItemRemoveFromCartButton.getText();
    }

    public int getTheFullItemsListSize() {
        logger.info("I can see the full list of items on the screen");

        return sauceDemoItemsList.size();
    }
}