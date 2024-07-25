package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Croma {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.croma.com/");
		
		Thread.sleep(3000);
		
		
		WebElement croma = driver.findElement(By.xpath("//img[@alt='Logo']"));
		String text = croma.getText();
		
		
		
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(text, "croma");
		
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	
	for(WebElement e :links) {
		
		System.out.println(e.getText());
	}

		
	
	
	
	
	
	
	
	
	
	}
	

}
