package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\freeCRMWithTables\\src\\main\\java\\features\\LoginContacts.feature",
glue = {"stepDefinition"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//dryRun = true

)		



public class TestRunner {

}

