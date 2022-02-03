package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAddCustomersStepDefinition {
	
	WebDriver driver;

	@Given("^user is present on loginpage$")
	public void user_is_present_on_loginpage()
	
	{
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 //System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		 driver = new ChromeDriver();
		 //driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://admin-demo.nopcommerce.com");
		
	}
	
	
	@And("^title of loginpage is Your store Login$")
	public void title_of_loginpage_is_your_store_login() 
	
	{
	    
		String title = driver.getTitle();
		 System.out.println(title);
		 
		 Assert.assertEquals("Your store. Login",title);
		
		
	}
	
	
	@When("^user enters email and password$")
	public void user_enters_email_and_password(DataTable dataTable) throws InterruptedException
	
	{
	    
		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class); 
		 
		 for(Map<String,String> e : userlist)
		 {
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		 WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
			
		 email.clear();
		 Thread.sleep(2000);
		 email.sendKeys(e.get("email"));
		 Thread.sleep(2000);
		 password.clear();
		 Thread.sleep(2000);
		 password.sendKeys(e.get("password"));
		 Thread.sleep(2000);
		 
		 }	
		 }
	
	
	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	
	{
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(loginbutton).click().build().perform();  
	
	}
	
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() 
	
	{
		 String title = driver.getTitle();
		 System.out.println(title);	 
		
		 Assert.assertEquals("Dashboard / nopCommerce administration", title);
		
	}
	
	
	@And("^user clicks on customers module and selects customer submodule$")
	public void user_clicks_on_customers_module_and_selects_customer_submodule() throws InterruptedException
	
	{
		WebElement customers = driver.findElement(By.xpath("(//i[@class='right fas fa-angle-left '])[4]"));
		
		 Actions act1 = new Actions(driver);
		 act1.moveToElement(customers).click().build().perform();  
		
		 Thread.sleep(2000);
		 
		 WebElement customer = driver.findElement(By.xpath("(//i[@class='nav-icon far fa-dot-circle'])[13]"));
			
		 Actions act2 = new Actions(driver);
		 act2.moveToElement(customer).click().build().perform(); 
		 
		
		
	}
	
	
	@And("^user moves to add new button$")
	public void user_moves_to_add_new_button()
	
	{
		
		
		WebElement AddNewButton = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(AddNewButton).click().build().perform();
		
	}
	
	
	
	
	@When("^user fills the customer info and clicks on save button$")
	public void user_fills_the_customer_info_and_clicks_on_save_button(DataTable dataTable) throws InterruptedException 
	
	{
	   
		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
	     
		 for (Map<String, String> e : userlist)
			    
		 {
		 WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));	 
		 WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		 WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		 WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		 WebElement Gender = driver.findElement(By.xpath("//input[@id='Gender_Male']"));	
		 WebElement DateOfBirth = driver.findElement(By.xpath("//input[@id='DateOfBirth']"));
		 WebElement CompanyName = driver.findElement(By.xpath("//input[@id='Company']"));
		 WebElement TaxExempt = driver.findElement(By.xpath("//input[@id='IsTaxExempt']"));
//		 WebElement NewsLetter = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
//		 WebElement TestStore2 = driver.findElement(By.xpath("//li[text()='Test store 2']"));
//		 WebElement CustomerRoles = driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
//		 WebElement Registered = driver.findElement(By.xpath("//li[text()='Registered']"));
//		 WebElement ManagerOfVendor = driver.findElement(By.xpath("//li[text()='Registered']"));
		 WebElement AdminComment = driver.findElement(By.xpath("//textarea[@id='AdminComment']"));
		 WebElement SaveButton = driver.findElement(By.xpath("//button[@name='save']"));
		 
		 
		 Email.sendKeys(e.get("email"));
		 Thread.sleep(2000);
		 
		 Password.sendKeys(e.get("password"));
		 
		 Thread.sleep(2000);
		 
		 FirstName.sendKeys(e.get("firstname"));
		 Thread.sleep(2000);
		 
		 LastName.sendKeys(e.get("lastname")); 
		 Thread.sleep(2000);
		 
		 boolean result = Gender.isSelected();
		 if(result)
		 {
			 System.out.println("Already selected");
		 }
		 
		 else
		 {
			 Gender.click();
		 }
		 
		 Thread.sleep(2000);
		 
		 DateOfBirth.sendKeys(e.get("date of birth"));  
		 Thread.sleep(2000);
		 
		 
		 CompanyName.sendKeys(e.get("company name"));  
		 Thread.sleep(2000);
		 
		 boolean result1 = TaxExempt.isSelected();
		 if(result1)
		 {
			 System.out.println("Already selected");
		 }
		 
		 else
		 {
			 TaxExempt.click();
		 }
		 
		 Thread.sleep(2000);
		 
//		 NewsLetter.click();
//		 Thread.sleep(2000);
		 
//		 Select s1 = new Select(NewsLetter);
//		 s1.selectByValue("2");
//		 Thread.sleep(2000);
		 
//		 TestStore2.click();
//		 Thread.sleep(2000);
		 
		 
//		 CustomerRoles.click();
//		 Thread.sleep(2000);
		
//		 Registered.click();
//		 Thread.sleep(2000);
//		 
		 
//		 Select s = new Select(ManagerOfVendor);
//		 s.selectByValue("0");
//		 Thread.sleep(2000);
		 
		
		 AdminComment.sendKeys(e.get("admin comment"));
		 Thread.sleep(2000);
		 
		 
		 SaveButton.click();
		
//		 JavascriptExecutor js = ((JavascriptExecutor)driver);
//		 js.executeScript("arguments[0].ScrollIntoView(true);", SaveButton);
		
	}
	}
	
	
	
	@When("^user verifies the new added customers$")
	public void user_verifies_the_new_added_customers()
	
	{
	   
	
	
	}
//	
//	
//	@When("^returns back to the homepage and logsout and close the browser$")
//	public void returns_back_to_the_homepage_and_logsout_and_close_the_browser() 
//	
//	{
//	   
//		
//		
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
   }
