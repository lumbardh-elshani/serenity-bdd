package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ChatSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 16:00
 */
public class ChatStepDefinitions {
    @Steps
    ChatSteps chatSteps;
    @Given("^User wants to send a message to a friend$")
    public void userWantsToSendAMessageToAFriend() {
        chatSteps.performLogin();
    }

    @When("^User types the message in chat$")
    public void userTypesTheMessageInChat() {
        chatSteps.typeMessage();
    }

    @And("^Clicks the send button$")
    public void clicksTheSendButton() {
        chatSteps.sendMessage();
    }

    @Then("^The message should be sent to that particular friend$")
    public void theMessageShouldBeSentToThatParticularFriend() {
    }
}
