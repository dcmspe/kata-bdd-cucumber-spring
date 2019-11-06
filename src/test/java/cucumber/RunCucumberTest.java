package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import pt.tabajara_airflights.models.Flight;
import pt.tabajara_airflights.models.User;
import pt.tabajara_airflights.services.FlightService;
import pt.tabajara_airflights.services.LoginService;

import java.util.ArrayList;
import java.util.List;

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

}