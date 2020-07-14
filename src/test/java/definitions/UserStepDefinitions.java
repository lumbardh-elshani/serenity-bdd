package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiUserSteps;

public class UserStepDefinitions {

    @Steps
    ApiUserSteps apiUserSteps;

//    @Given("^I create user with name \"([^\"]*)\" and last name \"([^\"]*)\"$")
//    public void iCreateUserWithNameFilanAndLastNameFisteku(String firstName, String lastName) {
//        apiUserSteps.createUser(firstName, lastName);
//    }
//
//    @Then("^User should be created$")
//    public void userShouldBeCreated() {
//
//    }

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
