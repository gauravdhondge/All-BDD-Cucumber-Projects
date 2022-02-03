package runner;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import basePackage.ConfigReader;
import basePackage.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver ;
	private ConfigReader configReader;
	
	@Before(order=0)
	public void launchBrowser() {
		configReader = new ConfigReader();
		String browserName = configReader.initialiseProperties("Browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initiateDriver(browserName);
	}

//	@After(order=0)
//	public void quitBroswer() {
//		driver.quit();
//	}
	
	@After(order=1)
	public void screenShot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
	
	
	
	
	
}
