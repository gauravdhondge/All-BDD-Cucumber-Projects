package stepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPractice {
	
	public static void main(String[] args) throws InterruptedException,IOException {
		
		
        System.setProperty("webdriver.chrome.driver","D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
//------------------address of mainpage only---------------------------------
		
//		String addr  = driver.getWindowHandle();
//		System.out.println(addr);
		
//-------------address of mainpage and child browsers-------------------------
		
		
//		WebElement tryit = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]"));
//		tryit.click();
		
		
		
	List<WebElement> tryitButtons = driver.findElements(By.xpath("//a[text()='Try it Yourself']"));


	int a  = tryitButtons.size();
	System.out.println("size:"+a);
	
	
	
	
	//-----------------clicking every button using obj ref-------------------------------
		
		tryitButtons.get(1).click();
		tryitButtons.get(2).click();
		tryitButtons.get(3).click();
		tryitButtons.get(4).click();
	
//	
//		
//	    Set<String> addresses = driver.getWindowHandles();
//		ArrayList<String> addr = new ArrayList<String>(addresses);
//		
//		String MainpageAddress = addr.get(0);
//		String childbrowser_1 = addr.get(1);
//		String childbrowser_2 = addr.get(2);
//		String childbrowser_3 = addr.get(3);
//		String childbrowser_4 = addr.get(4);
//		String childbrowser_5 = addr.get(5);
//
//		
//		System.out.println("MainpageAddress="+MainpageAddress);
//		System.out.println("ChildBrowser1="+childbrowser_1);
//		System.out.println("ChildBrowser1="+childbrowser_2);
//		System.out.println("ChildBrowser1="+childbrowser_3);
//		System.out.println("ChildBrowser1="+childbrowser_4);
//		System.out.println("ChildBrowser1="+childbrowser_5);

		
		
	}

}
