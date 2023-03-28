package pages;

import core.driver.DriverSingleton;
import core.service.TestDataReader;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private static final String LOGIN_PAGE_PROPERTY_URL = "sauceDemo.login.page.url";
    private static final String TIME_OUT_PROPERTY = "wait.explicitly";
    private static final String LOGIN_BUTTON_ID = "login-button";


    @FindBy(id = "user-name")
    private WebElement inputLogin;


    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "login-button")
    private WebElement submit;

    public LoginPage() {
        super(DriverSingleton.getInstance().getDriver());
        PageFactory.initElements(this.driver, this);
    }

    public void waitForLoginButtonPresence() {
        new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(TestDataReader
                .getTestData(TIME_OUT_PROPERTY))))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(LOGIN_BUTTON_ID)));
    }

    public LoginPage openPage(String url) {
        driver.get(TestDataReader.getEnvData(url));
        waitForLoginButtonPresence();

        return this;
    }

    public LoginPage openLoginPage() {
        openPage(LOGIN_PAGE_PROPERTY_URL);

        return this;
    }

    public MainPage loginToMainPage(User user) {
        inputLogin.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        submit.click();

        return new MainPage();
    }

    public MainPage loginViaActions(User user) {
        openLoginPage();
        clickWebElementUsingActions(inputLogin);
        sendKeysViaActions(user.getUsername());
        clickWebElementUsingActions(inputPassword);
        sendKeysViaActions(user.getPassword());
        submit.click();

        return new MainPage();
    }
}