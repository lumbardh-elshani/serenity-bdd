package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 14:15
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Meeting.feature",
        glue = "classpath:definitions")
public class MeetingRunner {
}
