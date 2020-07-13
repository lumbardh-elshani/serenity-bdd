package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 20:36
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateDateBasedSchedulePage extends  CreateSchedulePage{
    @FindBy(id = "datepicker")
    WebElementFacade dateInputField;

    @FindBy(id = "slots")
    WebElementFacade slotsDropDown;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/div/app-create-schedule-date-based/form/div[2]/div[1]/button")
    WebElementFacade resetButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/div/app-create-schedule-date-based/form/div[2]/div[2]/button")
    WebElementFacade saveButton;

    public WebElementFacade getDateInputField() {
        return dateInputField;
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
