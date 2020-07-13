package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 20:33
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateSchedulePage extends AbstractPage{
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/ul/li[2]/a")
    WebElementFacade dateBasedButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-create-schedule/div/div/div/form/div/ul/li[1]/a")
    WebElementFacade periodicBasedButton;

    public WebElementFacade getDateBasedButton() {
        return dateBasedButton;
    }

    public WebElementFacade getPeriodicBasedButton() {
        return periodicBasedButton;
    }
}
