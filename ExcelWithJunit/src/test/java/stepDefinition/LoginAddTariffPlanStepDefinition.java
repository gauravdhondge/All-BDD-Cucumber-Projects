package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import AddTariffPlanPages.AddTariffPlanHomePage;
import AddTariffPlanPages.AddTariffPlanLoginPage;
import AddTariffPlanPages.TariffPlanPage;
import basePackage.ConfigReader;
import basePackage.DriverFactory;
import basePackage.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddCustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginAddTariffPlanStepDefinition {
	
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	private AddTariffPlanHomePage tariffplanhomepage = new AddTariffPlanHomePage(DriverFactory.getDriver());
	private AddTariffPlanLoginPage tariffplanloginpage = new AddTariffPlanLoginPage(DriverFactory.getDriver());
	private TariffPlanPage tariffplanpage = new TariffPlanPage(DriverFactory.getDriver());

	
	
	
	
	@Given("^user is already present on login page$")
	public void user_is_present_on_login_page()

	{

		String url = configreader.initialiseProperties("URL");
		DriverFactory.getDriver().get(url);

	}

	@And("^the title of login page is GTPL Bank Home Page$")
	public void title_of_login_page()

	{

		PageTitle = tariffplanloginpage.getPageTitle();
		System.out.println("The Page title is displayed as " + PageTitle);

	}

	@When("user enters username and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_usernme_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException

	{

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("D:\\projects\\Junit with excel\\TariffPlan.xlsx", SheetName);

		String userid = testdata.get(RowNumber).get("UserID");
		String password = testdata.get(RowNumber).get("password");

		tariffplanloginpage.EnterUserID_and_Password(userid, password);

	}

	@And("^then user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException

	{

		tariffplanloginpage.ClickLoginButton();

	}

	@Then("^user comes on home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = tariffplanloginpage.getHomePageTitle();
		System.out.println("The HomePage title is displayed as " + HomePageTitle);

	}

	
	@And("user clicks on telecom project and selects add tariff plan")
	public void user_clicks_on_telecom_project_and_selects_add_customer() throws InterruptedException

	{

		tariffplanhomepage.ClickTelecomProject_and_Select_AddTariffPlan();

	}
	
	
	
	@When("user enters add tariff plan details from given sheetname {string} and rownumber {int}")
	public void user_enters_Add_Tariff_Plan_details_from_given_sheetname_and_rownumber(
			String SheetName, Integer RowNumber) throws Throwable

	{

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("D:\\projects\\Junit with excel\\TariffPlan.xlsx", SheetName);

		String monthlyrental = testdata.get(RowNumber).get("MonthlyRental");
		String freelocalminutes = testdata.get(RowNumber).get("FreeLocalMinutes");
		String freeinternationalminutes = testdata.get(RowNumber).get("FreeInternationalMinutes");
		String freesmspack = testdata.get(RowNumber).get("FreeSMSPack");
		String localperminutecharges = testdata.get(RowNumber).get("LocalPerMinuteCharges");
		String internationalperminutecharges = testdata.get(RowNumber).get("InternationalPerMinuteCharges");
		String smspercharges = testdata.get(RowNumber).get("SMSPerCharges");
		
		
		tariffplanpage.Enter_TariffPlanDetails_and_Click_SubmitButton(monthlyrental,
	    freelocalminutes,freeinternationalminutes,freesmspack,localperminutecharges,
	    internationalperminutecharges,smspercharges);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
