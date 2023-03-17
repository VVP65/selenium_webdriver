package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainPage extends PageObject {

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElementFacade sauceLabsBackPackItemAddToCartButton;

    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']")
    private WebElementFacade sauceLabsBackPackItemRemoveFromCartButton;

    @FindBy(xpath = "//h3[@Data-test='error']")
    private WebElementFacade loginErrorButton;

    public String getPageURL() {
        return getDriver().getCurrentUrl();
    }

    public MainPage clickAddToCartButton() {
        sauceLabsBackPackItemAddToCartButton.click();

        return this;
    }

    public String getLoginErrorMessage() {
        return loginErrorButton.getText();
    }

    public String getSauceLabsBackPackItemRemoveFromCartButtonText() {
        return sauceLabsBackPackItemRemoveFromCartButton.getText();
    }
}