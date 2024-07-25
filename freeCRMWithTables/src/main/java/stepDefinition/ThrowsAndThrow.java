package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowsAndThrow {
	
	
public static void main(String[] args) throws InterruptedException,IOException {
		
		
        System.setProperty("webdriver.chrome.driver","D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
	
	

}
}