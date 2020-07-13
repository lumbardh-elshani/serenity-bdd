package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 21:55
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/RecoverPassword.feature",
        glue = "classpath:definitions")
public class RecoverPasswordRunner {
}
