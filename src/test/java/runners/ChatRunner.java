package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 16:07
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Chat.feature",
        glue = "classpath:definitions")
public class ChatRunner {
}
