package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.NavigationSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 18:38
 */
public class NavigationStepDefinitions {

    @Steps
    NavigationSteps navigationSteps;

    @Given("^User is logged in$")
    public void userisLoggedIn() {
        navigationSteps.performLogin();
    }

    @When("^User clicks to profile anchor$")
    public void userClicksToProfileAnchor() {
        navigationSteps.clickProfileButton();
    }

    @Then("^User should see profile page$")
    public void userShouldSeeProfilePage() {

    }


    @When("^User clicks to notification anchor$")
    public void userClicksToNotificationAnchor() {
        navigationSteps.clickNotificationAnchor();
    }

    @Then("^User should see the list of notifications$")
    public void userShouldSeeTheListOfNotifications() {

    }

    @When("^User clicks to calendar anchor$")
    public void userClicksToCalendarAnchor() {
        navigationSteps.clickCalendarAnchor();
    }

    @Then("^User should see the calendar$")
    public void userShouldSeeTheCalendar() {

    }
}
