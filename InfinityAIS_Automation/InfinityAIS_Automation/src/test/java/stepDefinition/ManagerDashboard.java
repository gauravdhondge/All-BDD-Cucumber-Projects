package stepDefinition;

import java.awt.AWTException;
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
import pages.AddPatientFormPage;
import pages.ConfirmPatientDetailsAndAddAnotherPatientPage;
import pages.InspectionManagerHomePage;
import pages.LoginAddCustomerPage;
import pages.EntityInformationPage;
import pages.GenericMethod;

public class ManagerDashboard {
	
	private LoginAddCustomerPage loginaddcustomer = new LoginAddCustomerPage(DriverFactory.getDriver());
	private EntityInformationPage entityInformationPage =new EntityInformationPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private InspectionManagerHomePage inspectionManagerHomePage= new InspectionManagerHomePage(DriverFactory.getDriver());
	

	@Then("user verify all the tabs on the Page")
	public void user_verify_all_the_tabs_on_the_page() throws InterruptedException {
		inspectionManagerHomePage.verifyPegaInfinityManagerDashboardTab();
//		inspectionManagerHomePage.verifyManagerDashboardTab();
		inspectionManagerHomePage.verifyReportsTab();
		inspectionManagerHomePage.verifyManagePeriodicityTab();
		Thread.sleep(5000);
	}
	
	@Then("user starts to creates a new Inspection and click on cancel Button")
	public void user_starts_to_creates_a_new_inspection_and_click_on_cancel_button() throws InterruptedException, AWTException {
		inspectionManagerHomePage.clickonCreateNewButton();
		entityInformationPage.checkCreateCaseLable();
		entityInformationPage.checkEntityNameLable();
		entityInformationPage.enterEntityName();
		entityInformationPage.checkCheckbox();
		entityInformationPage.clickonCancelButton();
	}

	@Then("user starts to creates a new Inspection case and click on cancel Button")
	public void user_starts_to_creates_a_new_inspection_case_and_click_on_cancel_button() throws InterruptedException, AWTException {
		inspectionManagerHomePage.clickonInspectionButton();
		entityInformationPage.checkNewInspectionLable();
		entityInformationPage.checkEntityNameButton();
		entityInformationPage.enterEntityNameInTextBox();
		entityInformationPage.clickOnSearchButton();
		entityInformationPage.ClickCheckbox();
		entityInformationPage.SelectInspectiontype();
		entityInformationPage.clickCancelButton();
		entityInformationPage.clickDeleteButton();
	}



	
	@Then("user starts to creates a new Inspection and completes the inspection.")
	public void user_starts_to_creates_a_new_inspection_and_completes_the_inspection() throws Exception {
		inspectionManagerHomePage.clickonCreateNewButton();
		entityInformationPage.checkCreateCaseLable();
		entityInformationPage.checkEntityNameLable();
		entityInformationPage.enterEntityName();
		entityInformationPage.checkCheckbox();
		entityInformationPage.clickOnNextButton();
		entityInformationPage.selectTypeofInspection();
		entityInformationPage.selectDatefromCalendar();
		entityInformationPage.selectInspector();
		entityInformationPage.selectPreInspectionChecklist();
		entityInformationPage.clickOnSubmitButton();
		entityInformationPage.getInspectionBy();
	}

	@Then("Inspector Manager Creates the new case")
	public void Inspector_Manager_Creates_the_new_case() throws Exception {
		inspectionManagerHomePage.clickonInspectionButton();
		entityInformationPage.checkNewInspectionLable();
		entityInformationPage.checkEntityNameButton();
		entityInformationPage.enterEntityNameInTextBox();
		entityInformationPage.clickOnSearchButton();
		entityInformationPage.ClickCheckbox();
		entityInformationPage.SelectInspectiontype();
		entityInformationPage.clickSubmitButton();
		entityInformationPage.selectInspectionStartDate();
		entityInformationPage.InspectorSelect();
		entityInformationPage.selectPreInspectionChecklistItems();
		entityInformationPage.StatusBeforeCreatingCase();
		entityInformationPage.SubmitButtonClick();
		entityInformationPage.VerifyCaseRoutedMessage();
		entityInformationPage.StatusAfterCreatingCase();

	}




	}
