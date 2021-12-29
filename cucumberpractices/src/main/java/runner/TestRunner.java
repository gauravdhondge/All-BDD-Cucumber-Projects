package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\cucumberpractices\\src\\main\\java\\AppFeatures\\Login.feature",
glue = {"stepdefinition"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//          "junit: junit_xml/cucumber.xml" }

dryRun = true

)		


public class TestRunner {

}
