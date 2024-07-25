package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com");
		
		System.out.println("switched to mainpage");
		
		Thread.sleep(2000);
	
	List<WebElement> tryitbuttons = driver.findElements(By.xpath("//a[text()='Try it Yourself']")); 
		
	int a =tryitbuttons.size();	
	System.out.println("No of tryitbuttons:"+a);	
	
	Thread.sleep(2000);
		
	tryitbuttons.get(1).click();
	tryitbuttons.get(2).click();
	tryitbuttons.get(3).click();
		
		
	Set<String> addresses = driver.getWindowHandles();	
	
	ArrayList<String> addr = new ArrayList<String>(addresses);
	
	String mainpageaddr =    addr.get(0);
	String child_browser_1 = addr.get(1);
	String child_browser_2 = addr.get(2);
	String child_browser_3 = addr.get(3);

	System.out.println("MainPageAddress:"+mainpageaddr);	
	System.out.println("ChildBrowser_1_address:"+child_browser_1);	
	System.out.println("ChildBrowser_2_address:"+child_browser_2);	
	System.out.println("ChildBrowser_3_address:"+child_browser_3);	

	Thread.sleep(2000);
	
	driver.switchTo().window(mainpageaddr);
		
	System.out.println("switched to mainpage");
		
	Thread.sleep(2000);	
		
	driver.switchTo().window(child_browser_2);
	
	System.out.println("switched to childbrowser 2");	
		
	for(String titles: addr) {
		
	String PageTitles = driver.switchTo().window(titles).getTitle();
	System.out.println(PageTitles);
		
	if(PageTitles.equals("W3Schools Tryit Editor")) {
		
		driver.close();
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	}
	}
