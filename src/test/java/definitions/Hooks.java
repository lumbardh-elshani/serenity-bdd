package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.rest.SerenityRest;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {

    @Before
    public void setup() {

        SerenityRest.enableLoggingOfRequestAndResponseIfValidationFails();

    }
}