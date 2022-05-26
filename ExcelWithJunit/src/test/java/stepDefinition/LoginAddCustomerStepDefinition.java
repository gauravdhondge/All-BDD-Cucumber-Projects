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
import pages.AddCustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginAddCustomerStepDefinition {

	
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private AddCustomerPage addcustomerpage = new AddCustomerPage(DriverFactory.getDriver());

	@Given("^user is present on login page$")
	public void user_is_present_on_login_page()

	{

		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);

	}

	@And("^title of login page is GTPL Bank Home Page$")
	public void title_of_login_page()

	{

		PageTitle = loginpage.getPageTitle();
		System.out.println("The Page title is displayed as " + PageTitle);

	}

	
	@When("user enters userID and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName,Integer RowNumber) throws Throwable {
	
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("D:\\projects\\Junit with excel\\JunitExcel.xlsx", SheetName);

		String userid = testdata.get(RowNumber).get("UserID");
		String password = testdata.get(RowNumber).get("password");

		loginpage.EnterUserID_and_Password(userid, password);	
		
	}

	

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException

	{

		loginpage.ClickLoginButton();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = loginpage.getHomePageTitle();
		System.out.println("The HomePage title is displayed as " + HomePageTitle);

	}

	@And("user clicks on telecom project and selects add customer")
	public void user_clicks_on_telecom_project_and_selects_add_customer() throws InterruptedException

	{

		homepage.ClickTelecomProject_and_Select_AddCustomer();

	}
	
	
	@When("user selects background check as done and enters billing address from given sheetname {string} and rownumber {int}")
	public void user_selects_background_check_as_done_and_enters_billing_address_from_given_sheetname_and_rownumber(String SheetName,Integer RowNumber)throws Throwable {
	   
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("D:\\projects\\Junit with excel\\JunitExcel.xlsx", SheetName);

		String firstname = testdata.get(RowNumber).get("firstname");
		String lastname = testdata.get(RowNumber).get("lastname");
		String email = testdata.get(RowNumber).get("email");
		String address = testdata.get(RowNumber).get("address");
		String mobilenumber = testdata.get(RowNumber).get("mobilenumber");

		addcustomerpage.select_BackGroundCheck_done_Enter_Billing_Address_and_Click_SubmitButton(firstname, lastname,
		email,address,mobilenumber);
		
				
	}
    }
