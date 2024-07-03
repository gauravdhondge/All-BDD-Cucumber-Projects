package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.cucumber.java.sl.In;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.GenericMethod;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class EntityInformationPage extends GenericMethod{
	public static String caseID;
	public static String CaseIDValue;
	public static String InspectorName;
	public static String StatusApproverPool;
	GenericMethod genericMethod= new GenericMethod();

	private static WebDriver driver;

	private By LableCreateCase=By.xpath("//div[@id='b14-MainContent']//span[contains(text(),'Create Case')]");

	private By LableNewInspection=By.xpath("//h2[text()='New    Inspection   ']");
	private By LableEntityName=By.xpath("//span[contains(text(),'Entity Name')]");

	private By EntityNameButton=By.xpath("//label[text()='Entity Name']");
	private By StatusFinal= By.xpath("//td[@data-header='Status']");
	private By EnterEntityName=By.xpath("//input[@id='Input_TextVar2']");

	private By EnterEntityNameIntextbox=By.xpath("//input[@name='$PpyWorkPage$pSearchID']");

	private By EnterInspectionType=By.xpath("//input[@name='$PpyWorkPage$pInspectionType']");
	private By checkCheckBox=By.xpath("//input[contains(@id,'Checkbox2')]");
	private By clickOnCancelButton=By.xpath("//button[contains(text(),'Cancel')]");
	private By ClickOnNextButton=By.xpath("//span[contains(text(),'Next')]");
	private static By CaseID= By.xpath("//input[@id='b18-Input_CaseID']");
	private static By CaseIDVal= By.xpath("//span[@class='case_title']");
	private By typeofInspection=By.xpath("//select[@id='b18-b4-Dropdown1']");

	private By SelectInspectionStartDate=By.xpath("//img[@alt='Choose from calendar']");
	private By SelectStartDate=By.xpath("//div[@id='b18-b6-Icon']");

	private By selectInspectionDate=By.xpath("//a[@id='todayLink']");
	private By selectDate=By.xpath("//span[@class='flatpickr-day today']");

	private By selectInspector1=By.xpath("//span[contains(text(),'Automation')][2]");

	private By InspectorSelection=By.xpath("//button[@title='Inspector@AIF']");
	private By selectInspector=By.xpath("(//span[contains(text(),'Automation')][1])[2]");
	private By selectInspector2=By.xpath("//span[contains(text(),'Automation')][3]");
	private By selectPreInspectionChecklistCheckbox=By.xpath("//input[@id='b18-b11-Checkbox2']");
	private By SubmitButton=By.xpath("//span[contains(text(),'Submit')]");
	private By searchBoxCaseID= By.xpath("//input[@id='Search_Input2']");
	private By searchBoxPool=By.xpath("//input[@id='Search_Input']");

	private By searchBox=By.xpath("//input[contains(@name,'$ppySearchKeyword')]");

	private By ApproversearchBox=By.xpath("(//input[contains(@name,'$ppySearchKeyword')])[1]");
	private By assignToReviewerCheckbox=By.xpath("(//input[@type='checkbox'])[2]");
	private By assignButton= By.xpath("//button[text()='Assign']");
	private static By InspectionByName= By.xpath("(//td[@data-header='Inspection By'])[1]");
	private static By ApproverPoolStatus=By.xpath("(//td[@data-header='Status'])[1]");
	private By logOut=By.id("b1-b3-Icon3");

    private  By FuelhandlingStorage = By.xpath("(//span[text()='Fuel Handling and Storage'])[2]");

	private  By PreStartUpReview = By.xpath("(//span[text()='Pre-Startup Safety Review'])[1]");


	SoftAssert softAssert=new SoftAssert();

	public EntityInformationPage(WebDriver driver)  {
		this.driver = driver;
	}

	public void checkCreateCaseLable() {
		String caseLable=driver.findElement(LableCreateCase).getText();
		softAssert.assertEquals(caseLable, "Create Case");
	}

	public void checkNewInspectionLable() {
		String caseLable=driver.findElement(LableNewInspection).getText();
		softAssert.assertEquals(caseLable, "New    Inspection   ");
	}


	public void getReinspectionCaseName() throws InterruptedException{
		genericMethod.waitFor(2);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys("Re-Inspection");
		genericMethod.waitFor(2);
		getInspectorName();
		System.out.println(InspectorName);
	}


	public void checkEntityNameLable() {
		String entityLable=driver.findElement(LableEntityName).getText();
		softAssert.assertEquals(entityLable,"Entity Name");
	}

	public void checkEntityNameButton() {
		String entityLable=driver.findElement(EntityNameButton).getText();
		softAssert.assertEquals(entityLable,"Entity Name");
	}


	public void enterEntityName() throws InterruptedException {
		driver.findElement(EnterEntityName).sendKeys("Abots");
		Thread.sleep(5000);
	}

	public void enterEntityNameInTextBox() throws InterruptedException {
		driver.findElement(EnterEntityNameIntextbox).sendKeys("NuPower Safety Solutions");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='match-highlight' and text()='NuPower Safety Solutions']")).click();
		Thread.sleep(2000);
	}


	public void checkCheckbox() {
		driver.findElement(checkCheckBox).click();

	}

	public void ClickCheckbox() {
		driver.findElement(By.xpath("//input[contains(@name,'$ppxResults$l1$ppySelected')][2]")).click();

	}

	public void SelectInspectiontype() throws InterruptedException {
		driver.findElement(EnterInspectionType).sendKeys("Nuclear Inspection");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='match-highlight' and text()='Nuclear Inspection']")).click();
		Thread.sleep(2000);
	}


	public void clickOnSearchButton() {
		driver.findElement(By.xpath("//button[ text()='Search']")).click();
	}


	public void clickonCancelButton() {
		driver.findElement(clickOnCancelButton).click();
	}

	public void clickCancelButton() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Cancel'])[2]")).click();
		Thread.sleep(3000);
	}

	public void clickSubmitButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}



	public void clickDeleteButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(2000);
	}

	public void clickOnNextButton() {
		driver.findElement(ClickOnNextButton).click();
	}

	public void selectTypeofInspection() {
		driver.findElement(typeofInspection).click();
		Select select=new Select(driver.findElement(typeofInspection));
		select.selectByIndex(1);
	}

	public void selectDatefromCalendar() throws InterruptedException {
		driver.findElement(SelectStartDate).click();
		Thread.sleep(2000);
		driver.findElement(selectDate).click();
//		Date currentDate = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String currentDateTime = dateFormat.format(currentDate);
//		System.out.println(currentDateTime);
	}

	public void selectInspectionStartDate() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(SelectInspectionStartDate).click();
		Thread.sleep(4000);
		driver.findElement(selectInspectionDate).click();
//		Date currentDate = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String currentDateTime = dateFormat.format(currentDate);
//		System.out.println(currentDateTime);
	}


	public void selectInspector() throws InterruptedException {
		genericMethod.waitFor(3);
		getCaseID();
		driver.findElement(selectInspector).click();
	}

	public void InspectorSelect() throws InterruptedException {
		genericMethod.waitFor(3);
		getCaseIDValue();
		driver.findElement(InspectorSelection).click();
	}

	public static String getInspectorName() throws InterruptedException {
		waitFor(3);
		InspectorName = driver.findElement(InspectionByName).getText();
		return InspectorName;
	}

	public static String getStatusApproverPool() throws InterruptedException {
		waitFor(3);
		StatusApproverPool = driver.findElement(ApproverPoolStatus).getText();
		return StatusApproverPool;
	}

	public static String getCaseID() throws InterruptedException {
		waitFor(3);
		caseID= driver.findElement(CaseID).getAttribute("value" );
		return caseID;
	}

	public static String getCaseIDValue() throws InterruptedException {
		waitFor(3);
		String CaseValue= driver.findElement(CaseIDVal).getText();
		CaseIDValue = CaseValue.replace("(","").replace(")","");
		System.out.println(CaseIDValue);
		return CaseIDValue;

	}



	public void selectPreInspectionChecklist() throws InterruptedException {
		genericMethod.waitFor(3);
		driver.findElement(selectPreInspectionChecklistCheckbox).click();
	}

	public void selectPreInspectionChecklistItems() throws InterruptedException {
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pPreInspectionChecklist$l1$ppySelected'])[2]")).click();
	}

	public void StatusBeforeCreatingCase() throws InterruptedException {
//		WebElement Status = driver.findElement(By.xpath("//span[text()='New']"));
//        String StatusBeforeCreatingCase = Status.getText();
//		softAssert.assertEquals(StatusBeforeCreatingCase, "New");
		String StatusBeforeCaseCreation = driver.findElement(By.xpath("//span[text()='New']")).getText();
		Assert.assertEquals(StatusBeforeCaseCreation,"NEW");


	}

	public void StatusAfterCreatingCase() throws InterruptedException {
//		WebElement Status = driver.findElement(By.xpath("//span[text()='Pending']"));
//		String StatusBeforeCreatingCase = Status.getText();
//		softAssert.assertEquals(StatusBeforeCreatingCase, "Pending");
		genericMethod.waitFor(5);
		String StatusAfterCaseCreation = driver.findElement(By.xpath("//span[text()='Pending']")).getText();
		Assert.assertEquals(StatusAfterCaseCreation,"PENDING");
		genericMethod.waitFor(5);

	}


	public void clickOnSubmitButton() throws InterruptedException {
		driver.findElement(SubmitButton).click();
		genericMethod.waitFor(2);
	}

	public void SubmitButtonClick() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		genericMethod.waitFor(5);
	}

	public void VerifyCaseRoutedMessage() throws InterruptedException {
		genericMethod.waitFor(5);
		String verifymessage = driver.findElement(By.xpath("//div[contains(text(),'Case has been routed to')]")).getText();
		System.out.println(verifymessage);


//		WebElement main = driver.findElement(By.xpath("//div[contains(text(),'Case has been routed to')]"));
//	    String text = main.getText();
//		System.out.println(text);

	}

	public void getInspectionBy() throws Exception {
		genericMethod.waitFor(2);
		System.out.println(caseID);
		driver.findElement(searchBoxCaseID).click();
		driver.findElement(searchBoxCaseID).sendKeys(caseID);
		genericMethod.waitFor(2);
		getInspectorName();
		System.out.println(InspectorName);
	}

	public void managerReinspects() throws Exception{

	}


	public void assignToReviewer() throws Exception {
		genericMethod.waitFor(2);
		System.out.println(caseID);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys(caseID);
		genericMethod.waitFor(2);
		driver.findElement(assignToReviewerCheckbox).click();
		genericMethod.waitFor(1);
		driver.findElement(assignButton).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxCaseID).click();
		driver.findElement(searchBoxCaseID).sendKeys(caseID);
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//span[contains(text(),'AIS')]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("//textarea[contains(@id,'TextArea_ReviewerComments')]")).sendKeys("Approved");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//input[@id='ResultPass-input']")).click();
		driver.findElement(By.xpath("//textarea[@id='TextArea_ReviewerInspectionSummary']")).sendKeys("Approved By Reviewer");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		System.out.println("Case has been reviewed successfully");
	}


	public void assignToReviewerAndApprovesIt() throws Exception{

		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//input[contains(@name,'$ppxResults$l1$ppyIsSelected')])[2]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Assign to Me']")).click();
		genericMethod.waitFor(5);
		driver.navigate().refresh();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//h3[text()='MY Task']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//a[@aria-label='Case ID Actions'])[2]")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//span[text()='Apply filter']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//input[contains(@name,'$ppyColumns$l1$ppySearchText')]")).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		genericMethod.waitFor(7);
		driver.findElement(By.xpath("//a[text()='"+CaseIDValue+"']")).click();
//		WebElement ID = driver.findElement(By.xpath("//a[text()='"+CaseIDValue+"']"));
//		WebDriverWait wait= new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(ID));
//		ID.click();
		genericMethod.waitFor(8);
		String InspectorReviewComment = driver.findElement(By.xpath("(//div[@id='rte-default'])[1]")).getText();
		Assert.assertEquals(InspectorReviewComment,"test");
		System.out.println(InspectorReviewComment);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(5);
		WebElement FuelHandlingStorageSelected = driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l2$pResponse'])[3]"));
		if(FuelHandlingStorageSelected.isSelected()){
			System.out.println("Fuel Handling Storage Selected");
		}
		else{
			System.out.println("Fuel Handling Storage not Selected");
		}
		genericMethod.waitFor(5);
		WebElement PreStartUpSafetyReview = driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l3$pResponse'])[1]"));
		if(PreStartUpSafetyReview.isSelected()){
			System.out.println("Pre StartUp Safety Review disabled");
		}
		else{
			System.out.println("Pre StartUp Safety Review not disabled");
		}
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//textarea[@aria-describedby='$PpyWorkPage$pChecklistCategory$l1$pReviewerCommentError']")).sendKeys("Reviewer Automation Testing");
		genericMethod.waitFor(5);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframe);
		System.out.println("Switched to iframe");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("test");
		genericMethod.waitFor(5);
		driver.switchTo().defaultContent();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[1]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(5);
		String CaseRoutedToApprover = driver.findElement(By.xpath("//div[text()='Case has been routed to Approver']")).getText();
		Assert.assertEquals(CaseRoutedToApprover,"Case has been routed to Approver");
		System.out.println(CaseRoutedToApprover);
		genericMethod.waitFor(2);
		String StatusAfterReviewerSubmitsCase = driver.findElement(By.xpath("//span[text()='Pending Approval']")).getText();
		Assert.assertEquals(StatusAfterReviewerSubmitsCase,"PENDING APPROVAL");
		System.out.println(StatusAfterReviewerSubmitsCase);
		genericMethod.waitFor(15);

	}

	public void assignToApproverAndApprovesIt() throws Exception {
		genericMethod.waitFor(15);
		driver.findElement(By.xpath("(//input[contains(@name,'$ppxResults$l1$ppyIsSelected')])[2]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Assign to Me']")).click();
		genericMethod.waitFor(5);
		String CaseMovedToYourtask = driver.findElement(By.xpath("//div[text()='Case moved to your task list']")).getText();
		Assert.assertEquals(CaseMovedToYourtask,"Case moved to your task list");
		System.out.println(CaseMovedToYourtask);
		genericMethod.waitFor(5);
		driver.navigate().refresh();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//h3[text()='MY Task']")).click();
		genericMethod.waitFor(5);
		System.out.println(CaseIDValue);
		driver.findElement(ApproversearchBox).click();
		genericMethod.waitFor(4);
		driver.findElement(ApproversearchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//a[text()='"+CaseIDValue+"']")).click();
		genericMethod.waitFor(8);
		String InspectorReviewComment = driver.findElement(By.xpath("(//div[@id='rte-default'])[1]")).getText();
		Assert.assertEquals(InspectorReviewComment,"test");
		System.out.println(InspectorReviewComment);
		genericMethod.waitFor(4);
		String ReviewerReviewComment = driver.findElement(By.xpath("(//div[@id='rte-default'])[2]")).getText();
		Assert.assertEquals(ReviewerReviewComment,"test");
		System.out.println(ReviewerReviewComment);
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(5);
		WebElement FuelHandlingStorageSelected = driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l2$pResponse'])[3]"));
		if(FuelHandlingStorageSelected.isSelected()){
			System.out.println("Fuel Handling Storage Selected");
		}
		else{
			System.out.println("Fuel Handling Storage not Selected");
		}
		genericMethod.waitFor(5);
		WebElement PreStartUpSafetyReview = driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l3$pResponse'])[1]"));
		if(PreStartUpSafetyReview.isSelected()){
			System.out.println("Pre StartUp Safety Review disabled");
		}
		else{
			System.out.println("Pre StartUp Safety Review not disabled");
		}
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//textarea[@aria-describedby='$PpyWorkPage$pChecklistCategory$l1$pApproverCommentError']")).sendKeys("Approver Automation Testing");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//label[text()='No Action']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		genericMethod.waitFor(5);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframe);
		System.out.println("Switched to iframe");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("test");
		genericMethod.waitFor(5);
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Attach Signature']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[2]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[2]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//span[text()='Accept'])[2]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='  Submit ']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		genericMethod.waitFor(8);
		String StatusAfterApproverSubmitsCase = driver.findElement(By.xpath("(//span[text()='Completed'])[1]")).getText();
		Assert.assertEquals(StatusAfterApproverSubmitsCase,"COMPLETED");
		System.out.println(StatusAfterApproverSubmitsCase);
		genericMethod.waitFor(5);

	}


	public void InspectorSearchesAndCompleteCaseAndClickOnCancel() throws Exception {
		genericMethod.waitFor(5);
		WebElement caseid = driver.findElement(By.xpath("(//span[text()='Case ID'])[1]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",caseid);
		genericMethod.waitFor(4);
		System.out.println(CaseIDValue);
		driver.findElement(searchBox).click();
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		String verifyCaseStatusBeforeCompletion = driver.findElement(By.xpath("(//span[text()='Pending'])[1]")).getText();
		Assert.assertEquals(verifyCaseStatusBeforeCompletion,"Pending");
		System.out.println(verifyCaseStatusBeforeCompletion);
		genericMethod.waitFor(2);
		String InspectionSource = driver.findElement(By.xpath("//span[text()='Planned']")).getText();
		Assert.assertEquals(InspectionSource,"Planned");
		System.out.println(InspectionSource);
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//button[text()='OK'])[1]")).click();
		genericMethod.waitFor(15);
		driver.findElement(searchBox).click();
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(4);
		String StartInspectionConfirmation = driver.findElement(By.xpath("//div[text()='Do you want to start the Inspection?']")).getText();
		Assert.assertEquals(StartInspectionConfirmation,"Do you want to start the Inspection?");
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonDisabled = driver.findElement(By.xpath("(//button[text()='Start Inspection'])"));
		if(StartInspectionButtonDisabled.isEnabled()){
			System.out.println("Pre-Inspection Checklist Button Is Displayed");
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//button[text()='Pre Inspection Checklist'])[2]")).click();
		String PreInspectionChecklist = driver.findElement(By.xpath("(//span[text()='Confirm adherence to all relevant nuclear regulatory requirements.'])")).getText();
		Assert.assertEquals(PreInspectionChecklist,"Confirm adherence to all relevant nuclear regulatory requirements.");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonEnabled = driver.findElement(By.xpath("//button[text()='Start Inspection']"));
		if(StartInspectionButtonEnabled.isEnabled()){

			StartInspectionButtonEnabled.click();
			genericMethod.waitFor(5);
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		driver.findElement(By.xpath("(//label[text()='Fail'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//i[@class='icons pi pi-notes'])[1]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//textarea[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l2$pNotes']")).sendKeys("Automation Testing");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='  Save ']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//label[text()='Pass'])[2]")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//button[text()='Cancel'])[2]")).click();
		genericMethod.waitFor(5);
		String StatusAfterInspectorCancels = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		Assert.assertEquals(StatusAfterInspectorCancels,"IN PROGRESS");
		genericMethod.waitFor(5);

	}

	public void InspectorSearchesCaseAndNotCompleteInspectionForm() throws Exception {
		genericMethod.waitFor(5);
		WebElement caseid = driver.findElement(By.xpath("(//span[text()='Case ID'])[1]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",caseid);
		genericMethod.waitFor(4);
		System.out.println(CaseIDValue);
		driver.findElement(searchBox).click();
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		String verifyCaseStatusBeforeCompletion = driver.findElement(By.xpath("(//span[text()='Pending'])[1]")).getText();
		Assert.assertEquals(verifyCaseStatusBeforeCompletion,"Pending");
		System.out.println(verifyCaseStatusBeforeCompletion);
		genericMethod.waitFor(2);
		String InspectionSource = driver.findElement(By.xpath("//span[text()='Planned']")).getText();
		Assert.assertEquals(InspectionSource,"Planned");
		System.out.println(InspectionSource);
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//button[text()='OK'])[1]")).click();
		genericMethod.waitFor(15);
		driver.findElement(searchBox).click();
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(4);
		String StartInspectionConfirmation = driver.findElement(By.xpath("//div[text()='Do you want to start the Inspection?']")).getText();
		Assert.assertEquals(StartInspectionConfirmation,"Do you want to start the Inspection?");
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonDisabled = driver.findElement(By.xpath("(//button[text()='Start Inspection'])"));
		if(StartInspectionButtonDisabled.isEnabled()){
			System.out.println("Pre-Inspection Checklist Button Is Displayed");
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//button[text()='Pre Inspection Checklist'])[2]")).click();
		String PreInspectionChecklist = driver.findElement(By.xpath("(//span[text()='Confirm adherence to all relevant nuclear regulatory requirements.'])")).getText();
		Assert.assertEquals(PreInspectionChecklist,"Confirm adherence to all relevant nuclear regulatory requirements.");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonEnabled = driver.findElement(By.xpath("//button[text()='Start Inspection']"));
		if(StartInspectionButtonEnabled.isEnabled()){

			StartInspectionButtonEnabled.click();
			genericMethod.waitFor(5);
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		driver.findElement(By.xpath("(//button[text()='Cancel'])[2]")).click();
		genericMethod.waitFor(5);
		String StatusAfterInspectorCancels = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		Assert.assertEquals(StatusAfterInspectorCancels,"IN PROGRESS");
		genericMethod.waitFor(5);

	}


	public void InspectorSearchesAndCompleteCase() throws Exception {
		genericMethod.waitFor(5);
		WebElement caseid = driver.findElement(By.xpath("(//span[text()='Case ID'])[1]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",caseid);
		genericMethod.waitFor(4);
		System.out.println(CaseIDValue);
		driver.findElement(searchBox).click();
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		String verifyCaseStatusBeforeCompletion = driver.findElement(By.xpath("(//span[text()='Pending'])[1]")).getText();
		Assert.assertEquals(verifyCaseStatusBeforeCompletion,"Pending");
		System.out.println(verifyCaseStatusBeforeCompletion);
		genericMethod.waitFor(2);
		String InspectionSource = driver.findElement(By.xpath("//span[text()='Planned']")).getText();
		Assert.assertEquals(InspectionSource,"Planned");
		System.out.println(InspectionSource);
		genericMethod.waitFor(4);
//		WebDriverWait wait= new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(UserID));
//		driver.findElement(UserID).sendKeys(userID);
//		driver.findElement(By.xpath("(//div[@class='field-item dataValueRead']//a[@class='Strong gridInnerFocussable gridFocussable'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//button[text()='OK'])[1]")).click();
		genericMethod.waitFor(15);
		driver.findElement(searchBox).click();
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(4);
		String StartInspectionConfirmation = driver.findElement(By.xpath("//div[text()='Do you want to start the Inspection?']")).getText();
		Assert.assertEquals(StartInspectionConfirmation,"Do you want to start the Inspection?");
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonDisabled = driver.findElement(By.xpath("(//button[text()='Start Inspection'])"));
		if(StartInspectionButtonDisabled.isEnabled()){
			System.out.println("Pre-Inspection Checklist Button Is Displayed");
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//button[text()='Pre Inspection Checklist'])[2]")).click();
		String PreInspectionChecklist = driver.findElement(By.xpath("(//span[text()='Confirm adherence to all relevant nuclear regulatory requirements.'])")).getText();
		Assert.assertEquals(PreInspectionChecklist,"Confirm adherence to all relevant nuclear regulatory requirements.");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonEnabled = driver.findElement(By.xpath("//button[text()='Start Inspection']"));
		if(StartInspectionButtonEnabled.isEnabled()){

			StartInspectionButtonEnabled.click();
			genericMethod.waitFor(5);
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		driver.findElement(By.xpath("(//label[text()='Fail'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//i[@class='icons pi pi-notes'])[1]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//textarea[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l2$pNotes']")).sendKeys("Automation Testing");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='  Save ']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//label[text()='Pass'])[2]")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		genericMethod.waitFor(4);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframe);
		System.out.println("Switched to iframe");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("test");
		genericMethod.waitFor(5);
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Attach Signature']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//span[text()='Accept'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[text()='  Submit ']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		genericMethod.waitFor(8);
		String CaseRoutedToReviewer = driver.findElement(By.xpath("//div[text()='Case has been routed to Reviewer']")).getText();
		Assert.assertEquals(CaseRoutedToReviewer,"Case has been routed to Reviewer");
		genericMethod.waitFor(2);
		String StatusAfterInspectorSubmitsCase = driver.findElement(By.xpath("//span[text()='Under Review']")).getText();
		Assert.assertEquals(StatusAfterInspectorSubmitsCase,"UNDER REVIEW");
		genericMethod.waitFor(4);
	}

	public void InspectorFillsInformationFormAndSaveIt() throws Exception {
		genericMethod.waitFor(5);
		WebElement caseid = driver.findElement(By.xpath("(//span[text()='Case ID'])[1]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",caseid);
		genericMethod.waitFor(4);
		System.out.println(CaseIDValue);
		driver.findElement(searchBox).click();
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		String verifyCaseStatusBeforeCompletion = driver.findElement(By.xpath("(//span[text()='Pending'])[1]")).getText();
		Assert.assertEquals(verifyCaseStatusBeforeCompletion,"Pending");
		System.out.println(verifyCaseStatusBeforeCompletion);
		genericMethod.waitFor(2);
		String InspectionSource = driver.findElement(By.xpath("//span[text()='Planned']")).getText();
		Assert.assertEquals(InspectionSource,"Planned");
		System.out.println(InspectionSource);
		genericMethod.waitFor(4);
//		WebDriverWait wait= new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(UserID));
//		driver.findElement(UserID).sendKeys(userID);
//		driver.findElement(By.xpath("(//div[@class='field-item dataValueRead']//a[@class='Strong gridInnerFocussable gridFocussable'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//button[text()='OK'])[1]")).click();
		genericMethod.waitFor(15);
		driver.findElement(searchBox).click();
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(CaseIDValue);
		genericMethod.waitFor(5);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("(//a[text()='"+CaseIDValue+"'])[1]")).click();
		genericMethod.waitFor(4);
		String StartInspectionConfirmation = driver.findElement(By.xpath("//div[text()='Do you want to start the Inspection?']")).getText();
		Assert.assertEquals(StartInspectionConfirmation,"Do you want to start the Inspection?");
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonDisabled = driver.findElement(By.xpath("(//button[text()='Start Inspection'])"));
		if(StartInspectionButtonDisabled.isEnabled()){
			System.out.println("Pre-Inspection Checklist Button Is Displayed");
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//button[text()='Pre Inspection Checklist'])[2]")).click();
		String PreInspectionChecklist = driver.findElement(By.xpath("(//span[text()='Confirm adherence to all relevant nuclear regulatory requirements.'])")).getText();
		Assert.assertEquals(PreInspectionChecklist,"Confirm adherence to all relevant nuclear regulatory requirements.");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		genericMethod.waitFor(4);
		WebElement StartInspectionButtonEnabled = driver.findElement(By.xpath("//button[text()='Start Inspection']"));
		if(StartInspectionButtonEnabled.isEnabled()){

			StartInspectionButtonEnabled.click();
			genericMethod.waitFor(5);
		}
		else{
			System.out.println("Pre-Inspection Checklist Button Is Not Displayed");
		}
		driver.findElement(By.xpath("(//label[text()='Fail'])[1]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("(//i[@class='icons pi pi-notes'])[1]")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//textarea[@name='$PpyWorkPage$pChecklistCategory$l1$pChecklistItem$l2$pNotes']")).sendKeys("Automation Testing");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//button[text()='  Save ']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//label[text()='Pass'])[2]")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		genericMethod.waitFor(4);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframe);
		System.out.println("Switched to iframe");
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("test");
		genericMethod.waitFor(5);
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame");
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Attach Signature']")).click();
		genericMethod.waitFor(4);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//canvas[@class='sign-pad-canvas'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//span[text()='Accept'])[1]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[text()='  Submit ']")).click();
		genericMethod.waitFor(5);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		genericMethod.waitFor(8);
		String StatusAfterInspectorSavesCase = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		Assert.assertEquals(StatusAfterInspectorSavesCase,"IN PROGRESS");
		genericMethod.waitFor(5);
	}



	public void reviewerRejects() throws Exception {
		genericMethod.waitFor(2);
		System.out.println(caseID);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys(caseID);
		genericMethod.waitFor(2);
		driver.findElement(assignToReviewerCheckbox).click();
		genericMethod.waitFor(1);
		driver.findElement(assignButton).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxCaseID).click();
		driver.findElement(searchBoxCaseID).sendKeys(caseID);
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//span[contains(text(),'AIS')]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("//textarea[contains(@id,'TextArea_ReviewerComments')]")).sendKeys("Rejected");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//input[@id='ResultFail-input']")).click();
		driver.findElement(By.xpath("//input[@id='ReInspection-input']")).click();
		driver.findElement(By.xpath("//i[contains(@class,'calendar')]")).click();
		driver.findElement(By.xpath("//span[@class='flatpickr-day today']")).click();
		driver.findElement(By.xpath("//textarea[contains(@id,'TextArea_ReviewerInspectionSummary')]")).sendKeys("Rejected By Reviewer");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		System.out.println("Case has been rejected by the reviewer");
	}

	public void assignToApprover() throws Exception {
		genericMethod.waitFor(2);
		System.out.println(caseID);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys("AIS202403000030");
		genericMethod.waitFor(2);
		driver.findElement(assignToReviewerCheckbox).click();
		genericMethod.waitFor(1);
		driver.findElement(assignButton).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxCaseID).click();
		driver.findElement(searchBoxCaseID).sendKeys(caseID);
		genericMethod.waitFor(2);
		getStatusApproverPool();
		System.out.println(StatusApproverPool);
		driver.findElement(By.xpath("//span[contains(text(),'AIS')]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("//textarea[contains(@id,'TextArea_ApproverComment')]")).sendKeys("Approved");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//input[@id='RadioButton1-input']")).click();
		driver.findElement(By.xpath("//textarea[@id='TextArea_InspectionReport']")).sendKeys("Approved By Approver");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		System.out.println("Case has been approved successfully");
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//input[contains(@id,'Signature')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//Button[contains(text(),'Submit')])[2]")).click();
		genericMethod.waitFor(7);
		driver.findElement(By.xpath("//span[text()='Completed']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys(caseID);
		genericMethod.waitFor(2);
		String finalStatus=driver.findElement(StatusFinal).getText();
		softAssert.assertEquals(finalStatus,"Resolved");
	}

	public void assignToApproverAndResolveIt() throws Exception {
		genericMethod.waitFor(2);
		System.out.println(caseID);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys("AIS202403000030");
		genericMethod.waitFor(2);
		driver.findElement(assignToReviewerCheckbox).click();
		genericMethod.waitFor(1);
		driver.findElement(assignButton).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxCaseID).click();
		driver.findElement(searchBoxCaseID).sendKeys(caseID);
		genericMethod.waitFor(2);
		getStatusApproverPool();
		System.out.println(StatusApproverPool);
		driver.findElement(By.xpath("//span[contains(text(),'AIS')]")).click();
		genericMethod.waitFor(3);
		driver.findElement(By.xpath("//textarea[contains(@id,'TextArea_ApproverComment')]")).sendKeys("Approved");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//input[@id='RadioButton1-input']")).click();
		driver.findElement(By.xpath("//textarea[@id='TextArea_InspectionReport']")).sendKeys("Approved By Approver");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		System.out.println("Case has been approved successfully");
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("//input[contains(@id,'Signature')]")).click();
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("(//Button[contains(text(),'Submit')])[2]")).click();
		genericMethod.waitFor(7);
		driver.findElement(By.xpath("//span[text()='Completed']")).click();
		genericMethod.waitFor(2);
		driver.findElement(searchBoxPool).click();
		driver.findElement(searchBoxPool).sendKeys(caseID);
		genericMethod.waitFor(2);
		String finalStatus=driver.findElement(StatusFinal).getText();
		softAssert.assertEquals(finalStatus,"Resolved");
	}


	public void logOutInspectorManager() throws InterruptedException {
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[@title='InspectorManager@AIF']")).click();
		driver.findElement(By.xpath("//span[text()='Log off']")).click();
		genericMethod.waitFor(2);

	}

	public void logOutInspector() throws InterruptedException {
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[@title='Inspector@AIF']")).click();
		driver.findElement(By.xpath("//span[text()='Log off']")).click();
		genericMethod.waitFor(2);

	}

	public void logOutReviewer() throws InterruptedException {
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[@title='Reviewer']")).click();
		driver.findElement(By.xpath("//span[text()='Log off']")).click();
		genericMethod.waitFor(2);

	}

	public void logOutApprover() throws InterruptedException {
		genericMethod.waitFor(2);
		driver.findElement(By.xpath("//button[@title='approverJ1']")).click();
		driver.findElement(By.xpath("//span[text()='Log off']")).click();
		genericMethod.waitFor(2);

	}


}

	
