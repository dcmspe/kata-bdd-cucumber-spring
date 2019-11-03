package cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.boot.web.server.LocalServerPort;

public class StepdefsBootstrap {

    @LocalServerPort
    private int port;

    private String baseUrl = "http://localhost:";
    private StepDefsContext context = StepDefsContext.CONTEXT;

    @Given("a client having a valid account")
    public void aClientHavingAValidAccount() {
    }

    @Given("the account balance is (\\-?\\d*\\.?\\d+) euros")
    public void the_account_balance_is_euros(double initialBalance) throws Exception {
    }

    @Given("the card is valid")
    public void the_card_is_valid() throws Exception {

    }

    @Given("the ATM contains enough money")
    public void the_ATM_contains_enough_money() throws Exception {
    }

    @When("the account holder requests {double} euros")
    public void the_account_holder_requests_euros(double amount) throws Exception {

    }

    @Then("the ATM should dispense {double} euros")
    public void the_ATM_should_dispense_euros(double amount) throws Exception {
    }

    @Then("the account balance should be {double} euros")
    public void the_account_balance_should_be_euros(double newBalance) throws Exception {
    }

    @Then("the card should be returned")
    public void the_card_should_be_returned() throws Exception {
    }
}
