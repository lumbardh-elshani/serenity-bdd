package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import pages.PresencePage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:14
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PresenceSteps {
    @Steps
    LoginSteps loginSteps;

    PresencePage presencePage;

    public void performLogin() {
        loginSteps.login();
    }

    public void openPresencePage() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.PRESENCE_URL);
    }

    public void setPresenceToPresentStudens() {
        presencePage.getPresentButton().click();
        presencePage.getMissingButton().click();
    }

    public void savePresenceToDatabase() {
        presencePage.getSaveButton().click();
    }
}
