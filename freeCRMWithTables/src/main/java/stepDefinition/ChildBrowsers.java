package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsers {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
		
		
//		List<WebElement> tryitbutton = driver.findElements(By.xpath("//a[text()='Try it Yourself']"));
//		
//		int a=tryitbutton.size();
//		System.out.println("size:"+a);
//		
//		Thread.sleep(2000);
//		
//		for(int i=0;i<a;i++) {
//			
//			tryitbutton.get(i).click();
//		}
//		
//		Thread.sleep(2000);
//		
//	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(addr.get(1));
//		
//	Thread.sleep(2000);
	
	}
}
