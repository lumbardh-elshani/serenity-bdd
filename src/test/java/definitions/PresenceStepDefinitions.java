package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.PresenceSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:13
 */
public class PresenceStepDefinitions {
    @Steps
    PresenceSteps presenceSteps;

    @Given("^Professor wants to set the presence to students$")
    public void professorWantsToSetThePresenceToStudents() {
        presenceSteps.performLogin();
    }

    @When("^Professor opens the presence page$")
    public void professorOpensThePresencePage() {
        presenceSteps.openPresencePage();
    }

    @And("^Sets the presence to present students$")
    public void setsThePresenceToPresentStudents() {
        presenceSteps.setPresenceToPresentStudens();
    }

    @Then("^This presence should be saved in the database$")
    public void thisPresenceShouldBeSavedInTheDatabase() {
        presenceSteps.savePresenceToDatabase();
    }
}
