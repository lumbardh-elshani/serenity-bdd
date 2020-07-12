package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lombok.Getter;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

/**
 * Created by Ardit Podrimaj
 */

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^User is logged in$")
    public void userIsLoggedIn() {
        loginSteps.login();
    }


    @Then("^User should see Dashboard$")
    public void userShouldSeeDashboard() {
    }

}