package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.SignUpPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/11/2020, @time 13:58
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpSteps {

    SignUpPage signUpPage;

    public void navigateTo(String arg0) {
        getWebdriverManager().getWebdriver().manage().window().maximize();
        getWebdriverManager().getWebdriver().get(arg0);
    }

    public void fillSignUpForm(){
        signUpPage.getFirsNameField().type("Lumbardh");
        signUpPage.getLastNameField().type("Elshani");
        signUpPage.getRoleDropDown().selectByValue("STUDENT");
        //Kontrollo se si me selectu date ne datepicker me webdriver
        //signUpPage.getBirthDateDatePicker().type("02/02/2000");
        signUpPage.getGenderDropDown().selectByValue("MALE");
        signUpPage.getEmailField().type("lumbardhelshani00@gmail.com");
        signUpPage.getPasswordField().type("testtest");
        signUpPage.getSignUpButton().click();
    }


    public void redirectTo(String arg0) {
        getWebdriverManager().getWebdriver().manage().window().maximize();
        getWebdriverManager().getWebdriver().get(arg0);
    }
}
