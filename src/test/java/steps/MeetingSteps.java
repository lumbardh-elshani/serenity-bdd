package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import pages.CreateMeetingPage;
import pages.EditMeetingPage;
import pages.MeetingsPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 14:01
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeetingSteps {

    @Steps
    LoginSteps loginSteps;

    MeetingsPage meetingsPage;
    CreateMeetingPage createMeetingPage;
    EditMeetingPage editMeetingPage;

    public void performLogin(){
        loginSteps.login();
    }

    public void clickOnCreateANewMeeting() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.MEETINGS_URL);
        meetingsPage.getCreateMeetingButton().click();
    }

    public void fillMeetingForm() {
        createMeetingPage.getMeetingTitleField().type("Online Meeting for Online Lectures");
        createMeetingPage.getMeetingDescriptionField().type("This online meeting is to take a decision for online lecutres");
        createMeetingPage.getMeetingStartDateField().type("12.07.2020, 14:30");
        createMeetingPage.getMeetingEndDateField().type("13.04.2020, 16:00");
        createMeetingPage.getMeetingPlaceField().type("Prishtinë");
        createMeetingPage.getMeetingCommentField().type("Pjesemarres do te jene edhe zyrtaret nga Ministria e Arsimit, Shkences dhe Teknologjise");
        createMeetingPage.getCreatorDropDown().selectByValue("Rinor");
        createMeetingPage.getYesRadioButton().click();

    }

    public void createMeeting() {
        createMeetingPage.getCreateButton().click();
    }

    public void clickOnEditMeetingButton() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.MEETINGS_URL);
        meetingsPage.getEditMeetingButton().click();
    }

    public void editSelectedMeeting() {
        //editMeetingPage.getNoRadioButton().click();
    }

    public void saveEditedMeeting() {
        //editMeetingPage.getEditButton().click();
    }

    public void deleteAMeeting() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.MEETINGS_URL);
        meetingsPage.getDeleteMeetingButton().click();
    }
}
