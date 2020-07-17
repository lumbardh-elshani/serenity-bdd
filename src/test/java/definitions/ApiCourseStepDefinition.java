package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiCourseSteps;

public class ApiCourseStepDefinition {

    @Steps
    private ApiCourseSteps apiCourseSteps;

    @Given("^I want to courses by student id$")
    public void iWantToGetCoursesByStudentId() {
        apiCourseSteps.getCoursesByStudentId();
    }

    @Then("^I get a list of courses$")
    public void iGetAListOfCourses() {

    }

    @Given("^I want to courses by teacher id$")
    public void iWantToGetCoursesByTeacherId() {
        apiCourseSteps.getCoursesByTeacherId();
    }

    @Then("^I get a list of courses taught by that teacher$")
    public void iGetAListOfCoursesTaughtByThatTeacher() {

    }

    @Given("^I want to create a new forum post by the necessary info$")
    public void iWantToCreateANewForumPostByTheNecessaryInfo() {
        apiCourseSteps.createForumPost();
    }

    @Then("^I get the created forum post$")
    public void iGetTheCreatedForumPost() {

    }

    @Given("^I want to get forum posts by course id$")
    public void iWantToGetForumPostsByCourseId() {
        apiCourseSteps.getForumPostsByCourseId();
    }

    @Then("^I get a list of forum posts$")
    public void iGetAListOfForumPosts() {

    }

}
