package runner;

import org.junit.runner.RunWith;

import basePackage.BaseDriver;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\BDD\\src\\test\\resources\\features\\Login.feature",
glue = {"stepDefinition","runner"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	       
 
//dryRun = true

)		

public class TestRunner extends BaseDriver {
	
	
	
	
	
	
	
	
	
	
	
	

}
