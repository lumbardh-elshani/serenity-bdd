package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/11/2020, @time 13:42
 */
public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^User ready to login with valid credentials$")
    public void userReadyToLoginWithValidCredentials() {

    }

    @When("^User goes to \"([^\"]*)\"$")
    public void userGoesTo(String loginURL) throws Throwable {
        loginSteps.openLoginPage(loginURL);
    }

    @And("^User writes \"([^\"]*)\" for email address field and \"([^\"]*)\" for password$")
    public void userWritesForEmailAddressFieldAndForPassword(String email, String pass) throws Throwable {
        loginSteps.fillEmailAndPassword(email, pass);
    }

    @And("^User clicks login button$")
    public void userClicksLoginButton() {
        loginSteps.clickLoginButton();
    }

    @Then("^User should be logged in and see dashboard$")
    public void heShouldBeLoggedInAndSeeDashboard() {
        loginSteps.shouldSeeDashboard();
    }

    @Given("^User with invalid credentials and opened browser on \"([^\"]*)\"$")
    public void userWithInvalidCredentialsAndOpenedBrowserOn(String loginURL) throws Throwable {
        loginSteps.openLoginPage(loginURL);
    }

    @When("^User type \"([^\"]*)\" for email address and \"([^\"]*)\" for password$")
    public void userTypeForEmailAddressAndForPassword(String email, String pass) throws Throwable {
        loginSteps.fillEmailAndPassword(email, pass);
        loginSteps.clickLoginButton();
    }

    @Then("^User shouldn't be able to log in$")
    public void userShouldnTBeAbleToLogIn() {
        
    }

    @And("^User should see an alert$")
    public void heShouldSeeAnAlert() {

    }


}