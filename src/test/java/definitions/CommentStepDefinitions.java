package definitions;

import cucumber.api.PendingException;
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


    @Given("^User wants to write a comment with content \"([^\"]*)\" and note \"([^\"]*)\" on forum post with id \"([^\"]*)\"$")
    public void userWantsToWriteACommentWithContentAndNoteOnForumPostWithId(String content, String note, String postId){
        APICommentSteps.createComment(content, note,postId);
    }

    @Then("^This comment should be posted$")
    public void thisCommentShouldBePosted() {
    }

    @Given("^User wants to edit a comment with id \"([^\"]*)\" on forum post with id \"([^\"]*)\"$")
    public void userWantsToEditACommentWithId(String commentID, String postId) {
        APICommentSteps.editCommentWithID(commentID,postId);
    }

    @Then("^This comment should be edited$")
    public void thisCommentShouldBeEdited() {
    }

    @Given("^User wants to delete a comment with id \"([^\"]*)\" on forum post with id \"([^\"]*)\"$")
    public void userWantsToDeleteACommentWithId(String commentID, String postId) {
        APICommentSteps.deleteCommentWithID(commentID, postId);

    }

    @Then("^This comment should be deleted$")
    public void thisCommentShouldBeDeleted() {
    }

    @Given("^User wants to get a comment with id \"([^\"]*)\" on forum post with id \"([^\"]*)\"$")
    public void userWantsToGetACommentWithId(String commentId, String postId){
        APICommentSteps.getCommentWithID(commentId, postId);
    }

    @Then("^User should get that comment$")
    public void userShouldGetThatComment() {
    }
}
