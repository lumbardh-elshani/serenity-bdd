package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LogOutSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 16:22
 */
public class LogOutStepDefinitions {

    @Steps
    LogOutSteps logOutSteps;

    @Given("^User logged in the system$")
    public void userLoggedInTheSystem() {
        logOutSteps.performLogin();
    }

    @When("^User clicks logout button$")
    public void userClicksLogoutButton() {
        logOutSteps.clickLogOutButton();
    }

    @Then("^User should be logged out$")
    public void userShouldBeLoggedOut() {

    }

    @And("^see  homepage$")
    public void seeHomepage() {
        logOutSteps.redirectToHomepage();
    }
}
