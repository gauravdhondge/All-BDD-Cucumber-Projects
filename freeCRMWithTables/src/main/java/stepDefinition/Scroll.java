package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome February\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com");
		
		Thread.sleep(4000);
		
		
		WebElement tryit = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", tryit);
		
		System.out.println("Scrolled");
		
		
		Thread.sleep(4000);
		
		
		WebElement login = driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
		
        JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		
		js1.executeScript("arguments[0].scrollIntoView(true);", login);
		
		System.out.println("Scrolled Up");
		
		
	}

}
