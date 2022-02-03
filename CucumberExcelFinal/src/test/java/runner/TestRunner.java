package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\CucumberExcelFinal\\src\\test\\resources\\features\\Login.feature",
glue = {"stepDefinition","runner"},
monochrome = true,
plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"},
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	       
 
//dryRun = true

)		

public class TestRunner extends BaseDriver  {
	
	
	
	
	
	
	
	
	
	
	

}
