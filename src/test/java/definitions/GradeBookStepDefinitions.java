package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.GradeBookSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:35
 */
public class GradeBookStepDefinitions {
    @Steps
    GradeBookSteps gradeBookSteps;

    @Given("^Student wants to see the grades obtained$")
    public void studentWantsToSeeTheGradesObtained() {
        gradeBookSteps.performLogin();
    }

    @When("^Student goes to grade book page$")
    public void studentGoesToGradeBookPage() {
        gradeBookSteps.goToGradeBook();
    }

    @Then("^Student should be able to check personal grades$")
    public void studentShouldBeAbleToCheckPersonalGrades() {
    }
}
