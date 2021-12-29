package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginContactsStepDefinition {

	
	WebDriver driver;
	
	@Given("^user is already present on loginpage$")
	public void user_already_present_on_loginpage()
	  {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
	 //System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
		
	 driver = new ChromeDriver();
	 //driver = new EdgeDriver();
		
	 driver.manage().window().maximize();
		
	 driver.get("https://classic.freecrm.com/index.html ");	
		
	  }


	@Then("^title of loginpage$")
	public void title_of_loginpage() 

	 {
	    
	String titleofloginpage = driver.getTitle();
	System.out.println(titleofloginpage);
	 
	 
	 }




	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable address)
	  {
		
	     List<List<String>> data = address.asLists(String.class);

	 
	      
	      WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	      WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

	      username.sendKeys(data.get(0).get(0));
	      password.sendKeys(data.get(0).get(1));
	      
	      
	   }


	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	 {
	    
	WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Login']"));
	loginbutton.click();
		
		
	 }


	@Then("^title of mainpage$")
	public void title_of_mainpage() 
	 {
		
	String TitleOMainPage = driver.getTitle();
	System.out.println(TitleOMainPage );
	 
	 }


	@Then("^close the browser$")
	public void close_the_browser()

	{
		
		driver.quit();
		
	}

			
 }
		
	
	
	
	
	
	
	
	
	
	

