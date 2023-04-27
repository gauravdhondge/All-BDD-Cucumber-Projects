package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginAddTariffPlan {
	
	
	private WebDriver driver;

	private By UserID = By.xpath("//input[@name='uid']");
	private By Password = By.xpath("//input[@name='password']");
	private By Loginbutton = By.xpath("//input[@type='submit']");
	private By TelecomProject = By.xpath("//a[text()='Telecom Project']");
	private By AddTariffPlanButton = By.xpath("//a[text()='Add Tariff Plan']");
	private By MonthlyRental = By.xpath("//input[@id='rental1']");
	private By FreeLocalMin = By.xpath("//input[@id='local_minutes']");
	private By FreeInternationalMin = By.xpath("//input[@id='inter_minutes']");
	private By FreeSMSPack = By.xpath("//input[@id='sms_pack']");
	private By LocalPerMinCharges = By.xpath("//input[@id='minutes_charges']");
	private By InternationalPerMinCharges = By.xpath("//input[@id='inter_charges']");
	private By SMSPerCharges = By.xpath("//input[@id='sms_charges']");
	
	

	public LoginAddTariffPlan(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void EnterUserID_and_Password(String userID, String password) throws InterruptedException {

		driver.findElement(UserID).sendKeys(userID);
		System.out.println("Entered UserID");
		Thread.sleep(2000);

		driver.findElement(Password).sendKeys(password);
		System.out.println("Entered Password");
		Thread.sleep(2000);

	}

	public void ClickLoginButton() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void ClickOnTelecomProject() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(TelecomProject).click();
		System.out.println("Clicked on Telecom Project");

	}

	public void ClickOnCloseButton() throws InterruptedException {

		Thread.sleep(2000);
		WebElement closebutton = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(closebutton).click().build().perform();
		System.out.println("user clicked on close button");

	}

	public void ClickOnAddTariffPlanButton() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(AddTariffPlanButton).click();
		System.out.println("Clicked on Add TariffPlan  Button");

	}

	public String GetCustomerPageTitle() throws InterruptedException {

		Thread.sleep(2000);
		return driver.getTitle();

	}

	
	public void EnterTariffPlanDetails(String monthlyrental,String freelocalmin,String freeintrmin,String freesmspack,String localpermincharges,String intrpermincharges,String smspercharges) throws InterruptedException {
	
		driver.findElement(MonthlyRental).sendKeys(monthlyrental);
		System.out.println("Entered Monthly Rental");
		Thread.sleep(2000);
		
		driver.findElement(FreeLocalMin).sendKeys(freelocalmin);
		System.out.println("Entered Free Local Minutes");
		Thread.sleep(2000);
		
		driver.findElement(FreeInternationalMin).sendKeys(freeintrmin);
		System.out.println("Entered Free International Minutes");
		Thread.sleep(2000);
		
		driver.findElement(FreeSMSPack).sendKeys(freesmspack);
		System.out.println("Entered Free SMS Pack");
		Thread.sleep(2000);
		
		driver.findElement(LocalPerMinCharges).sendKeys(localpermincharges);
		System.out.println("Entered Local Per Minute Charges");
		Thread.sleep(2000);
		
		driver.findElement(InternationalPerMinCharges).sendKeys(intrpermincharges);
		System.out.println("Entered International PerMinute Charges");
		Thread.sleep(2000);
		
		driver.findElement(SMSPerCharges).sendKeys(smspercharges);
		System.out.println("Entered SMS Per Charges");
		Thread.sleep(2000);	
		
	}

}
