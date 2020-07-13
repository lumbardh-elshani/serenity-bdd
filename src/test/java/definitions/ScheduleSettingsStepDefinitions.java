package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ScheduleSettingsSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 16:35
 */
public class ScheduleSettingsStepDefinitions {
    @Steps
    ScheduleSettingsSteps scheduleSettingsSteps;

    @Given("^User wants to change schedule settings$")
    public void userWantsToChangeScheduleSettings() {
        scheduleSettingsSteps.performLogin();
    }

    @When("^User goes to schedule setting page$")
    public void userGoesToScheduleSettingPage() {
        scheduleSettingsSteps.openScheduleSettings();
    }

    @And("^Changes the settings$")
    public void userChangesTheSettings() {
        scheduleSettingsSteps.changeScheduleSettings();
    }

    @And("^User saves the changed settings$")
    public void userSavesTheChangedSettings() {
        scheduleSettingsSteps.saveChangedSettings();
    }

    @Then("^Schedule settings should be changed$")
    public void scheduleSettingsShouldBeChanged() {
    }

    @Given("^User wants to reset schedule settings to default$")
    public void userWantsToResetScheduleSettingsToDefault() {
        scheduleSettingsSteps.performLogin();
    }

    @When("^User goes to schedule setting page to reset the settings$")
    public void userGoesToScheduleSettingPageToResetTheSettings() {
        scheduleSettingsSteps.openScheduleSettings();
    }

    @And("^Cliks reset button$")
    public void cliksToResetButton() {
        scheduleSettingsSteps.resetSettings();
    }

    @Then("^Schedule settings should be reset$")
    public void scheduleSettingsShouldBeReset() {
    }


}
