package stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CodePractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		

		Thread.sleep(3000);

		List<WebElement> TryItButton = driver.findElements(By.xpath("//a[text()='Try it Yourself']"));
//		TryItButton.get(0).click();
//		TryItButton.get(1).click();
//		TryItButton.get(2).click();
//		TryItButton.get(3).click();
//		TryItButton.get(4).click();

		int a = TryItButton.size();
		System.out.println("no of tryit buttons:" + a);

		for (int i = 0; i < a; i++) {

			TryItButton.get(i).click();
		}

//	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//	String title = driver.switchTo().window(addr.get(1)).getTitle();
//	System.out.println(title);

		Set<String> address = driver.getWindowHandles();
		ArrayList<String> addr = new ArrayList<String>(address);

		String mainpage = addr.get(0);
		String Child1 = addr.get(1);
		String Child2 = addr.get(2);
		String Child3 = addr.get(3);
		String Child4 = addr.get(4);
		String Child5 = addr.get(5);

		System.out.println("mainpage:" + mainpage);
		System.out.println("mainpage:" + Child1);
		System.out.println("mainpage:" + Child2);
		System.out.println("mainpage:" + Child3);
		System.out.println("mainpage:" + Child4);
		System.out.println("mainpage:" + Child5);

		
		for(String windowaddr :addr ) {
			
			String pagetitles = driver.switchTo().window(windowaddr).getTitle();
			System.out.println(pagetitles);
		
		if(pagetitles.equals("SQL Tryit Editor v1.6")&&pagetitles.equals("W3Schools Tryit Editor")) {
			
			driver.close();
			
		}
		
		}
		
		
		
		
		
		
		
	}
}
