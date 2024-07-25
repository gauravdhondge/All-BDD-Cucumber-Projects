package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver","D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='jayesh'", username);
		
		
//		WebElement Createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		js.executeScript("arguments[0].click();", Createnew);
		
		WebElement Createnew = driver.findElement(By.xpath("//a[starts-with(@id,'u')]"));
		Createnew.click();
		
		
		
		
	}

}
