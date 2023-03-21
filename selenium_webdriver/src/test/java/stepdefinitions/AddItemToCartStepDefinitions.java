package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddItemToCartStepDefinitions {

    @Page
    MainPage mainPage;

    @When("User click Add to cart button")
    public void userClickAddToCartButton() {
        mainPage.clickAddToCartButton();
    }

    @Then("User can see back pack item remove from cart button text")
    public void userCanSeeBackPackItemRemoveFromCartButtonText() {
        String buttonText = mainPage.getSauceLabsBackPackItemRemoveFromCartButtonText();
        assertThat(buttonText).contains("Remove");
    }
}