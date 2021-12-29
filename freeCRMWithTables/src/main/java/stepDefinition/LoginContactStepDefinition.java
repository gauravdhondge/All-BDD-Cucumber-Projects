package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginContactStepDefinition {
	
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


 @Then("^title of login page is Free CRM$")
 public void title_of_login_page_is_free_crm()

{
	 
	String titleofloginpage = driver.getTitle();
	System.out.println(titleofloginpage);

 }


 @Then("^user enters username and password$")
 public void user_enters_username_and_password(DataTable address) throws InterruptedException

{
 
 List<List<String>> data = address.asLists(String.class);

 WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
 WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

 username.sendKeys(data.get(0).get(0));
 Thread.sleep(2000);
 password.sendKeys(data.get(0).get(1));
    
 }


 @Then("^user clicks on login button$")
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



 @Then("^user enters  firstname and lastname and position$")
 public void user_enters_firstname_and_lastname_and_position(DataTable address) throws InterruptedException 
 
 {
    
 List<List<String>> data = address.asLists(String.class);
	 
 WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
 WebElement surname = driver.findElement(By.xpath("//input[@id='surname']"));
 WebElement position = driver.findElement(By.xpath("//input[@id='company_position']"));
		
 firstname.sendKeys(data.get(0).get(0));
 Thread.sleep(2000);
 surname.sendKeys(data.get(0).get(1));
 Thread.sleep(2000);
 position.sendKeys(data.get(0).get(2));
	 
 }
 
 
 @Then("^user clicks on save button$")
 public void user_clicks_on_save_button()


 {
 
 WebElement savebutton = driver.findElement(By.xpath("//form[@id='contactForm']//td[1]//input[2]"));
		
 Actions act = new Actions(driver);
 act.moveToElement(savebutton).click().build().perform();
	       
 }


 @Then("^verify contact created$")
 public void verify_contact_created()
 
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
