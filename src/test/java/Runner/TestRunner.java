package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/feature/Login1.feature",
		glue = "StepDef",
		plugin = {"pretty","html:target/cucumber-report.html"},
		monochrome =true
		)
public class TestRunner {

}
