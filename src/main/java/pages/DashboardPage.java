package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 16:13
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DashboardPage extends AbstractPage{


    @FindBy(xpath = "/html/body/app-root/app-dashboard/section/app-header/div/div[1]/div[2]/div[2]/div[1]/button")
    WebElementFacade dropDownButton;

    @FindBy(linkText = "Log out")
    WebElementFacade logOutButton;

    @FindBy(linkText = "Profile")
    WebElementFacade profileButton;

    @FindBy(linkText = "Notification")
    WebElementFacade notificationAnchor;

    @FindBy(linkText = "Calendar")
    WebElementFacade calendarAnchor;

    public WebElementFacade getDropDownButton() { return dropDownButton; }

    public WebElementFacade getLogOutButton() {
        return logOutButton;
    }

    public WebElementFacade getProfileButton() {
        return profileButton;
    }

    public WebElementFacade getNotificationAnchor() {
        return notificationAnchor;
    }

    public WebElementFacade getCalendarAnchor() {
        return calendarAnchor;
    }
}
