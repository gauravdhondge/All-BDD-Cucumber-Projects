package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basePackage.ConfigReader;
import basePackage.DriverFactory;
import basePackage.ExcelReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefinition {
	
	private LoginPage loginpage = new  LoginPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;

	
	@Given("^user is present on loginpage$")
	public void user_is_present_on_loginpage() 
	
	{
	
		configreader = new ConfigReader();
		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);	
		
		
	}
	


	@And("^title of loginpage is Your store Login$")
	public void title_of_login_page()

	{
		
	    PageTitle =  loginpage.getPageTitle();
		System.out.println("The Page title is displayed as "+ PageTitle);

	}
	
	
	
	
	@When("user enters email and password from given sheetname {string} and rownumber {int}")
	public void user_enters_email_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException
	
	{
	
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testdata =	reader.getData("D:\\jayesh\\LoginDataDetails.xlsx",SheetName);
			
		String email = testdata.get(RowNumber).get("email");
		String password = testdata.get(RowNumber).get("password");	
			
		loginpage.Email_and_Password(email, password);	
		
	}
	

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button()

	{
		
		loginpage.ClickLoginButton();

	}
 
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = loginpage.getHomePageTitle();
		System.out.println("The HomePage title is displayed as "+ HomePageTitle);
	
	}

  }
