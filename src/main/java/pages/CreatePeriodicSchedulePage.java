package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 21:06
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreatePeriodicSchedulePage extends CreateSchedulePage{
    @FindBy(id = "touch-spin-1")
    WebElementFacade periodLengthDropDown;

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

    @FindBy(id = "slots")
    WebElementFacade slotsDropDown;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/div/app-create-schedule-periodic/form/div[2]/div[1]/button")
    WebElementFacade resetButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/div/app-create-schedule-periodic/form/div[2]/div[2]/button")
    WebElementFacade saveButton;

    public WebElementFacade getPeriodLengthDropDown() {
        return periodLengthDropDown;
    }

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

    public WebElementFacade getSlotsDropDown() {
        return slotsDropDown;
    }

    public WebElementFacade getResetButton() {
        return resetButton;
    }

    public WebElementFacade getSaveButton() {
        return saveButton;
    }
}
