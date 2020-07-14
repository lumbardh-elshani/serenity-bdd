package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/14/2020, @time 15:46
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/GradeBook.feature",
        glue = "classpath:definitions")
public class GradeBookRunner {
}
