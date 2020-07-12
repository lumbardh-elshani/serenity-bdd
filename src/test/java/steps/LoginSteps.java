package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.steps.ScenarioSteps;
import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    @Managed
    WebDriver driver;
    public void login(){

        getWebdriverManager().getWebdriver().manage().window().maximize();
        getWebdriverManager().getWebdriver().get("http://localhost:4200/auth/login");
        loginPage.getEmailInput().type("lumbardhelshani00@gmail.com ");
        loginPage.getPasswordInput().type("1111");
        loginPage.getLoginButton().click();
        driver.
    }
}