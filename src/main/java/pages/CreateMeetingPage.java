package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.nio.file.WatchEvent;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 22:01
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateMeetingPage extends AbstractPage{

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[1]")
    WebElementFacade meetingTitleField;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[2]")
    WebElementFacade meetingDescriptionField;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[3]")
    WebElementFacade meetingStartDateField;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[4]")
    WebElementFacade meetingEndDateField;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[5]")
    WebElementFacade meetingPlace;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/input[6]")
    WebElementFacade meetingComment;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/div[1]/div/select")
    WebElementFacade creatorDropDown;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/div[2]/label[1]/input")
    WebElementFacade yesRadioButton;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/div[2]/label[2]/input")
    WebElementFacade noRadioButton;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/div[3]/button[2]")
    WebElementFacade createButton;

    @FindBy(xpath = "/html/body/app-root/app-create-meeting/div/div/div[3]/button[1]")
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

    public WebElementFacade getMeetingPlace() {
        return meetingPlace;
    }

    public WebElementFacade getMeetingComment() {
        return meetingComment;
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

    public WebElementFacade getCreateButton() {
        return createButton;
    }

    public WebElementFacade getCancelButton() {
        return cancelButton;
    }
}
