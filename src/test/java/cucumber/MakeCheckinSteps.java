package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import pt.tabajara_airflights.models.Flight;
import pt.tabajara_airflights.models.User;
import pt.tabajara_airflights.services.FlightService;
import pt.tabajara_airflights.services.LoginService;

import java.util.ArrayList;
import java.util.List;

public class MakeCheckinSteps{
    @Mock
    private LoginService loginService;

    @Mock
    private FlightService flightService;

    private User userLogged;

    private Flight flight;

    String checkInMessage;

    @Given("the user has made a valid login with an {user} and {password}")
    public void the_user_has_made_a_valid_login_with_an_user_and_password(String user, String password) {
        this.loginService = Mockito.mock(LoginService.class);

        System.out.println("User:"+user);

        Mockito.when(loginService.login(user, password)).thenReturn(
                new User(user, password, "WASDFGJHGHJLRTYRTYRYRYDFGDG"));

        this.userLogged = loginService.login(user, password);
    }

    @Given("the user has a flight to checkin")
    public void the_user_has_a_flight_to_checkin() {
        this.flightService = Mockito.mock(FlightService.class);

        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight(userLogged, "LISBON:FLIGHT_MOCK"));

        Mockito.when(flightService.getFlightsByUser(userLogged)).thenReturn(flights);

        this.flight = flightService.getFlightsByUser(userLogged).get(0);

    }

    @When("the user make a checkin validation")
    public void the_user_make_a_checkin_validation() {

        Mockito.when(flightService.checkIn(this.flight.getBoardingPass())).thenReturn("The checkin was made with success!");

        String checkInMessage = flightService.checkIn(this.flight.getBoardingPass());
    }

    @Then("he needs to receive a valid notification that he made a check-in")
    public void he_needs_to_receive_a_valid_notification_that_he_made_a_check_in() {
        Assert.assertEquals("The checkin was made with success!", checkInMessage);
    }

}
