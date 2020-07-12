package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import steps.SignUpSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/11/2020, @time 14:06
 */
public class SignUpStepDefinitions {
    @Steps
    SignUpSteps signUpSteps;

    @Given("^User with valid personal details$")
    public void userIsLoggedIn() {

    }

    @When("^User navigates to \"([^\"]*)\"$")
    public void userNavigatesTo(String arg0) throws Throwable {
        signUpSteps.navigateTo(arg0);
    }

    @And("^User fills SingUp Form$")
    public void userFillsSignUpForm(){
        signUpSteps.fillSignUpForm();
    }

    @Then("^User should be redirected to \"([^\"]*)\"$")
    public void userShouldBeRedirectedTo(String arg0) throws Throwable {
        signUpSteps.redirectTo(arg0);
    }
}
