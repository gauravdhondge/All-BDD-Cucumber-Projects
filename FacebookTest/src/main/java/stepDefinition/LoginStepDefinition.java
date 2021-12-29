package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
	private WebDriver driver;
	
	
	@Given("^user is already present on loginpage$")
	public void user_is_already_present_on_loginpage() 
	{
	    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
	//System.setProperty("webdriver.edge.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
	
	driver = new ChromeDriver();
	//driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(" https://www.facebook.com");
		
	}

	@When("^title of the page is facebook$")
	public void title_of_the_page_is_facebook() 
	{
		
	 String title = driver.getTitle();
	 System.out.println(title);
		
	}
	

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException
	{
	 
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
	email.sendKeys("gauravdhondge@gmail.com");
	Thread.sleep(4000);
	password.sendKeys("Gaurav@123");
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
		
	WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']")); 
	
	loginbutton.click();
	
	
	}

	@And("^user is on homepage$")
	public void user_is_on_homepage()  
	
	{
	   
	String homepagetitle = driver.getTitle();
    System.out.println(homepagetitle);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
