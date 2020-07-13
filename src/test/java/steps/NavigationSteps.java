package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import pages.HomePage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 18:40
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NavigationSteps {
    @Steps
    LoginSteps loginSteps;
    DashboardPage dashboardPage;
    HomePage homePage;

    public void performLogin(){
        loginSteps.login();
    }

    public void clickProfileButton(){
        dashboardPage.getDropDownButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dashboardPage.getProfileButton().click();
    }

    public void clickNotificationAnchor(){
        dashboardPage.getNotificationAnchor().click();
    }

    public void clickCalendarAnchor(){
        dashboardPage.getCalendarAnchor().click();
    }

    public void navigateToProfilePage() {
        getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.PROFILE_URL);
    }

    public void navigateToNotificationPage() {
        getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.NOTIFICATION_URL);
    }

    public void navigateToCalendarPage() {
        getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.CALENDAR_URL);
    }


    public void navigateToHomePage() {
        getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.HOMEPAGE_URL);
    }

    public void clickLoginButton() {
        homePage.getHomepageLoginButton().click();
    }

    public void clickRegisterButton() {
        homePage.getHomepageRegisterButton().click();
    }
}
