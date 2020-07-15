package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.CommentSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 15:40
 */
public class CommentStepDefinitions {
    @Steps
    CommentSteps commentSteps;

    @Given("^User wants to write a comment with content \"([^\"]*)\" and note \"([^\"]*)\"$")
    public void userWantsToWriteACommentWithContentAndNote(String content, String note)  {
        commentSteps.createComment(content, note);
    }

    @Then("^This comment should be posted$")
    public void thisCommentShouldBePosted() {
    }



}
