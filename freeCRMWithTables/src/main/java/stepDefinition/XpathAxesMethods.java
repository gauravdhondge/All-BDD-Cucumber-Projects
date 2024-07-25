package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxesMethods {
	
public static void main(String[] args) throws InterruptedException {
	


	System.setProperty("webdriver.chrome.driver",
			"D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(3000);
	
	WebElement email = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']//following::input[2]"));
	email.sendKeys("gaurav");
	
	Thread.sleep(5000);
	
	WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//	CreateNewAcc.click();
   
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", CreateNewAcc);
	
	
	Thread.sleep(3000);
   
	WebElement Fn =  driver.findElement(By.xpath("//input[@name='firstname']"));
   
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='jayesh'",Fn );
		
}
}
