package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Login.feature",
		glue="StepDefination",
		dryRun=false // false -- run tets cases and true -- create snippets
	
		)
public class LoginTest {

}