package steps;

import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:38
 */
public class GradeBookSteps {
    @Steps
    LoginSteps loginSteps;

    public void performLogin(){
        loginSteps.login();
    }

    public void goToGradeBook() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.GRADE_BOOK_URL);
    }
}
