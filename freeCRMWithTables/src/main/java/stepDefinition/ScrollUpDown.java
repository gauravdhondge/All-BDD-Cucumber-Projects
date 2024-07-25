package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
//		driver.get("https://www.w3schools.com");	
		
		Thread.sleep(3000);
		
//-----------------scrooll to specific webelement---------------------------------		
		
//		WebElement c = driver.findElement(By.xpath("(//div[@class='w3-card-2 w3-round ws-pink'])[1]"));
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		
//		js.executeScript("arguments[0].scrollIntoView(true);",c);
//		
//		System.out.println(c.getText());
		
		
//-----------------------sending values without sendkeys----------------------------------		
		
		WebElement NewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		NewAccount.click();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("document.getElementById('username').value='jayesh'");
		
		js.executeScript("arguments[0].value='Jayesh'",username);
		
		
		System.out.println("username entered");
		
		
		
		
		
		
		
		
		
		
		
	}

}
