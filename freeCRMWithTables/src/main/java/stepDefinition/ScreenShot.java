package stepDefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("");
		
		
		
}	

}
