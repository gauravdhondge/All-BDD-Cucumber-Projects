package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class WebTables {
	
	
	
	@Test
	public void VerifyTable() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chrome November\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		
		
		List<WebElement> AllHeaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		System.out.println(AllHeaders.size());
		
		Assert.assertEquals(AllHeaders.size(),5,"column count is not same");
		
		boolean status = false;
		
		for(WebElement ele : AllHeaders) {
			
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("Country")) {
				
				status = true;
				break;
			}
			}
		
		Assert.assertTrue(status,"header is not present");
		
	System.out.println("=============================================");
		
		
		
		List<WebElement> numberOfRows  = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("total count of rows:"+numberOfRows.size());
		
		Assert.assertEquals(numberOfRows.size(),7,"Table row count mis matched");
		
		
		System.out.println("=============================================");	
		
		List<WebElement> AllData =  driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		boolean Datastatus = false;
		
		for(WebElement ele : AllData) {
			
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("Amazon")) {
				
				Datastatus = true;
				break;
			}
			}
		
		Assert.assertTrue(Datastatus,"record did not find");

		System.out.println("=============================================");	
		
		
List<WebElement> CompanyNames =  driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
		
		boolean Companystatus = false;
		
		for(WebElement ele : CompanyNames) {
			
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("FlipKart")) {
				
				Companystatus = true;
				break;
			}
			}
		
		Assert.assertTrue(Companystatus,"company not found");

	
	WebElement CheckBox = driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input"));	
	CheckBox.click();
	System.out.println("clicked on checkbox");	
	
	
	Thread.sleep(2000);
	
	WebElement KnowMoreLink = driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a"));	
	KnowMoreLink.click();
	System.out.println("clicked on link");	
		
		
		
	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
