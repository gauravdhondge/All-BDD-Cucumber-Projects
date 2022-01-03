package stepDefinition;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\guru99BackgroundKeyword\\src\\test\\resources\\features\\",
glue = {"stepDefinition"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"}
plugin = {"pretty","junit: junit_xml/cucumber.xml "}
//plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//          "junit: junit_xml/cucumber.xml",
//            "json:json_output/cucumber.json",
//            "html: test-output"}
                                                    

//dryRun = true

)		


public class testRunner extends AbstractTestNGCucumberTests {

@Override
@DataProvider(parallel = true)

public Object [] [] scenarios(){
return super.scenarios();



}
}



