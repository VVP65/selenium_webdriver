package stepdefinitions;

import core.enums.UserType;
import core.service.TestDataReader;
import core.service.UserCreator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import pages.LoginPage;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageStepDefinitions {

    public static final String MAIN_PAGE_PROPERTY_URL = "sauceDemo.main.page.url";
    public static final String UNSUCCESSFUL_LOGIN_MESSAGE = "unsuccessful.login.message";

    @Page
    LoginPage loginPage;

    @Page
    MainPage mainPage;

    @Given("User Logged in to Main page with '{}' credentials")
    public void userLoggedInToMainPage(UserType userType) {
        openLoginPage();
        userLogsInWithCredentials(userType);
        userCanSeeMainPageUrl();
    }

    @Given("User opened Login page")
    public void openLoginPage() {
        loginPage.openLoginPage();
    }

    @When("User logs in with '{}' credentials")
    public void userLogsInWithCredentials(UserType userType) {
        loginPage.loginToMainPage(UserCreator.getUser(userType));
    }

    @Then("User can see Main page url")
    public void userCanSeeMainPageUrl() {
        String mainPageURLActualResult = mainPage.getPageURL();
        assertThat(mainPageURLActualResult).contains(TestDataReader.getEnvData(MAIN_PAGE_PROPERTY_URL));
    }

    @Then("User can see login error message")
    public void userCanSeeLoginErrorMessage() {
        String loginErrorMessage = mainPage.getLoginErrorMessage();
        assertThat(loginErrorMessage).contains(TestDataReader.getEnvData(UNSUCCESSFUL_LOGIN_MESSAGE));
    }
}