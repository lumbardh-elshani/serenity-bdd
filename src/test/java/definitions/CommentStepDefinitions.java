package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.APICommentSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 15:40
 */
public class CommentStepDefinitions {
    @Steps
    APICommentSteps APICommentSteps;

    @Given("^User wants to write a comment with content \"([^\"]*)\" and note \"([^\"]*)\"$")
    public void userWantsToWriteACommentWithContentAndNote(String content, String note)  {
        APICommentSteps.createComment(content, note);
    }

    @Then("^This comment should be posted$")
    public void thisCommentShouldBePosted() {
    }


    @Given("^User wants to edit a comment with id \"([^\"]*)\"$")
    public void userWantsToEditACommentWithId(String commentID) {
        APICommentSteps.editCommentWithID(commentID);
    }

    @Then("^This comment should be edited$")
    public void thisCommentShouldBeEdited() {
    }

    @Given("^User wants to delete a comment with id \"([^\"]*)\"$")
    public void userWantsToDeleteACommentWithId(String commentID) {
        APICommentSteps.deleteCommentWithID(commentID);

    }

    @Then("^This comment should be deleted$")
    public void thisCommentShouldBeDeleted() {
    }
}
