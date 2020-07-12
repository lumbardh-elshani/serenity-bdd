package pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/11/2020, @time 13:51
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpPage extends AbstractPage{
    @FindBy(id = "registerFirstName")
    WebElementFacade firsNameField;

    @FindBy(id = "registerLastName")
    WebElementFacade lastNameField;

    @FindBy(id = "role")
    WebElementFacade roleDropDown;

    @FindBy(id = "registerBirthDate")
    WebElementFacade birthDateDatePicker;

    @FindBy(id = "gender")
    WebElementFacade genderDropDown;

    @FindBy(id = "registerEmail")
    WebElementFacade emailField;

    @FindBy(id = "registerPassword")
    WebElementFacade passwordField;


    public WebElementFacade getFirsNameField() {
        return firsNameField;
    }

    public WebElementFacade getLastNameField() {
        return lastNameField;
    }

    public WebElementFacade getRoleDropDown() {
        return roleDropDown;
    }

    public WebElementFacade getBirthDateDatePicker() {
        return birthDateDatePicker;
    }

    public WebElementFacade getGenderDropDown() {
        return genderDropDown;
    }

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getSignUpButton() {
        return signUpButton;
    }

    @FindBy(id = "registerButton")
    WebElementFacade signUpButton;
}
