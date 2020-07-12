package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;

import java.util.concurrent.TimeUnit;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 16:43
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LogOutSteps {

    @Steps
    LoginSteps loginSteps;
    DashboardPage dashboardPage;

    public void performLogin(){
        loginSteps.login();
    }

    public void clickLogOutButton() {
        dashboardPage.getDropDownButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dashboardPage.getLogOutButton().click();
    }

    public void redirectToHomepage() {

    }
}
