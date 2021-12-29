package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginDealsStepDefinition {
	
 WebDriver driver;
		
 @Given("^user is present on login page$")
 public void user_is_present_on_login_page()
	 
 {

 System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
 //System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
						
 driver = new ChromeDriver();
 //driver = new EdgeDriver();
						
 driver.manage().window().maximize();
						
 driver.get("https://classic.freecrm.com/index.html ");		 
		  
 }
	 
	 
 @And("^title of login page is Free CRM$")
 public void title_of_login_page_is_free_crm()
		
 {
		    
 String titleofloginpage = driver.getTitle();	
 System.out.println(titleofloginpage);		
			
 }
		
		
 @When("^user enters username and password$")
 public void user_enters_username_and_password(DataTable dataTable) throws InterruptedException 
	  
 {
		
 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);
		 	
 for(Map<String,String> e : userlist)
 {
	 
 WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
 WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

 username.sendKeys(e.get("username"));
 Thread.sleep(2000);
 password.sendKeys(e.get("password"));
	  
 }
 }
	 
	 
 @And("^user clicks on login button$")
 public void user_clicks_on_login_button() 
	 
 {
		
 WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Login']"));
 loginbutton.click(); 
		 
 }
	 
	 
 @Then("^user is on home page$")
 public void user_is_on_home_page() 
	 
 {
		    
 String TitleOfHomePage = driver.getTitle();
 System.out.println(TitleOfHomePage );	
	 
 }
	 
	 
 @When("^user moves to deals button$")
 public void user_moves_to_deals_button() throws InterruptedException
	 
 {
		
 WebElement mainpanel = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
 driver.switchTo().frame(mainpanel);

 Thread.sleep(2000);

 WebElement deals = driver.findElement(By.xpath("//a[text()='Deals']"));

 Actions act = new Actions(driver);
 act.moveToElement(deals).perform();
		
 }
	 

 @And("^user clicks on new deal  link$")
 public void user_clicks_on_new_deal_link() 
	 
 {
	 
 WebElement newdeal = driver.findElement(By.xpath("//a[text()='New Deal']"));
			
 Actions act = new Actions(driver);
 act.moveToElement(newdeal).click().build().perform();
		
 }

	 
 @And("^user enters Title and Amount and Probablity and Commission$")
 public void user_enters_title_and_amount_and_probablity_and_commission(DataTable dataTable) throws InterruptedException
	 
 {
		    
 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
	     
 for (Map<String, String> e : userlist)
		    
 {
			
 WebElement title = driver.findElement(By.xpath("//input[@id='title']"));
 WebElement amount = driver.findElement(By.xpath("//input[@id='amount']"));
 WebElement probability = driver.findElement(By.xpath("//input[@id='probability']"));
 WebElement commission = driver.findElement(By.xpath("//input[@id='commission']"));		
	 
 title.sendKeys(e.get("Title"));
 Thread.sleep(2000);
 amount.sendKeys(e.get("Amount"));
 Thread.sleep(2000);
 probability.sendKeys(e.get("Probability")); 
 Thread.sleep(2000);
 commission.sendKeys(e.get("Commission"));  
		 
 Thread.sleep(2000);
	 
 WebElement SaveAndCreateAnother = driver.findElement(By.xpath("//input[@value='Save and Create Another']"));
	 
 Actions act3 = new Actions(driver);
 act3.moveToElement(SaveAndCreateAnother).click().build().perform();
	 
 Thread.sleep(2000);
	 
	// WebElement savebutton = driver.findElement(By.xpath("//form[@id='prospectForm']//td[1]//input[1]"));
		 
	// Actions act1 = new Actions(driver);
	// act1.moveToElement(savebutton).click().build().perform();
	//
	// Thread.sleep(2000); 	 	 
	// WebElement deals = driver.findElement(By.xpath("//a[text()='Deals']"));
	//
	// Actions act2 = new Actions(driver);
	// act2.moveToElement(deals).perform();	 
	//
	// Thread.sleep(2000); 
	// 
	// WebElement newdeal = driver.findElement(By.xpath("//a[text()='New Deal']"));
	//	
	// Actions act = new Actions(driver);
	// act.moveToElement(newdeal).click().build().perform();	 
		 
  }
  }
	 
	 
 @Then("^verify deals created$")
 public void verify_deals_created()
	 
 {
		
 WebElement deals = driver.findElement(By.xpath("//a[text()='Deals']"));
	 
 Actions act = new Actions(driver);	
 act.moveToElement(deals).click().build().perform();	 
		 
 }
	 
	 
// @And("^close the browser$")
// public void close_the_browser() 
// 
// {
// 	
// driver.quit();
//	
// }	

}
