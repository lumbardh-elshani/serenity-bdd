package pages;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 16:22
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScheduleGeneralSettingsPage extends AbstractPage {
    @FindBy(id = "inlineCheckbox1")
    WebElementFacade mondayCheckbox;

    @FindBy(id = "inlineCheckbox2")
    WebElementFacade tuesdayCheckbox;

    @FindBy(id = "inlineCheckbox3")
    WebElementFacade wednesdayCheckbox;

    @FindBy(id = "inlineCheckbox4")
    WebElementFacade thursdayCheckbox;

    @FindBy(id = "inlineCheckbox5")
    WebElementFacade fridayCheckbox;

    @FindBy(id = "inlineCheckbox6")
    WebElementFacade saturdayCheckbox;

    @FindBy(id = "inlineCheckbox7")
    WebElementFacade sundayCheckbox;

    @FindBy(id = "vol")
    WebElementFacade durationSlider;

    @FindBy(id = "touch-spin-1")
    WebElementFacade lessonsPerDayNumber;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-general-schedule-settings/div/div/div/form/div[4]/input")
    WebElementFacade startTimeInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-general-schedule-settings/div/div/div/form/div[5]/input")
    WebElementFacade breakDurationInput;

    @FindBy(id = "touch-spin")
    WebElementFacade breakPerDayInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-general-schedule-settings/div/div/div/form/div[7]/div[1]/button")
    WebElementFacade resetButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-general-schedule-settings/div/div/div/form/div[7]/div[2]/button")
    WebElementFacade saveButton;

    public WebElementFacade getMondayCheckbox() {
        return mondayCheckbox;
    }

    public WebElementFacade getTuesdayCheckbox() {
        return tuesdayCheckbox;
    }

    public WebElementFacade getWednesdayCheckbox() {
        return wednesdayCheckbox;
    }

    public WebElementFacade getThursdayCheckbox() {
        return thursdayCheckbox;
    }

    public WebElementFacade getFridayCheckbox() {
        return fridayCheckbox;
    }

    public WebElementFacade getSaturdayCheckbox() {
        return saturdayCheckbox;
    }

    public WebElementFacade getSundayCheckbox() {
        return sundayCheckbox;
    }

    public WebElementFacade getDurationSlider() {
        return durationSlider;
    }

    public WebElementFacade getLessonsPerDayNumber() {
        return lessonsPerDayNumber;
    }

    public WebElementFacade getStartTimeInput() {
        return startTimeInput;
    }

    public WebElementFacade getBreakDurationInput() {
        return breakDurationInput;
    }

    public WebElementFacade getBreakPerDayInput() {
        return breakPerDayInput;
    }

    public WebElementFacade getResetButton() {
        return resetButton;
    }

    public WebElementFacade getSaveButton() {
        return saveButton;
    }
}
