package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 16:03
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div/app-chat-conversation-box/div/div[2]/form/input")
    WebElementFacade messageInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div/app-chat-conversation-box/div/div[2]/form/button")
    WebElementFacade sendButton;

    public WebElementFacade getMessageInput() {
        return messageInput;
    }

    public WebElementFacade getSendButton() {
        return sendButton;
    }
}
