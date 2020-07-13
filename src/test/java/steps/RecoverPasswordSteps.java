package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import pages.LoginPage;
import pages.RecoverPasswordPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 21:50
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RecoverPasswordSteps {
    LoginPage loginPage;
    RecoverPasswordPage recoverPasswordPage;

    public void goToLogin() {
        getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.LOGIN_URL);
    }

    public void clickOnForgotPassword() {
        loginPage.getForgotPasswordButton().click();
    }

    public void writeEmailToRecoverPassword() {
        recoverPasswordPage.getForgotPasswordEmailInput().type(GlobalConstants.VALID_EMAIL);
    }

    public void clickOnForgotPasswordToRecover() {
        recoverPasswordPage.getGetForgotPasswordEmailButton().click();
    }
}
