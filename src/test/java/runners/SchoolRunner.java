package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 14:18
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/School.feature",
        glue = "classpath:definitions")
public class SchoolRunner {
}
