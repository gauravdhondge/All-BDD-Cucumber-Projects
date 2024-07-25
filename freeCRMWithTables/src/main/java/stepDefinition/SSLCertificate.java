package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SSLCertificate {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");

		
		ChromeOptions SSLCertficate = new ChromeOptions();
		SSLCertficate.setAcceptInsecureCerts(true);
		

		WebDriver driver = new ChromeDriver(SSLCertficate);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		CreateNewAcc.click();
	
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		
		s.selectByVisibleText("Nov");
		
		Thread.sleep(2000);
		
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
        String value = male.getAttribute("class");
        System.out.println(value);
        
        
       File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest = new File("");
	   
	   FileHandler.copy(source, dest);
	
	}	
}
