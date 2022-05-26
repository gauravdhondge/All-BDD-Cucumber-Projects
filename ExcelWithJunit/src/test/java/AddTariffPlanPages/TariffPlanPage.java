package AddTariffPlanPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TariffPlanPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='rental1']")
	private WebElement MonthlyRental;

	@FindBy(xpath = "//input[@id='local_minutes']")
	private WebElement FreeLocalMinutes;

	@FindBy(xpath = "//input[@id='inter_minutes']")
	private WebElement FreeInternationalMinutes;

	@FindBy(xpath = "//input[@id='sms_pack']")
	private WebElement FreeSMSPack;

	@FindBy(xpath = "//input[@id='minutes_charges']")
	private WebElement LocalPerMinuteCharges;

	@FindBy(xpath = "//input[@id='inter_charges']")
	private WebElement InternationalPerMinuteCharges;

	@FindBy(xpath = "//input[@id='sms_charges']")
	private WebElement SMSPerCharges;
	
	@FindBy(xpath = "//input[@value='submit']")
	private WebElement SubmitButton;
	

	public TariffPlanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Enter_TariffPlanDetails_and_Click_SubmitButton(String monthlyrental,
	String freelocalmin, String freeintmin,String freesmspack,String localpermincharges,
	String intpermincharges,String smspercharges) throws Throwable {

		

		

	//	FirstName.wait();
		MonthlyRental.sendKeys(monthlyrental);
		System.out.println("Entered Monthly Rental");

		Thread.sleep(3000);

		FreeLocalMinutes.sendKeys(freelocalmin);
		System.out.println("Entered Free Local Minutes");

		Thread.sleep(3000);

		FreeInternationalMinutes.sendKeys(freeintmin);
		System.out.println("Entered Free International Minutes");

		Thread.sleep(3000);

		
		FreeSMSPack.sendKeys(freesmspack);
		System.out.println("Entered Free SMS Pack");

		Thread.sleep(3000);

		LocalPerMinuteCharges.sendKeys(localpermincharges);
		System.out.println("Entered Local Per Minute Charges");

		Thread.sleep(3000);

		InternationalPerMinuteCharges.sendKeys(intpermincharges);
		System.out.println("Entered International Per Minute Charges");
		
		Thread.sleep(3000);
		
		SMSPerCharges.sendKeys(smspercharges);
		System.out.println("Entered SMS Per Charges");
		
		Thread.sleep(3000);
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(SubmitButton).click().build().perform();
		System.out.println("Clicked on SubmitButton");
		
		Thread.sleep(3000);
		
		driver.quit();
		System.out.println("Browser Closed");
	}

}
