package hu.masterfield.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TescoSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("i search a {string} word in search bar")
    public void iSearchAWordInSearchBar(String product) {
    }

    @Then("i should see the {string} product")
    public void iShouldSeeTheProduct(String product) {
    }
}
