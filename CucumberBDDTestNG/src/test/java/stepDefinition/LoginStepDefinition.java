package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
import pages.LoginAddCustomerPage;

public class LoginStepDefinition {
	
	private LoginAddCustomerPage loginaddcustomer = new LoginAddCustomerPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	private String GetCustomerPageTitle;

	@Given("^user is present on login page$")
	public void user_is_present_on_login_page()

	{

		configreader = new ConfigReader();
		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);
		
		
	}

	@And("^title of login page is GTPL Bank Home Page$")
	public void title_of_login_page()

	{
		
	    PageTitle =  loginaddcustomer.getPageTitle();
		System.out.println("The Page title is displayed as "+ PageTitle);

	}
	
	
	@When("user enters userID and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException 
	
	{
	 
		ExcelReader reader = new ExcelReader();
	List<Map<String,String>> testdata =	reader.getData("D:\\projects\\LoginDetailsData.xlsx",SheetName);
		
	String userid = testdata.get(RowNumber).get("UserID");
	String password = testdata.get(RowNumber).get("password");	
		
	loginaddcustomer.EnterUserID_and_Password(userid, password);	
	
	
	}
	
	

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException

	{
		
		loginaddcustomer.ClickLoginButton();

	}
 
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = loginaddcustomer.getHomePageTitle();
		System.out.println("The HomePage title is displayed as "+ HomePageTitle);
	
	}
	
	
	@Then("^user clicks on Telecom Project$")
	public void user_clicks_on_telecom_project() throws InterruptedException

	{

		loginaddcustomer.ClickOnTelecomProject();
		
	}
	
	
	@Then("^user clicks on close button$")
	public void user_clicks_on_Close_Button() throws InterruptedException

	{

		loginaddcustomer.ClickOnCloseButton();
		
	}
	
	
	
	
	@Then("^user clicks on add customer button$")
	public void user_clicks_on_Add_Customer() throws InterruptedException

	{

		loginaddcustomer.ClickOnAddCustomerButton();
		
	}
	
	
	@Then("^user is on add customer page$")
	public void user_is_on_Add_CustomerPage() throws InterruptedException

	{

		GetCustomerPageTitle = loginaddcustomer.GetCustomerPageTitle();
		System.out.println("The Customer Page title is displayed as"+ GetCustomerPageTitle);
	
	}
	
	
	
	
	
	@Then("user enters billing address from given sheetname {string} and rownumber {int}")
	public void User_Enters_BillingAddress(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException

	{

		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testdata =	reader.getData("D:\\projects\\LoginDetailsData.xlsx",SheetName);
			
		String FirstName = testdata.get(RowNumber).get("FirstName");
		String LastName = testdata.get(RowNumber).get("LastName");	
		String Email = testdata.get(RowNumber).get("Email");
		String Address = testdata.get(RowNumber).get("Address");	
		String mobileNumber = testdata.get(RowNumber).get("MobileNumber");	
		
			
		loginaddcustomer.EnterBillingAddress(FirstName, LastName, Email, Address, mobileNumber);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

  }
