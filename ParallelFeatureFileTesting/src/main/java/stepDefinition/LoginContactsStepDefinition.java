package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginContactsStepDefinition {
	
	WebDriver driver;
	
 @Given("^user is already present on login page")
 public void user_is_present_on_login_page()
	
 {
	
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
//System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
				
 driver = new ChromeDriver();
//driver = new EdgeDriver();
				
 driver.manage().window().maximize();
				
 driver.get("https://classic.freecrm.com/index.html ");	
		
 }
	
	
 @Then("^the title of loginpage is Free CRM$")
 public void the_title_of_loginpage_is_free_crm()
 
 {
     
  String titleofloginpage = driver.getTitle();
  System.out.println(titleofloginpage);
 
 }
	
	
 @Then("^user enter username and password$")
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
 
 @Then("^user click on login button$")
 public void user_clicks_on_login_button() 
 
 {
	
 WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Login']"));
 loginbutton.click();    
	
 }
 
 
 @Then("^user comes on home page$")
 public void user_is_on_home_page() 
	
 {
	
 String TitleOfHomePage = driver.getTitle();
 System.out.println(TitleOfHomePage );
 
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
 
 
 @Then("^user enters  firstname and surname and position$")
 public void user_enters_firstname_and_surname_and_position(DataTable dataTable) throws InterruptedException 
 
 {
	
 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
     
 for (Map<String, String> e : userlist)
    
 {
	 
	
 WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
 WebElement surname = driver.findElement(By.xpath("//input[@id='surname']"));
 WebElement position = driver.findElement(By.xpath("//input[@id='company_position']"));
			
 firstname.sendKeys(e.get("firstname"));
 Thread.sleep(2000);
 surname.sendKeys(e.get("surname"));
 Thread.sleep(2000);
 position.sendKeys(e.get("position")); 
 Thread.sleep(2000);
 
 WebElement SaveAndCreateAnother = driver.findElement(By.xpath("//input[@value='Save and Create Another (same company)']"));
	
 Actions act = new Actions(driver);
 act.moveToElement(SaveAndCreateAnother).click().build().perform();
 
 
// WebElement savebutton = driver.findElement(By.xpath("//form[@id='contactForm']//td[1]//input[2]"));
//	
// Actions act12 = new Actions(driver);
// act12.moveToElement(savebutton).click().build().perform();
//
// Thread.sleep(2000);
// 
// WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']"));
//
// Actions act1 = new Actions(driver);
// act1.moveToElement(contacts).perform();
// 
// Thread.sleep(2000);
// 
// WebElement newcontact = driver.findElement(By.xpath("//a[text()='New Contact']"));
//	
// Actions act2 = new Actions(driver);
// act.moveToElement(newcontact).click().build().perform(); 
  
 }
 }	
	

 @Then("^verify contact created$")
 public void verify_contact_created() throws InterruptedException
 
 {
	 
 WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']"));

 Actions act = new Actions(driver); 
 act.moveToElement(contacts).click().build().perform(); 
 
 Thread.sleep(2000);
 
 WebElement help = driver.findElement(By.xpath("(//a[@class='topnavlink'])[4]"));
 
 JavascriptExecutor js = ((JavascriptExecutor)driver);
 js.executeScript("arguments[0].scrollIntoView(true);",help);
 
	
 }
	
 
// @Then("^close the browser$")
// public void close_the_browser()
// 
// {
//	
// driver.quit();
//	
// }
   }
	


