package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NewAccountStepDefinition {
	
	WebDriver driver;
	
 @Given("^user is already present on loginpage$")
 public void user_is_already_present_on_loginpage() 
	
  {
	   
  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
  System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
		
  //driver = new ChromeDriver();
  driver = new EdgeDriver();
		
  driver.manage().window().maximize();
		
  driver.get(" https://www.facebook.com");	
			
	}
	
		
 @Then("^user verifies the title of loginpage$")
 public void title_of_loginpage() 
	
 {
	
  String title = driver.getTitle();
  System.out.println(title);	
		
  }
	
	
 @Then("^user clicks on create new account button$")
 public void user_clicks_on_create_new_account_button()
 
  {
	    
WebElement createnewaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

Actions act = new Actions(driver);
act.moveToElement(createnewaccount).click().build().perform();
	 
  }
 
 
 
 
// @Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
// public void user_enters_credentials(String firstname, String lastname, String mobilenumber, String newpassword) throws InterruptedException
//	
//  {
//		
// WebElement firstname1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
// firstname1.sendKeys(firstname);
// 
// Thread.sleep(3000);
// 
// 
// WebElement lastname1 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
// lastname1.sendKeys(lastname);
// 
// Thread.sleep(3000);
// 
// 
// WebElement mobilenumber1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
// 
// mobilenumber1.sendKeys(mobilenumber);
// Thread.sleep(3000);
// 
// 
// WebElement newpassword1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
// newpassword1.sendKeys(newpassword);
// 
//	    
//  }
 
 
	@Then("^user selects date of birth$")
	public void user_is_on_mainpage() throws InterruptedException 
  {
		
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
		
  }
	 
	 
//	@Then("user moves to new contact page")
//	public void user_moves_to_new_contact_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
