package pages;

import core.service.TestDataReader;
import models.User;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    private final String LOGIN_PAGE_PROPERTY_URL = "sauceDemo.login.page.url";

    @FindBy(id = "user-name")
    private WebElementFacade inputLogin;

    @FindBy(id = "password")
    private WebElementFacade inputPassword;

    @FindBy(xpath = ".//input[@id='login-button']")
    private WebElementFacade submit;

    public void waitForLoginButtonPresence() {
        submit.waitUntilVisible();
    }

    public void openPage(String url) {
        openUrl(TestDataReader.getEnvData(url));
        waitForLoginButtonPresence();
    }

    public void openLoginPage() {
        openPage(LOGIN_PAGE_PROPERTY_URL);
    }

    public void loginToMainPage(User user) {
        inputLogin.type(user.getUsername());
        inputPassword.type(user.getPassword());
        submit.click();
    }
}