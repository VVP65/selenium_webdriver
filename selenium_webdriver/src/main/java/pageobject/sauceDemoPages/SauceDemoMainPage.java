package pageobject.sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject.basePage.BasePage;

import java.util.List;

public class SauceDemoMainPage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement sauceLabsBackPackItemAddToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement sauceLabsBackPackItemRemoveFromCartButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement sauceLabsBackPackItemIsAddedToCart;

    @FindBy(xpath = "//*[text()='Epic sadface: Sorry, this user has been locked out.']")
    private WebElement loginErrorButton;

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

    public String cartBadgeIsPresentAfterItemWasAddedToItCheck() {
        return sauceLabsBackPackItemIsAddedToCart.getText();
    }

    public int getTheFullItemsList() {
        return sauceDemoItemsList.size();
    }
}