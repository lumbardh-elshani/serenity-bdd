package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/12/2020, @time 18:49
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Navigation.feature",
        glue = "classpath:definitions")
public class NavigationRunner {
}
