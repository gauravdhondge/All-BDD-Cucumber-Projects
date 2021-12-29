package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions
 (
		
features = {"C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\FreeCRM\\src\\main\\java\\features\\login.feature"},		
glue = {"stepDefinition"},
monochrome = true,
plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//dryRun = true
//strict = true
		 
 )



public class TestRunner {
	
	

}
