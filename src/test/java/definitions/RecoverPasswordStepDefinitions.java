package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RecoverPasswordSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 21:47
 */
public class RecoverPasswordStepDefinitions {
    @Steps
    RecoverPasswordSteps recoverPasswordSteps;

    @Given("^User that forgot the password$")
    public void userThatForgotThePassword() {
        recoverPasswordSteps.goToLogin();
    }

    @When("^User clicks forgot password button on Login Page$")
    public void userClicksForgotPasswordButtonOnLoginPage() {
        recoverPasswordSteps.clickOnForgotPassword();
    }

    @Then("^User should see the Recover Password page$")
    public void userShouldSeeTheRecoverPasswordPage() {
    }

    @When("^User writes the email$")
    public void userWritesTheEmail() {
        recoverPasswordSteps.writeEmailToRecoverPassword();
    }

    @And("^Clicks Forgot Password\\? Button$")
    public void clicksForgotPasswordButton() {
        recoverPasswordSteps.clickOnForgotPasswordToRecover();
    }

    @Then("^User should get an email to recover password$")
    public void userShouldGetAnEmailToRecoverPassword() {
    }
}
