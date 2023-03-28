package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddItemToCartStepDefinitions {

    @Step("User click Add to cart button")
    @When("User click Add to cart button")
    public void userClickAddToCartButton() {
        new MainPage().clickAddToCartButton();
    }

    @Step("User can see back pack item remove from cart button text")
    @Then("User can see back pack item remove from cart button text")
    public void userCanSeeBackPackItemRemoveFromCartButtonText() {
        String buttonText = new MainPage().getSauceLabsBackPackItemRemoveFromCartButtonText();
        assertThat(buttonText).contains("Remove");
    }
}