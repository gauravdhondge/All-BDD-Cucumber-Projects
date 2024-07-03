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
import pages.EntityInformationPage;
import pages.GenericMethod;
import pages.InspectorPage;
import pages.LoginAddCustomerPage;

public class LoginStepDefinition  {

	LoginAddCustomerPage loginaddcustomer = new LoginAddCustomerPage(DriverFactory.getDriver());
	EntityInformationPage entityInformationPage=new EntityInformationPage(DriverFactory.getDriver());
	InspectorPage inspectorPage= new InspectorPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	//private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	private String GetCustomerPageTitle;
	private String ForgetPasswordPageTitle;



	@Given("^user is present on login page$")
	public void user_is_present_on_login_page() {
		configreader = new ConfigReader();
		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Given("^inspector is present on login page$")
	public void Inspector_is_present_on_login_page() {
		configreader = new ConfigReader();
		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@And("^title of login page is Login$")
	public void title_of_login_page() throws InterruptedException {
		PageTitle = loginaddcustomer.getHomePageTitle();
		System.out.println("The Page title is displayed as " + PageTitle);
	}


	@When("user enters userID and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {configreader = new ConfigReader();
			ExcelReader reader = new ExcelReader();
//	List<Map<String,String>> testdata =	reader.getData("C:\\InspectionsSystem_OutSystem\\LoginDetailsData.xlsx",SheetName);
			List<Map<String, String>> testdata = reader.getData("resources\\LoginDetailsData.xlsx", SheetName);
			String userid = testdata.get(RowNumber).get("UserID");
			String password = testdata.get(RowNumber).get("password");
			loginaddcustomer.EnterUserID_and_Password(userid, password);
		}

	@When("inspector enters userID and Password from given sheetname {string} and rownumber {int}")
	public void inspector_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {configreader = new ConfigReader();
		GenericMethod genericMethod=new GenericMethod();
		genericMethod.waitFor(5);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("resources\\LoginDetailsData.xlsx", SheetName);
		String userid = testdata.get(RowNumber).get("UserID");
		String password = testdata.get(RowNumber).get("password");
		loginaddcustomer.InspectorEntersUserID_and_Password(userid, password);
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException
	{
		loginaddcustomer.ClickLoginButton();
	}

	@And("^inspector clicks on login button$")
	public void inspector_clicks_on_login_button() throws InterruptedException
	{
		loginaddcustomer.ClickLoginButtonInspector();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException
	{
		HomePageTitle = loginaddcustomer.getHomePageTitle();
		System.out.println("The HomePage title is displayed as "+ HomePageTitle);
	}

	@Then("^user signing out$")
	public void user_signing_out() throws InterruptedException{
	//	entityInformationPage.logOut();
	}

	@Then("^Inspector Manager signs out from the application$")
	public void user_signs_out_from_the_application() throws InterruptedException{
		entityInformationPage.logOutInspectorManager();
		DriverFactory.getDriver().quit();

	}

	@Then("^Inspector signs out from the application$")
	public void Inspector_signs_out_from_the_application() throws InterruptedException{
		entityInformationPage.logOutInspector();
		DriverFactory.getDriver().quit();

	}

	@Then("^Reviewer signs out from the application$")
	public void Reviewer_signs_out_from_the_application() throws InterruptedException{
		entityInformationPage.logOutReviewer();
		DriverFactory.getDriver().quit();

	}

	@Then("^Approver signs out from the application$")
	public void Approver_signs_out_from_the_application() throws InterruptedException{
		entityInformationPage.logOutApprover();
		DriverFactory.getDriver().quit();

	}


	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws InterruptedException{
		DriverFactory.getDriver().quit();

	}



	@Then("user should get an error message")
	public void user_should_get_an_error_message() {
		loginaddcustomer.verifyErrorMessage();
	}
	
	@When("User checks Remember me checkbox")
	public void user_checks_remember_me_checkbox() {
		loginaddcustomer.RememberMeCheckBox();
	}
	
  }
