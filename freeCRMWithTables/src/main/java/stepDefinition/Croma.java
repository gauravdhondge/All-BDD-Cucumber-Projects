package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Croma {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.croma.com/");
		
		Thread.sleep(3000);
		
		
		WebElement SearchField = driver.findElement(By.xpath("//input[@id='search']"));
		SearchField.sendKeys("TV");
	
		Thread.sleep(3000);
		
		
		WebElement SearchButton = driver.findElement(By.xpath("//span[@class='icon']//*[1]"));
		SearchButton.click();
		
		Thread.sleep(3000);
		
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	
	for(WebElement e :links) {
		
		System.out.println(e.getText());
	}
//		
//		WebElement SmartTV = driver.findElement(By.xpath("//span[@class='icon']//*[1]"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(SmartTV).click().build().perform();
		
	
	
	
	
	
	
	
	
	
	}
	

}
