package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/siraz/eclipse-workspace/CucumberBDD/src/main/java/Features/login.feature"
		,glue = {"StepDefinition"}		
		)

public class TestRunner {

	 
	
	
}
