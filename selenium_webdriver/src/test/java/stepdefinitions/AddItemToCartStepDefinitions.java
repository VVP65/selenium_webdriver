package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddItemToCartStepDefinitions {

    @When("User click Add to cart button")
    public void userClickAddToCartButton() {
        new MainPage().clickAddToCartButton();
    }

    @Then("User can see back pack item remove from cart button text")
    public void userCanSeeBackPackItemRemoveFromCartButtonText() {
        String buttonText = new MainPage().getSauceLabsBackPackItemRemoveFromCartButtonText();
        assertThat(buttonText).contains("Remove");
    }
}