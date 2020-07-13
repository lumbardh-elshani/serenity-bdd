package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MeetingSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 14:00
 */
public class MeetingStepDefinitions {
    @Steps
    MeetingSteps meetingSteps;

    @Given("^User wants to create a new online meeting$")
    public void userWantsToCreateANewOnlineMeeting() {
        meetingSteps.performLogin();
    }

    @When("^User clicks to create a new meeting$")
    public void userClicksToCreateANewMeeting() {
        meetingSteps.clickOnCreateANewMeeting();
    }

    @Then("^User should be able to fill the meeting form$")
    public void userShouldBeAbleToFillTheMeetingForm() {
        meetingSteps.fillMeetingForm();
    }

    @And("^User should save the meeting information$")
    public void userShouldSaveTheMeetingInformation() {
        meetingSteps.createMeeting();
    }

    @Given("^User wants to edit a meeting$")
    public void userWantsToEditAMeeting() {
        meetingSteps.performLogin();
    }

    @When("^User selects the meeting and clicks on Edit Button$")
    public void userSelectsTheMeetingAndClickOnEditButton() {
        meetingSteps.clickOnEditMeetingButton();
    }

    @Then("^User should be able to edit that meeting$")
    public void userShouldBeAbleToEditThatMeeting() {
        meetingSteps.editSelectedMeeting();
    }

    @And("^User should save edited information$")
    public void userShouldSaveEditedInformation() {
        meetingSteps.saveEditedMeeting();
    }

    @Given("^User wants to delete a meeting$")
    public void userWantsToDeleteAMeeting() {
        meetingSteps.performLogin();
    }

    @When("^User selects the meeting and clicks on Delete Button$")
    public void userSelectsTheMeetingAndClicksOnDeleteButton() {
        meetingSteps.deleteAMeeting();
    }

    @Then("^that meeting should be deleted$")
    public void thatMeetingShouldBeDeleted() {
    }
}
