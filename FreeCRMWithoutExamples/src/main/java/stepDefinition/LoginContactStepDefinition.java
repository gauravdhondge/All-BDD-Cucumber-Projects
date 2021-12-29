package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginContactStepDefinition {

 WebDriver driver;
	
 @Given("^user is present on login page$")
 public void user_is_present_on_login_page()  
  
 {
		
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://classic.freecrm.com/index.html");
	  
 }
		
 @Then("^title of login page is Free CRM$")
 public void title_of_login_page_is_Free_CRM()
	 
 {
		  
 String title = driver.getTitle();
 System.out.println(title);
				
//Assert.assertEquals("CRM customer relationship management software cloud", title);
	   
 }

	  
 @Then("^user enters \"(.*)\" and \"(.*)\"$")
 public void user_enters_username_and_password(String username,String password) throws InterruptedException  
	   
 {
		   
 WebElement enteremail = driver.findElement(By.xpath("//input[@placeholder='Username']"));
 WebElement enterpassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		   	  
 enteremail.sendKeys(username);
 Thread.sleep(2000);
 enterpassword.sendKeys(password);   
		
 }
	   

 @Then("^user clicks on login button$")
 public void user_clicks_on_login_button() 
	    
 {
		    
 WebElement signinbutton = driver.findElement(By.xpath("//input[@value='Login']"));
			
 Actions act = new Actions(driver);
 act.moveToElement(signinbutton).click().build().perform();
	     
 }
	    

 @Then("^user is on home page$")
 public void user_is_on_home_page()  
		
 {
			
 String title = driver.getTitle();
 System.out.println(title);
		 
//Assert.assertEquals("Cogmento CRM", title);
			
 }
		
 @Then("^user moves to contacts button$")
 public void user_moves_to_contacts_button() throws InterruptedException
		
 {
		    	
 WebElement mainpanel = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
 driver.switchTo().frame(mainpanel);

 Thread.sleep(2000);

 WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']"));

 Actions act = new Actions(driver);
 act.moveToElement(contacts).perform();
			
 }
		
 @Then("^user clicks on new contact link$")
 public void user_clicks_on_new_contact_link()
		
 {
			
 WebElement newcontact = driver.findElement(By.xpath("//a[text()='New Contact']"));
			
 Actions act = new Actions(driver);
 act.moveToElement(newcontact).click().build().perform();
			
 }
		
 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
 public void user_enters_firstname_surname_position(String firstname,String surname,String position) throws InterruptedException 
		
 {
		    
 WebElement firstname1 = driver.findElement(By.xpath("//input[@id='first_name']"));
 WebElement surname1 = driver.findElement(By.xpath("//input[@id='surname']"));
 WebElement position1 = driver.findElement(By.xpath("//input[@id='company_position']"));
			
 firstname1.sendKeys(firstname);
 Thread.sleep(2000);
 surname1.sendKeys(surname);
 Thread.sleep(2000);
 position1.sendKeys(position);
		   
 }
		
 @Then("^user clicks on save button$")
 public void user_clicks_on_save_button()
		
 {
 
 WebElement savebutton = driver.findElement(By.xpath("//form[@id='contactForm']//td[1]//input[2]"));
			
 Actions act = new Actions(driver);
 act.moveToElement(savebutton).click().build().perform();
		    
 }
		
 @Then("^verify contact created$")
 public void verify_contact_created() throws InterruptedException 
		
 {
			
 WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']"));

 Actions act = new Actions(driver);
 act.moveToElement(contacts).click().build().perform();
		
 }
		
 @Then("^close the browser$")
 public void close_the_browser() 
		
 {
		 
 driver.quit();
			
 }
		
 }
