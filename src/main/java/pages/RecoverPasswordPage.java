package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 21:48
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RecoverPasswordPage extends AbstractPage{
    @FindBy(id = "forgotPasswordEmail")
    WebElementFacade forgotPasswordEmailInput;

    @FindBy(xpath = "/html/body/app-root/app-auth/section/div/div/div/app-forgot-password/div/div/form/button")
    WebElementFacade getForgotPasswordEmailButton;

    public WebElementFacade getForgotPasswordEmailInput() {
        return forgotPasswordEmailInput;
    }

    public WebElementFacade getGetForgotPasswordEmailButton() {
        return getForgotPasswordEmailButton;
    }
}
