package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ScheduleSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 16:35
 */
public class ScheduleStepDefinitions {
    @Steps
    ScheduleSteps scheduleSteps;

    @Given("^User wants to change schedule settings$")
    public void userWantsToChangeScheduleSettings() {
        scheduleSteps.performLogin();
    }

    @When("^User goes to schedule setting page$")
    public void userGoesToScheduleSettingPage() {
        scheduleSteps.openScheduleSettings();
    }

    @And("^Changes the settings$")
    public void userChangesTheSettings() {
        scheduleSteps.changeScheduleSettings();
    }

    @And("^User saves the changed settings$")
    public void userSavesTheChangedSettings() {
        scheduleSteps.saveChangedSettings();
    }

    @Then("^Schedule settings should be changed$")
    public void scheduleSettingsShouldBeChanged() {
    }

    @Given("^User wants to reset schedule settings to default$")
    public void userWantsToResetScheduleSettingsToDefault() {
        scheduleSteps.performLogin();
    }

    @When("^User goes to schedule setting page to reset the settings$")
    public void userGoesToScheduleSettingPageToResetTheSettings() {
        scheduleSteps.openScheduleSettings();
    }

    @And("^Cliks reset button$")
    public void cliksToResetButton() {
        scheduleSteps.resetSettings();
    }

    @Then("^Schedule settings should be reset$")
    public void scheduleSettingsShouldBeReset() {
    }


}
