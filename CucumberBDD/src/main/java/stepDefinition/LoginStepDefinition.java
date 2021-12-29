package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	@Given("^user is present on login page$")
	public void user_is_present_on_login_page()
	
	{
	   
	System.out.println("^user is present on login page$");
	
	}
	
	
	@Given("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() 
	
	{
	   
	System.out.println("title of login page is Free CRM");
		
	}
	
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password()
	
	{
	    
		System.out.println("user enters username and password");
		
	}
	
	
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button()
	
	{
	   
		System.out.println("user clicks on login button");
		
	}
	
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	
	{
	   
		System.out.println("user is on home page");
	
	}	
	
	

}
