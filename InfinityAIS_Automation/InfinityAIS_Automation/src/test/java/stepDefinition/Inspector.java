package stepDefinition;

import basePackage.ConfigReader;
import basePackage.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import io.cucumber.java.sl.In;
import pages.EntityInformationPage;
import pages.InspectionManagerHomePage;
import pages.InspectorPage;
import pages.LoginAddCustomerPage;

import java.awt.*;

public class Inspector {
	
	private LoginAddCustomerPage loginaddcustomer = new LoginAddCustomerPage(DriverFactory.getDriver());
	private EntityInformationPage entityInformationPage =new EntityInformationPage(DriverFactory.getDriver());
	private ConfigReader configreader = new ConfigReader();
	private InspectionManagerHomePage inspectionManagerHomePage= new InspectionManagerHomePage(DriverFactory.getDriver());
	private InspectorPage inspectorPage=new InspectorPage(DriverFactory.getDriver());

	@And("^inspector does not complete the inspection$")
	public void inspector_does_not_complete_the_inspection() throws InterruptedException{
		inspectorPage.incompleteInspection();
	}

	@And("^inspector clicks on the created case and completes it$")
	public void inspector_clicks_on_the_created_case_and_completes_it() throws InterruptedException{
		inspectorPage.clickoncreatedcaseandcompleteit();
	}

//	@And("^inspector searches the case and completes it$")
//	public void inspector_searches_the_case_and_completes_it() throws InterruptedException{
//		inspectorPage.InspectorSearchescaseandcompleteit();
//	}



	@And("^reviewer reviews the inspection and approves it$")
	public void reviewer_reviews_the_inspection_and_approves_it() throws Exception {
		entityInformationPage.assignToReviewerAndApprovesIt();
	}



	@And("^inspector searches the case and completes it$")
	public void inspector_searches_the_case_and_completes_it() throws Exception {
		entityInformationPage.InspectorSearchesAndCompleteCase();
	}

	@And("^inspector searches the case and completes it and click on cancel$")
	public void inspector_searches_the_case_and_completes_it_and_Click_Cancel() throws Exception {
		entityInformationPage.InspectorSearchesAndCompleteCaseAndClickOnCancel();
	}

	@And("^inspector searches the case and Not Complete Inspection Form$")
	public void inspector_not_Complete_Inspection_Form() throws Exception {
		entityInformationPage.InspectorSearchesCaseAndNotCompleteInspectionForm();
	}

	@And("^approver reviews the inspection and approves it$")
	public void approver_reviews_the_inspection_and_approves_it() throws Exception {
		entityInformationPage. assignToApproverAndApprovesIt();
	}

	@And("^inspector clicks on the created case and saves it$")
	public void inspector_clicks_on_the_created_case_and_saves_it() throws Exception {
		entityInformationPage.InspectorFillsInformationFormAndSaveIt();
	}

	@And("^reviewer reviews the inspection and rejects it$")
	public void reviewer_reviews_the_inspection_and_rejects_it() throws Exception {
		entityInformationPage.reviewerRejects();
	}
	@And("^inspection manager gets the case name of the newly created reinspection case$")
	public void inspection_manager_gets_the_case_name_of_the_newly_created_reinspection_case() throws Exception{
		entityInformationPage.getReinspectionCaseName();
	}

	@And("^inspector reinspects the rejected inspection$")
	public void inspector_reinspects_the_rejected_inspection() throws Exception{
		entityInformationPage.managerReinspects();
	}
	}
