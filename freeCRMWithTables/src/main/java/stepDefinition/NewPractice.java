package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPractice {

	
	public static void main(String[] args) throws InterruptedException, IOException  {

	
	System.setProperty("webdriver.chrome.driver","D:\\Chrome February\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
//	driver.get("https://www.w3schools.com/");
	
	driver.get("https://www.facebook.com");

	Thread.sleep(4000);
	
	
	WebElement CreateAccountButton  =	driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	CreateAccountButton.click();
	
//	Thread.sleep(4000);
	
//	WebElement EmailAddress = driver.findElement(By.xpath("//div[@class='LoginModal_modal_inner__zNxJo ']//input[1]"));
//	EmailAddress.sendKeys("gauravdhondge@gmail.com");	

	
	WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select s = new Select(Date);
	
//	s.selectByValue("1");
	
	s.selectByVisibleText("1");
	
	
	WebElement MaleButton = driver.findElement(By.xpath("//label[text()='Male']"));
	
	boolean result = MaleButton.isSelected();
	
	if(result) {
		
		System.out.println("Button Selected");
		
	}
	
	else {
		
		System.out.println("Button Not Selected");
	
	}
	
	Thread.sleep(4000);
	
	boolean result1 = MaleButton.isDisplayed();
	
	if(result1) {
		
		System.out.println("Displayed");
	}
	
	
	else {
		
		System.out.println("Not Displayed");

	}
	
	boolean result2 = MaleButton.isEnabled();

if(result2) {
		
		System.out.println("Enabled");
	}
	
	
	else {
		
		System.out.println("Not Enabled");

	}
	



     String text = MaleButton.getText();
		System.out.println(text);


		String text1= MaleButton.getAttribute("class");
		System.out.println(text1);
		
		
//	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	File dest = new File("D:\\Chrome February\\.SC.png");
//	
//	FileHandler.copy(file, dest);
//
//
//	Thread.sleep(4000);

	
	String path = "D:\\Chrome February\\Jayesh Excel.xlsx";
	
	FileInputStream excel = new FileInputStream(path);
	
	String value = WorkbookFactory.create(excel).getSheet("GauravSheet").getRow(1).getCell(0).getStringCellValue();
    System.out.println(value);


	Thread.sleep(4000);

WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));

JavascriptExecutor js = ((JavascriptExecutor)driver);

js.executeScript("arguments[0].value = 'Jayesh'", FirstName);

Thread.sleep(4000);

WebElement LastName = driver.findElement(By.xpath("//form[@id='reg']//input[4]"));
LastName.sendKeys("Dhondge");






}
}