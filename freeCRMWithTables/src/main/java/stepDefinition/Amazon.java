package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
		"D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		
		
	WebElement signoption = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		
	Actions act = new Actions(driver);
	
	act.moveToElement(signoption).click().build().perform();
	
	Thread.sleep(3000);
	
	
	
	WebElement phonenumber = driver.findElement(By.xpath("//input[@id='ap_email']"));
	phonenumber.sendKeys("8830407067");
	
	Thread.sleep(3000);
	
	WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
	continuebutton.click();
	
	
	WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("John@123");
	
	Thread.sleep(3000);
	
	WebElement signinclick = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signinclick.click();
	
	Thread.sleep(3000);
	
	WebElement cartbutton = driver.findElement(By.xpath("//a[@id='nav-cart']"));
	
	WebDriverWait wait = new WebDriverWait(driver,5);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-cart']")));	
		
	 Boolean result =cartbutton.isDisplayed();
	 
	 if(result) {
		 
		 System.out.println("button is displayed");
		 
	 }
	 
	 else {
		 
		 System.out.println("button is not displayed");
	 }
	 
	 
	 
	 
	
	
	
	}

}
