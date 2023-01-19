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

    public SauceDemoLoginPage openSauceDemoLoginPage() {
        openPage(PROPERTY_URL);

        return this;
    }

    public SauceDemoMainPage loginToSauceDemoMainPage(User user) {
        inputLogin.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }

    public SauceDemoMainPage loginToSauceDemoMainPageUsingWebDriverActions(User user) {
        openSauceDemoLoginPage();
        clickWebElementUsingActions(inputLogin);
        sendKeysToTheFormUsingActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        sendKeysToTheFormUsingActions(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }

    public SauceDemoMainPage loginToSauceDemoMainPageUsingWebDriverActionsWithHighlighting(User user) {
        clickWebElementUsingActions(inputLogin);
        highlightElement(inputLogin);
        sendKeysToTheFormUsingActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        highlightElement(inputPassword);
        sendKeysToTheFormUsingActions(user.getPassword());
        submit.click();

        return new SauceDemoMainPage(driver);
    }
}