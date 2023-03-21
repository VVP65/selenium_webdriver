package stepdefinitions;

import core.enums.UserType;
import core.service.TestDataReader;
import core.service.UserCreator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageStepDefinitions {

    public static final String MAIN_PAGE_PROPERTY_URL = "sauceDemo.main.page.url";
    public static final String UNSUCCESSFUL_LOGIN_MESSAGE = "Sorry, this user has been locked out.";

    @Given("User Logged in to Main page with '{}' credentials")
    public void userLoggedInToMainPage(UserType userType) {
        openLoginPage();
        userLogsInWithCredentials(userType);
        userCanSeeMainPageUrl();
    }

    @Given("User opened Login page")
    public void openLoginPage() {
        new LoginPage().openLoginPage();
    }

    @When("User logs in with '{}' credentials")
    public void userLogsInWithCredentials(UserType userType) {
        new LoginPage().loginToMainPage(UserCreator.getUser(userType));
    }

    @Then("User can see Main page url")
    public void userCanSeeMainPageUrl() {
        String mainPageURLActualResult = new MainPage().getPageURL();
        assertThat(mainPageURLActualResult).contains(TestDataReader.getEnvData(MAIN_PAGE_PROPERTY_URL));
    }

    @Then("User can see login error message")
    public void userCanSeeLoginErrorMessage() {
        String loginErrorMessage = new MainPage().getLoginErrorMessage();
        assertThat(loginErrorMessage).contains(UNSUCCESSFUL_LOGIN_MESSAGE);
    }
}