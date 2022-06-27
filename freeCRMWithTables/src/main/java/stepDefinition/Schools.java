package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schools {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		System.out.println("switched to mainpage");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println("switched to iframe");
		
		Thread.sleep(2000);
		
		WebElement tryitbutton = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryitbutton.click();
		
		System.out.println("clicked on tryit button");
		
		Thread.sleep(2000);
		
		
		Alert alt = driver.switchTo().alert();
		System.out.println("swithed to alert popup");
		alt.accept();
		
		System.out.println("clicked on accept button");

		
		
		
	}

}
