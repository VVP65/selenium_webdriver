package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    private static final String PROPERTY_URL = "sauceDemo.login.page.url";

    @FindBy(id = "user-name")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "login-button")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage openLoginPage() {
        openPage(PROPERTY_URL);
        logger.info("Login page is opened");

        return this;
    }

    public MainPage loginToMainPage(User user) {
        inputLogin.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        submit.click();
        logger.info("Main page is opened");

        return new MainPage(driver);
    }

    public MainPage loginViaActions(User user) {
        openLoginPage();
        clickWebElementUsingActions(inputLogin);
        sendKeysViaActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        sendKeysViaActions(user.getPassword());
        submit.click();
        logger.info("Login via Webdriver Actions was successful");

        return new MainPage(driver);
    }

    public MainPage loginViaActionsWithHighlighting(User user) {
        clickWebElementUsingActions(inputLogin);
        highlightElement(inputLogin);
        sendKeysViaActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        highlightElement(inputPassword);
        sendKeysViaActions(user.getPassword());
        submit.click();
        logger.info("Login via Webdriver Actions with highlighting was successful");

        return new MainPage(driver);
    }
}