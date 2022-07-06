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
import pages.AddCustomerPage;

public class LoginAddCustomer {
	
	private AddCustomerPage addcustomerpage = new  AddCustomerPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private WebDriver driver;
	private String PageTitle;
	private String HomePageTitle;
	
	

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
		
	    PageTitle =  addcustomerpage.getPageTitle();
		System.out.println("The Page title is displayed as "+ PageTitle);

	}
	
	
	@When("user enters userID and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_user_id_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException 
	
	{
	 
		ExcelReader reader = new ExcelReader();
	List<Map<String,String>> testdata =	reader.getData("D:\\Parallel Testing\\LoginAndAddCustomerDetails.xlsx",SheetName);
		
	String userid = testdata.get(RowNumber).get("USER_ID");
	String password = testdata.get(RowNumber).get("PASSWORD");	
		
	addcustomerpage.EnterUserID_and_Password(userid, password);	
	
	
	}
	
	

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException

	{
		
		addcustomerpage.ClickLoginButton();

	}
 
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException

	{

		HomePageTitle = addcustomerpage.getHomePageTitle();
		System.out.println("The HomePage title is displayed as "+ HomePageTitle);
	
	}

}
