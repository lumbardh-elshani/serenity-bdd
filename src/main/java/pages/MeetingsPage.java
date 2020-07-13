package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 13:56
 */
public class MeetingsPage extends AbstractPage{
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div/div[2]/div/div/a")
    WebElementFacade createMeetingButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/app-meeting-item[1]/div/div/div[3]/button[1]")
    WebElementFacade editMeetingButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/app-meeting-item[1]/div/div/div[3]/button[2]")
    WebElementFacade deleteMeetingButton;

    public WebElementFacade getCreateMeetingButton() {
        return createMeetingButton;
    }

    public WebElementFacade getEditMeetingButton() {
        return editMeetingButton;
    }

    public WebElementFacade getDeleteMeetingButton() {
        return deleteMeetingButton;
    }
}
