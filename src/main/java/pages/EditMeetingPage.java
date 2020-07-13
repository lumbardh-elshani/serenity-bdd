package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 14:42
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EditMeetingPage {

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[1]")
    WebElementFacade meetingTitleField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[2]")
    WebElementFacade meetingDescriptionField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[3]")
    WebElementFacade meetingStartDateField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[4]")
    WebElementFacade meetingEndDateField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[5]")
    WebElementFacade meetingPlaceField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/input[6]")
    WebElementFacade meetingCommentField;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/div[1]/div/select")
    WebElementFacade creatorDropDown;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/div[2]/label[1]/input")
    WebElementFacade yesRadioButton;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/div[2]/label[2]/input")
    WebElementFacade noRadioButton;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/div[3]/button[2]")
    WebElementFacade editButton;

    @FindBy(xpath = "/html/body/app-root/app-edit-meeting/div/div/div[3]/button[1]")
    WebElementFacade cancelButton;

    public WebElementFacade getMeetingTitleField() {
        return meetingTitleField;
    }

    public WebElementFacade getMeetingDescriptionField() {
        return meetingDescriptionField;
    }

    public WebElementFacade getMeetingStartDateField() {
        return meetingStartDateField;
    }

    public WebElementFacade getMeetingEndDateField() {
        return meetingEndDateField;
    }

    public WebElementFacade getMeetingPlaceField() {
        return meetingPlaceField;
    }

    public WebElementFacade getMeetingCommentField() {
        return meetingCommentField;
    }

    public WebElementFacade getCreatorDropDown() {
        return creatorDropDown;
    }

    public WebElementFacade getYesRadioButton() {
        return yesRadioButton;
    }

    public WebElementFacade getNoRadioButton() {
        return noRadioButton;
    }

    public WebElementFacade getEditButton() {
        return editButton;
    }

    public WebElementFacade getCancelButton() {
        return cancelButton;
    }
}
