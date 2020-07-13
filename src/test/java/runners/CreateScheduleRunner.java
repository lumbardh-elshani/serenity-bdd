package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/13/2020, @time 20:51
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/CreateSchedule.feature",
        glue = "classpath:definitions")
public class CreateScheduleRunner {
}
