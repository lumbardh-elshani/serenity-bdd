package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {

    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //SerenityRest.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}