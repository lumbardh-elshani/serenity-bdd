package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:18
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Presence.feature",
        glue = "classpath:definitions")
public class PresenceRunner {
}
