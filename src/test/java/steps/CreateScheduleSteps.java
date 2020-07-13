package steps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import pages.CreateDateBasedSchedulePage;
import pages.CreatePeriodicSchedulePage;
import pages.CreateSchedulePage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 20:44
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateScheduleSteps {
    @Steps
    LoginSteps loginSteps;

    CreateSchedulePage createSchedulePage;
    CreateDateBasedSchedulePage createDateBasedSchedulePage;
    CreatePeriodicSchedulePage createPeriodicSchedulePage;

    public void performLogin(){
        loginSteps.login();
    }

    public void openCreateDateBasedSchedulePage() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.SCHEDULE_CREATE_URL);
        createSchedulePage.getDateBasedButton().click();
    }

    public void createDateBasedSchedule() {
        createDateBasedSchedulePage.getDateInputField().type("Monday");
        createDateBasedSchedulePage.getSlotsDropDown().selectByValue("3");
        createDateBasedSchedulePage.getDateInputField().type("Wednesday");
        createDateBasedSchedulePage.getSlotsDropDown().selectByValue("2");
    }

    public void saveDateBasedSchedule() {
        createDateBasedSchedulePage.getSaveButton().click();
    }

    public void resetDateBasedSchedule() {
        createDateBasedSchedulePage.getResetButton().click();
    }

    public void openCreatePeriodicSchedulePage() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.SCHEDULE_CREATE_URL);
        createSchedulePage.getPeriodicBasedButton().click();
    }

    public void createPeriodicSchedule() {
        if ( !createPeriodicSchedulePage.getMondayCheckbox().isSelected() ) {
            createPeriodicSchedulePage.getMondayCheckbox().click();
        }
        if(!createPeriodicSchedulePage.getTuesdayCheckbox().isSelected()){
            createPeriodicSchedulePage.getTuesdayCheckbox().click();
        }
        if(!createPeriodicSchedulePage.getWednesdayCheckbox().isSelected()){
            createPeriodicSchedulePage.getWednesdayCheckbox().click();
        }
        if(!createPeriodicSchedulePage.getThursdayCheckbox().isSelected()){
            createPeriodicSchedulePage.getThursdayCheckbox().click();
        }
        if(!createPeriodicSchedulePage.getFridayCheckbox().isSelected()){
            createPeriodicSchedulePage.getFridayCheckbox().click();
        }
        if(createPeriodicSchedulePage.getSaturdayCheckbox().isSelected()){
            createPeriodicSchedulePage.getSaturdayCheckbox().click();
        }
        if(createPeriodicSchedulePage.getSundayCheckbox().isSelected()){
            createPeriodicSchedulePage.getSundayCheckbox().click();
        }
        createPeriodicSchedulePage.getSlotsDropDown().selectByValue("3");
    }

    public void savePeriodicSchedule() {
        createPeriodicSchedulePage.getSaveButton().click();
    }

    public void resetPeriodicSchedule() {
        createPeriodicSchedulePage.getResetButton().click();
    }
}
