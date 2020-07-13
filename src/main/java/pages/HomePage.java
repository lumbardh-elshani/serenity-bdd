package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 19:45
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HomePage extends AbstractPage{

    @FindBy(xpath = "/html/body/app-root/app-homepage/div/div/button[1]")
    WebElementFacade homepageLoginButton;

    @FindBy(xpath = "/html/body/app-root/app-homepage/div/div/button[2]")
    WebElementFacade homepageRegisterButton;

    public WebElementFacade getHomepageLoginButton() {
        return homepageLoginButton;
    }

    public WebElementFacade getHomepageRegisterButton() {
        return homepageRegisterButton;
    }
}
