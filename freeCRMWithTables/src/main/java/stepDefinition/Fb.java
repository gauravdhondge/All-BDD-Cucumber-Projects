package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Fb {

	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
//		String url =driver.getCurrentUrl();
//		System.out.println(url);
//		
//		
//		String title =driver.getTitle();
//		System.out.println(title);
		

//--------select all the links present on the page----------------		
		

//	List<WebElement> links =	driver.findElements(By.tagName("a"));
//	
//	int a =links.size();
//	System.out.println("no of links present on the page:"+a);
//		
//	for(WebElement e : links) {
//		
//		System.out.println(e.getText());
//	}
		
		

//-----------------------------------------------------------------------		
	
		
//		
//		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		CreateNewAcc.click();
//	
//		Thread.sleep(2000);
		
	
//		WebElement SignupText = driver.findElement(By.xpath("//div[text()='Sign Up']"));
//	    String text =	SignupText.getText();
//		System.out.println(text);
//		
//		Assert.assertEquals(text,"Sign Up");
		
		
		
		
//--------for selecting the default option from drop down-------------------
		
//		WebElement allmonths = driver.findElement(By.xpath("//select[@id='month']"));
//		
//		Select s = new Select(allmonths);	
//		
//		String DefaultOption = s.getFirstSelectedOption().getText();
//	System.out.println("the Default option is: "+DefaultOption);
//	
	
	
	
//------selecting specific option from dropdown----------------------
	
//	List<WebElement> monthsdata = driver.findElements(By.tagName("select"));
//	  int a = monthsdata.size();
//	  System.out.println(a);
	
					
		
//----printing all the options from drop down-----------------------------	
//		
//		WebElement allmonths = driver.findElement(By.xpath("//select[@id='month']"));
//		
//		Select s = new Select(allmonths);
//		
//		List<WebElement> months = s.getOptions();
//	    for(WebElement e : months) {
//	    	
//	    	System.out.println(e.getText());
//	    }
	
	
	
		
		
		
	
	
	
	
//----------------------------------------------------------------------------		
		
		
		
//		Thread.sleep(2000);
//		
//		WebElement malebutton = driver.findElement(By.xpath("//label[text()='Male']"));
//		boolean result = malebutton.isSelected();
//		
//		if(result) {
//			
//			System.out.println("button already selected");
//		}
//		
//		else {
//			
//		malebutton.click();
//		System.out.println("selecting button");
//			
//		}
//		
//		Thread.sleep(2000);
//		
//		WebElement signupbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		boolean result1 = signupbutton.isEnabled();
//		
//		
//		if (result1) {
//
//			System.out.println("button Enabled");
//		}
//
//		else {
//
//			
//			System.out.println("button disabled");
//
//		}
//
//		Thread.sleep(2000);
//		
//		WebElement signinbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		boolean result2 = signinbutton.isDisplayed();
//		
//		if (result2) {
//
//			System.out.println("button is displayed");
//		}
//
//		else {
//
//			
//			System.out.println("button not displayed");
//
//		}
//
//		Thread.sleep(2000);
//		
//		
//	String a =	signinbutton.getText();	
//	System.out.println(a);
//		
//		
//		Thread.sleep(2000);
//		
//	String b =	signinbutton.getAttribute("id");
//	System.out.println(b);	
//		
//	Thread.sleep(2000);
	
	
//	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//	String a = firstname.getAttribute("name");
//	System.out.println(a);
	
	
	
	
	
	
	
		
		
	}

}
