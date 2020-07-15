package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.vavr.API;
import net.thucydides.core.annotations.Steps;
import steps.APIActivitySteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 19:50
 */
public class ActivityStepDefinitions {
    @Steps
    APIActivitySteps APIActivitySteps;

    @Given("^User wants to get an activity with id \"([^\"]*)\"")
    public void userWantsToAnActivityWithID(String activityID)  {
        APIActivitySteps.getActivityWithID(activityID);
    }

    @Then("^User should get that activity$")
    public void userShouldGetThatActivity() {
    }

    @Given("^User wants to create an activity with name \"([^\"]*)\" and description \"([^\"]*)\"$")
    public void userWantsToCreateAnActivityWithNameAndDescription(String name, String description) {
        APIActivitySteps.createActivity(name, description);

    }

    @Then("^That activity should be created$")
    public void thatActivityShouldBeCreated() {
    }

    @Given("^User wants to edit an activity with id \"([^\"]*)\"$")
    public void userWantsToEditAnActivityWithId(String activityID) {
        APIActivitySteps.editActivityWithID(activityID);

    }

    @Then("^That activity should be edited$")
    public void thatActivityShouldBeEdited() {
    }

    @Given("^User wants to delete an activity with id \"([^\"]*)\"$")
    public void userWantsToDeleteAnActivityWithId(String activityID){
        APIActivitySteps.deleteActivityWithID(activityID);

    }

    @Then("^That activity should be deleted$")
    public void thatActivityShouldBeDeleted() {
    }
}
