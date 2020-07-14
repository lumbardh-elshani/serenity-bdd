package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CreateScheduleSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 20:43
 */
public class CreateScheduleStepDefinitions {
    @Steps
    CreateScheduleSteps createScheduleSteps;

    @Given("^Student wants to create a date based schedule$")
    public void userWantsToCreateADateBasedSchedule() {
        createScheduleSteps.performLogin();
    }

    @When("^Student opens page to create a date based schedule$")
    public void userOpensPageToCreateADateBasedSchedule() {
        createScheduleSteps.openCreateDateBasedSchedulePage();
    }

    @And("^Fills the form to create the date based schedule$")
    public void fillsTheFormToCreateTheDateBasedSchedule() {
        createScheduleSteps.createDateBasedSchedule();
    }

    @And("^Cliks button to save the schedule$")
    public void cliksButtonToSaveTheSchedule() {
        createScheduleSteps.saveDateBasedSchedule();
    }

    @Then("^The schedule should be saved$")
    public void theScheduleShouldBeSaved() {
    }

    @Given("^Student wants to reset the date based schedule to default values$")
    public void userWantsToResetTheDateBasedScheduleToDefaultValues() {
        createScheduleSteps.performLogin();
    }

    @When("^Student opens date based schedule page$")
    public void userOpensDateBasedSchedulePage() {
        createScheduleSteps.openCreateDateBasedSchedulePage();
    }

    @And("^Cliks reset button to change the values to default$")
    public void cliksResetButtonToChangeTheValuesToDefault() {
        createScheduleSteps.resetDateBasedSchedule();
    }

    @Then("^The schedule should be reset$")
    public void theScheduleShouldBeReset() {
    }

    @Given("^Student wants to create a periodic schedule$")
    public void userWantsToCreateAPeriodicSchedule() {
        createScheduleSteps.performLogin();
    }

    @When("^Student opens page to create a periodic schedule$")
    public void userOpensPageToCreateAPeriodicSchedule() {
        createScheduleSteps.openCreatePeriodicSchedulePage();
    }

    @And("^Fills the form to create a periodic schedule$")
    public void fillsTheFormToCreateAPeriodicSchedule() {
        createScheduleSteps.createPeriodicSchedule();
    }

    @And("^Cliks button to save the periodic schedule$")
    public void cliksButtonToSaveThePeriodicSchedule() {
        createScheduleSteps.savePeriodicSchedule();
    }

    @Then("^The periodic schedule should be saved$")
    public void thePeriodicScheduleShouldBeSaved() {
    }

    @Given("^Student wants to reset the periodic schedule to default values$")
    public void userWantsToResetThePeriodicScheduleToDefaultValues() {
        createScheduleSteps.performLogin();
    }

    @When("^Student opens periodic schedule page$")
    public void userOpensPeriodicSchedulePage() {
        createScheduleSteps.openCreatePeriodicSchedulePage();
    }

    @And("^Clicks reset button for periodic schedule$")
    public void clicksResetButtonForPeriodicSchedule() {
        createScheduleSteps.resetPeriodicSchedule();
    }

    @Then("^The periodic schedule should be reset$")
    public void thePeriodicScheduleShouldBeReset() {
    }
}
