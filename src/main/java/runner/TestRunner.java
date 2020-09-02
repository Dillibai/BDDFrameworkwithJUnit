package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\ddillibai\\OneDrive - DXC Production\\Documents\\JAVA\\BDD\\BDDFramework\\src\\main\\java\\com\\crm\\qa\\features\\taggedhook.feature", 
			glue= {"com.crm.qa.StepDefinitions"}, //path of stepdefinition file
			format = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
			monochrome = true,  //to generate console output in a readable format
			strict = true, //to check if any steps are pending or undefined
			dryRun = false //to check the mapping between stepdefinition and feature file
//			tags = {"~@SmokeTest", "~@RegressionTest"}  // or is represented as , 
			)
	
	public class TestRunner {
	
	}

	//or:tags={"@SmokeTest,@RegressionTest"} execute all tests tagged as @SmokeTest or @RegressionTest
	//And:tags={"@SmokeTest","@RegressionTest"} execute all tests tagged as @SmokeTest and @RegressionTest
	//tags = {"~@SmokeTest", "@RegressionTest"} - ~ is used to ignore smoke test cases