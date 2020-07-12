package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 16:59
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Logout.feature",
        glue = "classpath:definitions")
public class LogOutRunner {
}
