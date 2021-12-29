package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions
 (
		
features = {"C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\FacebookTest\\src\\main\\java\\features\\NewAccount.feature"},		
glue = {"stepDefinition"},
//monochrome = true,
//plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json: json_output/cucumber.json"}

dryRun = true


 )


public class TestRunner {

}


















