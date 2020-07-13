package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;
import pages.ScheduleGeneralSettingsPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 16:36
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScheduleSteps {
    @Steps
    LoginSteps loginSteps;

    ScheduleGeneralSettingsPage scheduleGeneralSettingsPage;

    public void performLogin(){
        loginSteps.login();
    }

    public void openScheduleSettings(){
        getWebdriverManager().getWebdriver().get(GlobalConstants.SCHEDULE_SETTINGS_URL);
    }

    public void changeScheduleSettings() {
        if ( !scheduleGeneralSettingsPage.getMondayCheckbox().isSelected() )
        {
            scheduleGeneralSettingsPage.getMondayCheckbox().click();
        }
        else if(!scheduleGeneralSettingsPage.getTuesdayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getTuesdayCheckbox().click();
        }
        else if(!scheduleGeneralSettingsPage.getWednesdayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getWednesdayCheckbox().click();
        }
        else if(!scheduleGeneralSettingsPage.getThursdayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getThursdayCheckbox().click();
        }
        else if(!scheduleGeneralSettingsPage.getFridayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getFridayCheckbox().click();
        }
        else if(scheduleGeneralSettingsPage.getSaturdayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getSaturdayCheckbox().click();
        }
        else if(scheduleGeneralSettingsPage.getSundayCheckbox().isSelected()){
            scheduleGeneralSettingsPage.getSundayCheckbox().click();
        }

        for(int i = 0; i < 20; i++){
            scheduleGeneralSettingsPage.getDurationSlider().sendKeys(Keys.RIGHT);
        }

        scheduleGeneralSettingsPage.getLessonsPerDayNumber().type("5");

        scheduleGeneralSettingsPage.getStartTimeInput().sendKeys("08-30");

        scheduleGeneralSettingsPage.getBreakDurationInput().type("20");

        scheduleGeneralSettingsPage.getBreakPerDayInput().type("4");

    }

    public void saveChangedSettings() {
        scheduleGeneralSettingsPage.getSaveButton().click();
    }

    public void resetSettings() {
        scheduleGeneralSettingsPage.getResetButton().click();
    }
}
