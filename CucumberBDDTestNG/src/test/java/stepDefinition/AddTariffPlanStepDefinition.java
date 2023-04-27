package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import basePackage.ConfigReader;
import basePackage.DriverFactory;
import basePackage.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginAddCustomerPage;
import pages.LoginAddTariffPlan;

public class AddTariffPlanStepDefinition {
	
	
	private LoginAddTariffPlan loginaddtariffplan = new LoginAddTariffPlan(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	private String GetCustomerPageTitle;

	@Given("^user is already present on login page$")
	public void user_is_present_on_login_page()

	{

		configreader = new ConfigReader();
		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);
		
		
	}

	@And("^title of the login page is GTPL Bank Home Page$")
	public void title_of_login_page()

	{
		
	    PageTitle =  loginaddtariffplan.getPageTitle();
		System.out.println("The Page title is displayed as "+ PageTitle);

	}
	
	
	@When("user enter userID and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException 
	
	{
	 
		ExcelReader reader = new ExcelReader();
	List<Map<String,String>> testdata =	reader.getData("D:\\projects\\LoginDetailsData.xlsx",SheetName);
		
	String userid = testdata.get(RowNumber).get("UserID");
	String password = testdata.get(RowNumber).get("Password");	
		
	loginaddtariffplan.EnterUserID_and_Password(userid, password);	
	
	
	}
	
	

	@And("^user clicks on the login button$")
	public void user_clicks_on_login_button() throws InterruptedException

	{
		
		loginaddtariffplan.ClickLoginButton();

	}
 
	
	@Then("^user navigates to home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = loginaddtariffplan.getHomePageTitle();
		System.out.println("The HomePage title is displayed as "+ HomePageTitle);
	
	}
	
	
	@Then("^user clicks on Telecom Project field$")
	public void user_clicks_on_telecom_project() throws InterruptedException

	{

		loginaddtariffplan.ClickOnTelecomProject();
		
	}
	
	
	@Then("^user clicks on the close button$")
	public void user_clicks_on_Close_Button() throws InterruptedException

	{

		loginaddtariffplan.ClickOnCloseButton();
		
	}
	
	
	
	
	@Then("^user clicks on add Tariff Plan$")
	public void user_clicks_on_Add_Customer() throws InterruptedException

	{

		loginaddtariffplan.ClickOnAddTariffPlanButton();
		
	}
	
	
	@Then("^user is on add tariff plan page$")
	public void user_is_on_Add_CustomerPage() throws InterruptedException

	{

		GetCustomerPageTitle = loginaddtariffplan.GetCustomerPageTitle();
		System.out.println("The Customer Page title is displayed as"+ GetCustomerPageTitle);
	
	}
	
	
	@Then("user enters tariff plan details from given sheetname {string} and rownumber {int}")
	public void User_Enters_BillingAddress(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException

	{

		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testdata =	reader.getData("D:\\projects\\LoginDetailsData.xlsx",SheetName);
			
		String MonthlyRental = testdata.get(RowNumber).get("MonthlyRental");
		String FreeLocalMin = testdata.get(RowNumber).get("FreeLocalMinutes");	
		String FreeInternationalMin = testdata.get(RowNumber).get("FreeInternationalMinutes");
		String FreeSMSPack = testdata.get(RowNumber).get("FreeSMSPack");	
		String LocalPerMinCharges = testdata.get(RowNumber).get("LocalPerMinutesCharges");
		String InternationalPerMinCharges = testdata.get(RowNumber).get("InternationalPerMinuteCharges");
		String SMSPerCharges = testdata.get(RowNumber).get("SMSPerCharges");
		
			
		loginaddtariffplan.EnterTariffPlanDetails(MonthlyRental,FreeLocalMin,FreeInternationalMin,FreeSMSPack,LocalPerMinCharges,InternationalPerMinCharges,SMSPerCharges);
		
	}

}
