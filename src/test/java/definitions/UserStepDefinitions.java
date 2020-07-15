package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.APIUserSteps;

public class UserStepDefinitions {

    @Steps
    APIUserSteps apiUserSteps;

    @Given("^I want to get user with id$")
    public void iWantToGetUserWithId() {
        apiUserSteps.getUserById();
    }

    @Then("^you get the user$")
    public void youGetTheUser() {

    }

    @Given("^I want to register with the necessary input$")
    public void iWantToRegisterWithTheNecessaryInput() {
        apiUserSteps.register();
    }

    @Then("^I should be able to register$")
    public void iShouldBeAbleToRegister() {

    }

}
