package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;



public class AddPatientFormPage {

	private WebDriver driver;

	private By Title=By.xpath("//select[@id='b2-Title']");
	private By ForenameText=By.xpath("//input[@id='b2-Forename']");
	private By SurnameText=By.xpath("//input[@id='b2-Surname']");
	private By Calander= By.xpath("//span[@class='input-date']");
	private By CalanderYear=By.xpath("//input[@id='b2-b11-Input_year']");
	private By CalanderMonth=By.xpath("//input[@id='b2-b11-Input_Month']");
	private By CalanderDay=By.xpath("//input[@id='b2-b11-Input_Day']");
	private By EmailText=By.xpath("//input[@id='b2-Email']");
	private By PhoneNumberText= By.xpath("//input[@id='b2-Input_phno']");
	private By PostCodeText=By.xpath("//input[@id='b2-Input_postcode']");
	private By PostCodeTextManual=By.xpath("//input[@id='b2-Postcodemannual']");
	private By FindButton=By.xpath("//button[contains(text(),'Find address')]");
	private By selectAddress=By.xpath("//div[@id='b2-l2-99_0-AddressList']");
	private By EnterAddressManuallyLink=By.xpath("//a[contains(text(),'Enter address manually')]");
	private By AddressLine=By.xpath("//input[@id='b2-Houseno']");
	private By EnterCity=By.xpath("//input[@id='b2-City']");
	private By ChooseClinicianDropdown=By.xpath("//span[contains(text(),'Choose clinician')]");
	private By selectClinician=By.xpath("//div[@class='dropdown-popup-row'][4]");
	private By selectClinicianName=By.xpath("//span[contains(text(),'Fuzzy')]");
	private By ChoosePlanDropDown=By.xpath("//span[contains(text(),'Choose plan')]");
	private By selectPlan=By.xpath("//div[@class='dropdown-popup-row'][1]");
	private By selectPlanAnually=By.xpath("//span[contains(text(),'PER|Per Year Testy Plan (£300.00) Per year|ADULT')]");
	private By AddPatientButton=By.xpath("//button[contains(text(),'Add patient')]");
	private By AddPatient=By.xpath("//button[contains(text(),'Add patient')]");
	private By NextButton=By.xpath("//button[contains(text(),'Next')]");
	private By SameUserIsPaying=By.xpath("//input[@id='b2-b21-l2-84_0-RadioButton1-input']");
	private By AuthorisePaymentYes=By.xpath("//button[@class='btn  text-secondary ThemeGrid_Width2']");
	private By CancelApplicationButton=By.xpath("//button[contains(text(),'Cancel application')]");
	private By CancelApplication=By.xpath("(//button[contains(text(),'Cancel application')])[2]");
	private By SaveForLaterButton=By.xpath("//button[contains(text(),'Save for later')]");
	private By InitialFeeText=By.xpath("(//div[@class='text-align-right ThemeGrid_Width4 ThemeGrid_MarginGutter'])[1]/span");
	private By MonthlyPaymentText=By.xpath("(//div[@class='text-align-right ThemeGrid_Width4 ThemeGrid_MarginGutter'])[2]/span");
	private By PlanStartDateDropDown=By.xpath("//select[@id='b2-Commencementdate']");
	private By PlanStartDateText=By.xpath("//div[@class='text-align-right ThemeGrid_Width7 ThemeGrid_MarginGutter']/span");
	private By SummaryDropDownValues=By.xpath("//select[@id='b2-b22-Dropdown1']");
	private By SummaryDropDown=By.xpath("//div[@id='b2-b22-Dropdown1-container']");
	private By FirstPaymentTotal=By.xpath("(//div[@class='text-align-right ThemeGrid_Width4 ThemeGrid_MarginGutter'])[3]");
	private By AddAdditionalPatient=By.xpath("//button[contains(text(),'Add additional patient')]");
	public SoftAssert softassert= new SoftAssert();
	
	
	public AddPatientFormPage(WebDriver driver) {
		this.driver = driver;
		
			
	}
	
		public void fillAddPatientForm() throws InterruptedException, AWTException {
		
		
		driver.findElement(Title).click();
		Select select=new Select(driver.findElement(Title));
		select.selectByVisibleText("Mrs");
		//driver.findElement(ForenameText).sendKeys(ForeName);
		//driver.findElement(SurnameText).sendKeys(SurName);
		//driver.findElement(Calander).click();
		//driver.findElement(CalanderYear).sendKeys(year);
		//Select select1=new Select(driver.findElement(CalanderMonth));
		//select1.selectByVisibleText(Month);
		//driver.findElement(CalanderDay).click();
		//driver.findElement(EmailText).sendKeys(Email);
		//driver.findElement(PhoneNumberText).sendKeys(Phone);
		//driver.findElement(PostCodeText).click();
		//driver.findElement(FindButton).click();
		//driver.findElement(EnterAddressManuallyLink).click();
		//driver.findElement(AddressLine).sendKeys(AddressLine1);
		//driver.findElement(EnterCity).sendKeys(City);
		//driver.findElement(PostCodeTextManual).sendKeys(PinCode);
		//wait.until(ExpectedConditions.elementToBeClickable(selectAddress));
		//driver.findElement(selectAddress).click();
		//driver.findElement(ChooseClinicianDropdown).click();
		//driver.findElement(selectClinicianName).click();
		
		
					
	}
		
		public void fillForeName(String ForeName) {
			driver.findElement(ForenameText).sendKeys(ForeName);
		}
		
		public void FillSurName(String SurName) {
			driver.findElement(SurnameText).sendKeys(SurName);
		}
		
		public void  Calander() {
			driver.findElement(Calander).click();
		}
		
		public void SelectCalendarYear(String year) {
			driver.findElement(CalanderYear).sendKeys(year);
		}
		
		public void selectCalendarMonth(String Month) {
			driver.findElement(CalanderMonth).sendKeys(Month);
		}
		
		public void selectCalndarDay(String Day) {
			driver.findElement(CalanderDay).sendKeys(Day);
		}
		
		public void EnterEmail(String Email) {
			driver.findElement(EmailText).sendKeys(Email);
		}
		
		public void EnterPhoneNumber(String Phone) {
			driver.findElement(PhoneNumberText).sendKeys(Phone);
		}
		
		public void EnterAddressManually() {
			driver.findElement(EnterAddressManuallyLink).click();
		}
		
		public void EnterAddressLine(String AddressLine1) {
			driver.findElement(AddressLine).sendKeys(AddressLine1);
		}
		
		public void EnterCity(String City) {
			driver.findElement(EnterCity).sendKeys(City);
		}
		
		public void EnterPincode(String PinCode) {
			driver.findElement(PostCodeTextManual).sendKeys(PinCode);
		}
		
		public void ChooseclinicalDropDown() throws InterruptedException {
			Thread.sleep(10);
			driver.findElement(ChooseClinicianDropdown).click();
		}
		
		public void ChooseClinicianName() throws InterruptedException {
			Thread.sleep(10);
			driver.findElement(selectClinicianName).click();
		}
		
		public void selectPlan() {
			driver.findElement(ChoosePlanDropDown).click();
			driver.findElement(selectPlan).click();
			
		}
		
		public void AddAdditionalPatient() {
			driver.findElement(AddAdditionalPatient).click();
		}
		
		
		public void PaymentSummary() throws InterruptedException {
			Thread.sleep(5000);
			String InitialFee=driver.findElement(InitialFeeText).getText().replaceAll("[£-]*", ""); 
			System.out.println(InitialFee);
			//String InitialFeeWithOutPound=InitialFee.replaceAll("[£]*", " ").trim(); 
			double IntegerInitalFee=Double.valueOf(InitialFee);
			System.out.println(IntegerInitalFee);
			String MonthlyPayment=driver.findElement(MonthlyPaymentText).getText().replaceAll("[£-]*", "");
			//String MonthlyPaymentwithoutPound=MonthlyPayment.replaceAll("[^a-zA-Z0-9]", " ").trim(); 
			double IntegerMonthlyPayment= Double.valueOf(MonthlyPayment);
			System.out.println(IntegerMonthlyPayment);
			double sum= IntegerInitalFee+IntegerMonthlyPayment;
			System.out.println(sum);
			String FirstIntTotalValue=driver.findElement(FirstPaymentTotal).getText().replaceAll("[£-]*", "");
			//String FirstIntTotalValueWithOutPound=FirstIntTotalValue.replaceAll("[^a-zA-Z0-9]", " ").trim(); 
			double IntegerFirstIntTotalValue= Double.valueOf(FirstIntTotalValue);
			System.out.println(IntegerFirstIntTotalValue);
			softassert.assertEquals(sum, IntegerFirstIntTotalValue);
			
			System.out.println(InitialFee +"MonthlyPayment="+ MonthlyPayment);
		}
		
		public void CommencingDate(String PlanStartDate) throws InterruptedException {
			Thread.sleep(5000);
			String InitialFee=driver.findElement(InitialFeeText).getText().replaceAll("[£-]*", ""); 
			String MonthlyPayment=driver.findElement(MonthlyPaymentText).getText().replaceAll("[£-]*", "");
			System.out.println(InitialFee +"MonthlyPayment"+ MonthlyPayment);
			Select select2=new Select(driver.findElement(PlanStartDateDropDown));
			select2.selectByVisibleText(PlanStartDate);
			String Datetext=driver.findElement(PlanStartDateText).getText();
			softassert.assertEquals(Datetext, PlanStartDate);
		}
		
		public void selectPlanAnnualy() {
			driver.findElement(ChoosePlanDropDown).click();
			driver.findElement(selectPlanAnually).click();
		}
		
		public void clickOnAddPatient() throws InterruptedException {
			WebDriverWait wait= new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(AddPatient));
			Thread.sleep(10);
			driver.findElement(AddPatient).click();
		}
		
		public void clickonNextButton() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			WebDriverWait wait= new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(NextButton));
			driver.findElement(NextButton).click();
		}
		
		
	
		public void cancelApplication() throws AWTException, InterruptedException {
			WebDriverWait wait= new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(CancelApplicationButton));
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("window.scrollBy(0,-350)");
			Thread.sleep(2000);
			driver.findElement(CancelApplicationButton).click();
			Thread.sleep(2000);
			String Popup=driver.getWindowHandle();
			driver.switchTo().window(Popup);
			Thread.sleep(5000);
			driver.findElement(CancelApplication).click();
		}
	
		public void SaveForLaterApplication() throws AWTException {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(SaveForLaterButton));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,-350)");
		
		driver.findElement(SaveForLaterButton).click();
		}
	
		public void SummaryDropDownisDisabled() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		Boolean SummaryDropDownValue= driver.findElement(SummaryDropDown).isEnabled();
		softassert.assertFalse(SummaryDropDownValue);
		
		}
		
		public void SummaryIsChangedtoAnnually() {
			Select  select=new Select(driver.findElement(SummaryDropDownValues));
			select.selectByVisibleText("Annually");
		}
}
