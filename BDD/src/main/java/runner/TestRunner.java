package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\BDD\\src\\main\\java\\features\\Login.feature",
glue = {"stepDefinition"},
//monochrome = true,
plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"},
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//dryRun = true
//plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//	       "junit: junit_xml/cucumber.xml" }
 


)		

public class TestRunner {

}
