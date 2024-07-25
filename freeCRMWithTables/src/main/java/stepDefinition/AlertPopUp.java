package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome February\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

//		driver.navigate().to("https://www.facebook.com");

		driver.manage().window().maximize();
		
        Thread.sleep(4000);
		
      driver.switchTo().frame("iframeResult");
      
      System.out.println("switched to iframe");
      
      Thread.sleep(4000);
      
      WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
      tryit.click();
      
      System.out.println("clicked on button");

      Thread.sleep(4000);
      
     Alert alt =  driver.switchTo().alert();
     
     String text = alt.getText();
     System.out.println(text);
     
     Thread.sleep(2000);

     alt.accept();
     
     System.out.println("popup handled");

     
     
		
		
	}

}
