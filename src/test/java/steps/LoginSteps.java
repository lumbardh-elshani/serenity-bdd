package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.steps.ScenarioSteps;
import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    public void login(){
        openLoginPage(GlobalConstants.LOGIN_URL);
        fillEmailAndPassword(GlobalConstants.VALID_EMAIL, GlobalConstants.VALID_PASS);
        clickLoginButton();
    }

    public void openLoginPage(String loginURL){
        getWebdriverManager().getWebdriver().get(loginURL);
    }

    public void fillEmailAndPassword(String email, String pass){
        loginPage.getEmailInput().type(email);
        loginPage.getPasswordInput().type(pass);

    }

    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }

    public void shouldSeeDashboard(){
        //getWebdriverManager().getWebdriver().navigate().to(GlobalConstants.DASHBOARD_URL);
    }

    public void verifyThatUserIsLoggedIn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String URL = getWebdriverManager().getWebdriver().getCurrentUrl();
        Assert.assertThat(URL, Matchers.equalTo(GlobalConstants.DASHBOARD_URL));
    }
}
