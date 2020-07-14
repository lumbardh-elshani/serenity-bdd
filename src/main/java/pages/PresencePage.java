package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:06
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PresencePage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-presence/div/div/div/table/tr[1]/td[3]/button")
    WebElementFacade presentButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-presence/div/div/div/table/tr[3]/td[3]/button")
    WebElementFacade missingButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/app-presence/div/div/div/div[1]/button")
    WebElementFacade saveButton;


    public WebElementFacade getPresentButton() {
        return presentButton;
    }

    public WebElementFacade getMissingButton() {
        return missingButton;
    }

    public WebElementFacade getSaveButton() {
        return saveButton;
    }
}
