package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 19:59
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Activity.feature",
        glue = "classpath:definitions")
public class ActivityRunner {
}
