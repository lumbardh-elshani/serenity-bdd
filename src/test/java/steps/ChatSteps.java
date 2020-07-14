package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.annotations.Steps;
import pages.ChatPage;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 16:02
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSteps {
    @Steps
    LoginSteps loginSteps;

    ChatPage chatPage;

    public void performLogin(){
        loginSteps.login();
    }


    public void typeMessage() {
        getWebdriverManager().getWebdriver().get(GlobalConstants.CHAT_URL);
        chatPage.getMessageInput().type("Hello John, I am writing to ask if you have finished homework for tomorrow");
    }

    public void sendMessage() {
        chatPage.getSendButton().click();
    }
}
