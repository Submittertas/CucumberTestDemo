package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features="Features",
		features = "C:/Users/carri/OneDrive/Desktop/Eclipse QA/CucumberTestProject/Features/Hooks.feature",
		glue="stepDefinitions",
		//dryRun=false,
		//monochrome = true,
		plugin= {"pretty","html:html_output/cucumber.html", "json:json_output/cucumber.json", "junit: junit_output/cucumber.xml"}
		//tags = {"@EndToEnd or @Regression"}
		//tags = ("@EndToEnd and @Regression")  //Step should have both tags
		//tags = ("not @EndToEnd") // To avoid EndToEnd scenarios.
		
		)

public class MyAccountTestRunner {

}
