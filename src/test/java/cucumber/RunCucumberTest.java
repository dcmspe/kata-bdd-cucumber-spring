package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import pt.tabajara_airflights.services.LoginService;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
            "pretty",
            "json:target/cucumber/cucumber.json",
            "json:build/cucumber/cucumber.json",
            "de.monochromata.cucumber.report.PrettyReports:build/cucumber/monochromata",
            "de.monochromata.cucumber.report.PrettyReports:target/cucumber/monochromata"
    },
    features = {
            "features"
    },
    glue = {
        "cucumber/stepdefs",
        "cucumber/config"
    }
)
public class RunCucumberTest {

    /*@Given("the user has provided a valid {String} and {String}")
    public void the_user_has_provided_a_valid_user_and_password(String user, String password) {
        this.loginService = Mockito.mock(LoginService.class);
    }

    @Given("the login generated a valid token session")
    public void the_login_generated_a_valid_token_session() {
        Mockito.when(loginService.login()).thenReturn("WASDFGJHGHJLRTYRTYRYRYDFGDG");

        this.loginToken = loginService.login(user, password);
    }

    @Given("the user has a flight to checkin")
    public void the_user_has_a_flight_to_checkin() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user make a checkin validation")
    public void the_user_make_a_checkin_validation() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("he needs to receive a valid notification that he made a check-in")
    public void he_needs_to_receive_a_valid_notification_that_he_made_a_check_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }*/
}