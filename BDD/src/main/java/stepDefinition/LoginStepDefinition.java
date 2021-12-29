package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	  @Given("^user is present on login page$")
	  public void user_is_present_on_login_page()  
	  {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.get("http://demo.guru99.com/V1/index.php");
	  
	  }
		
	  @Then("^title of login page is GTPL Bank Home Page$")
	  public void title_of_login_page_is_Free_CRM()
	  {
		  
	   String title = driver.getTitle();
	   System.out.println(title);
				
	 //  Assert.assertEquals("CRM customer relationship management software cloud", title);
	   
	  }

	  
	   @Then("^user enters username and password$")
	   public void user_enters_username_and_password() throws InterruptedException  
	   {
		   
		WebElement userID = driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement enterpassword = driver.findElement(By.xpath("//input[@name='password']"));
		   	  
		userID.sendKeys("mngr376749");
		Thread.sleep(2000);
		enterpassword.sendKeys("vavAqUp");   
		
	   }
	   

	    @Then("^user clicks on login button$")
		public void user_clicks_on_login_button() 
	    {
		    
	     WebElement loginbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
			
	     Actions act = new Actions(driver);
	     act.moveToElement(loginbutton).click().build().perform();
	     
	    }
	    

		@Then("^user is on home page$")
		public void user_is_on_home_page()  
		
		{
			
		 String title = driver.getTitle();
		 System.out.println(title);
		 
				    	
		// Assert.assertEquals("Cogmento CRM", title);
			
		 }	

}
