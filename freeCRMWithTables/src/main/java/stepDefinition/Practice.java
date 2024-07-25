package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		
		String title =driver.getTitle();
		System.out.println(title);
		
	Assert.assertEquals(title,"Facebook – log in or sign up");	
	
	
	WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	newaccount.click();
	
	Thread.sleep(2000);
		
	WebElement specificmonth = driver.findElement(By.xpath("(//select[@id='month'])//option[text()='Apr']"));
	specificmonth.click();
	
	

	}
	}

