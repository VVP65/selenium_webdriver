package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage extends BasePage {
    private static final String PROPERTY_URL = "testdata.sauceDemo.login.page.url";

    @FindBy(id = "user-name")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "login-button")
    private WebElement submit;

    public SauceDemoLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public SauceDemoLoginPage openLoginPage() {
        openPage(PROPERTY_URL);

        return this;
    }

    public SauceDemoMainPage loginToMainPage(User user) {
        inputLogin.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }

    public SauceDemoMainPage loginViaActions(User user) {
        openLoginPage();
        clickWebElementUsingActions(inputLogin);
        sendKeysViaActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        sendKeysViaActions(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }

    public SauceDemoMainPage loginViaActionsWithHighlighting(User user) {
        clickWebElementUsingActions(inputLogin);
        highlightElement(inputLogin);
        sendKeysViaActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        highlightElement(inputPassword);
        sendKeysViaActions(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }
}