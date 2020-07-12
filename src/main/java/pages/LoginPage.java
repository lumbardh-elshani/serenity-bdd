package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage extends AbstractPage {

    @FindBy(id = "loginEmail")
    WebElementFacade emailInput;

    @FindBy(id = "loginPassword")
    WebElementFacade passwordInput;

    public WebElementFacade getEmailInput() {
        return emailInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    @FindBy(xpath = "/html/body/app-root/app-auth/section/div/div/div/app-login/div/div/form/button")
    WebElementFacade loginButton;
}