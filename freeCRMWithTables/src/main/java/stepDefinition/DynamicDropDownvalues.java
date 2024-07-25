package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropDownvalues {
	
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\Chrome version 114\\chromedriver_win32\\chromedriver.exe");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.makemytrip.com/");
	
	Thread.sleep(3000);
	
   WebElement Close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
   Close.click();
   
   Thread.sleep(3000);
   
  driver.findElement(By.id("fromCity")).sendKeys("ben");
   
   Thread.sleep(3000);
   
   String optiontoselect = "Bechar, Algeria";
   
   Thread.sleep(3000);
   
   List<WebElement> list = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
   int a = list.size();
   System.out.println("size of options:"+a);
   
   
   for(WebElement ele : list) {
	   
	  String currentoption = ele.getText();
	  System.out.println(currentoption);
   
   
   if(currentoption.contains(optiontoselect)) {
	   
	   ele.click();
	   break;
   }
   }
}

}
