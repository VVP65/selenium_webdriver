package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoMainPage extends BasePage {
    static final String MENU_BUTTON_ID = "'react-burger-menu-btn'";
    static final String LOGOUT_BUTTON_ID = "'logout_sidebar_link'";
    static final String CLICK_SCRIPT_BY_BUTTON_ID = "document.getElementById(%s).click()";


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

    public SauceDemoMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public SauceDemoMainPage clickAddToCartButton() {
        sauceLabsBackPackItemAddToCartButton.click();

        return new SauceDemoMainPage(driver);
    }

    public SauceDemoMainPage clickDeleteFromCartButton() {
        sauceLabsBackPackItemRemoveFromCartButton.click();

        return new SauceDemoMainPage(driver);
    }

    public String getLoginErrorMessage() {

        return loginErrorButton.getText();
    }

    public String getCartBadgeMessageAfterItemWasAddedToIt() {

        return sauceLabsBackPackItemIsAddedToCart.getText();
    }

    public String getSauceLabsBackPackItemAddToCartButtonText() {
        return sauceLabsBackPackItemAddToCartButton.getText();
    }

    public String getSauceLabsBackPackItemRemoveFromCartButtonText() {
        return sauceLabsBackPackItemRemoveFromCartButton.getText();
    }

    public int getTheFullItemsListSize() {

        return sauceDemoItemsList.size();
    }

    public SauceDemoMainPage logoutFromSauceDemoMainPageUsingJavaScriptExecutor(User user) {
        highlightElement(menuButton);
        clickElementUsingJavaScriptExecutor(String.format(CLICK_SCRIPT_BY_BUTTON_ID, MENU_BUTTON_ID));
        highlightElement(logoutButton);
        clickElementUsingJavaScriptExecutor(String.format(CLICK_SCRIPT_BY_BUTTON_ID, LOGOUT_BUTTON_ID));

        return new SauceDemoMainPage(driver);
    }
}