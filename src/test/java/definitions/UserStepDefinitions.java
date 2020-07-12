package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiUserSteps;

public class UserStepDefinitions {

    @Steps
    ApiUserSteps apiUserSteps;

    @Given("^I create user with name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void iCreateUserWithNameFilanAndLastNameFisteku(String firstName, String lastName) {
        apiUserSteps.createUser(firstName, lastName);
    }

    @Then("^User should be created$")
    public void userShouldBeCreated() {

    }
}
