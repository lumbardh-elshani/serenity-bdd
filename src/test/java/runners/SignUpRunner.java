package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/11/2020, @time 14:08
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/SignUp.feature",
        glue = "classpath:definitions")
public class SignUpRunner {
}
