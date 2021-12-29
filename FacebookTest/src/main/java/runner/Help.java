package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Help {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");	
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe");	


    WebDriver driver = new EdgeDriver();



	//WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com");
		
	Thread.sleep(3000);
	
	WebElement createnewaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

	Actions act = new Actions(driver);
	act.moveToElement(createnewaccount).click().build().perform();
		
	Thread.sleep(3000);	
		
	 WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));	
	 firstname.sendKeys("jayu");
	 
	 Thread.sleep(3000);
	 
	 WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 lastname.sendKeys("dhondge");
	 
	 Thread.sleep(3000);
	 
	 WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	 mobilenumber.sendKeys("8007975732");
	 
	 Thread.sleep(3000);
	 
	 
	 WebElement newpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	 newpassword.sendKeys("Gaurav@123");
	
	 Thread.sleep(3000);
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select S1 = new Select(day);
	S1.selectByVisibleText("10");
	
	Thread.sleep(3000);	
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select S2 = new Select(month);
	S2.selectByVisibleText("Nov");
	
	Thread.sleep(3000);	
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select S3 = new Select(year);
	S3.selectByValue("1994");
	
	Thread.sleep(3000);	
	
	WebElement malebutton = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	boolean result = malebutton.isSelected();
	if(result)
	{
		System.out.println("already selected");
	}
	
	else
	{
		malebutton.click();
	}
	
	
	Thread.sleep(3000);	
		
	WebElement signupbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	signupbutton.click();
	
		
		
	}

}
