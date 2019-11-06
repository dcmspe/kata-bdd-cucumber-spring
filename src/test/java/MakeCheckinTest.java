import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.mockito.Mock;
import org.mockito.Mockito;
import pt.tabajara_airflights.services.LoginService;

public class MakeCheckinTest {

    @Mock
    private LoginService loginService;

    @Mock
    private FlightService flightService;

    private String loginToken;

    @Given("the user has made a valid login with an {user} and {password}")
    public void the_user_has_made_a_valid_login_with_an_user_and_password(String user, String password) {
        this.loginService = Mockito.mock(LoginService.class);

        Mockito.when(loginService.login(user, password)).thenReturn("WASDFGJHGHJLRTYRTYRYRYDFGDG");

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
    }
}
