package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class FaceBook {
	


	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.get("https://www.w3schools.com/");
		
//		driver.get("https://www.facebook.com");
		
		
//		Thread.sleep(3000);
//		
//		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		CreateNewAcc.click();
//	
//		Thread.sleep(3000);
//		
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("D:\\jayesh\\Test.jpj");
//		
//		FileHandler.copy(source, destination);
		
		
//		WebElement Firstname = driver.findElement(By.xpath("(//form[@method='post'])[2]//input[4]"));
//		Firstname.sendKeys("jayesh");	
		
	
//		WebElement signup = driver.findElement(By.xpath("//form[@id='reg']//button[1]"));
//		signup.click();	
		
		
		
		
		
	//	Thread.sleep(3000);
//	
//	WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
//	Select s = new Select(date);
//	s.selectByValue("10");
//	
//	Thread.sleep(3000);
//	
//	WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
//	boolean result = male.isSelected();
//	
//	if(result)
//	{
//		
//		System.out.println("Already Selected");
//	}
//	
//	else
//	{
//			
//		male.click();
//	}
//	
//	
//	Thread.sleep(3000);
//	
//	
////	WebElement SignUpText = driver.findElement(By.xpath("//div[text()='Sign Up']"));
////	 String text = SignUpText.getText();
////	System.out.println(text);
//	
//	
//	WebElement SignUpText = driver.findElement(By.xpath("//div[text()='Sign Up']"));
//	 String text = SignUpText.getAttribute("class");
//	System.out.println(text);
//	
//	Thread.sleep(3000);
//	
//	
//	
//		
//		driver.switchTo().frame("iframeResult");
//		
//		Thread.sleep(3000);
//		
//		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
//		tryit.click();
//		
//		
//		Thread.sleep(3000);
//		
//	Alert alt =	driver.switchTo().alert();
//	alt.accept();	
		
		
		
		
		
		
		
		
		
	}
	

}
