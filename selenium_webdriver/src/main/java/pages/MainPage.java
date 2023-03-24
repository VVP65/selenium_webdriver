package pages;

import core.driver.DriverSingleton;
import io.qameta.allure.Step;
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

    @Step("User click Add to cart button")
    public MainPage clickAddToCartButton() {
        sauceLabsBackPackItemAddToCartButton.click();

        return this;
    }

    public MainPage clickDeleteFromCartButton() {
        sauceLabsBackPackItemRemoveFromCartButton.click();

        return this;
    }

    @Step("User can see login error message")
    public String getLoginErrorMessage() {
        return loginErrorButton.getText();
    }

    public String getCartBadgeMessage() {
        return sauceLabsBackPackItemIsAddedToCart.getText();
    }

    public String getSauceLabsBackPackItemAddToCartButtonText() {
        return sauceLabsBackPackItemAddToCartButton.getText();
    }

    @Step("User can see back pack item remove from cart button text")
    public String getSauceLabsBackPackItemRemoveFromCartButtonText() {
        return sauceLabsBackPackItemRemoveFromCartButton.getText();
    }

    public int getTheFullItemsListSize() {
        return sauceDemoItemsList.size();
    }
}