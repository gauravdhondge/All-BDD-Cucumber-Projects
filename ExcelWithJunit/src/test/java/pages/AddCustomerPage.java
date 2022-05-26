package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='done']")
	private WebElement BackGroundCheck;

	@FindBy(xpath = "//input[@id='fname']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='lname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement Address;

	@FindBy(xpath = "//input[@id='telephoneno']")
	private WebElement MobileNumber;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SubmitButton;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void select_BackGroundCheck_done_Enter_Billing_Address_and_Click_SubmitButton(String firstname,
			String lastname, String email,String address,String mobilenumber) throws Throwable {

		Actions act = new Actions(driver);
		act.moveToElement(BackGroundCheck).click().build().perform();
		System.out.println("BackGround check selected as done");

		Thread.sleep(3000);

	//	FirstName.wait();
		FirstName.sendKeys(firstname);
		System.out.println("Entered FirstName");

		Thread.sleep(3000);

		LastName.sendKeys(lastname);
		System.out.println("Entered lastName");

		Thread.sleep(3000);

		Email.sendKeys(email);
		System.out.println("Entered Email");

		Thread.sleep(3000);

		Address.click();
		Address.sendKeys(address);
		System.out.println("Entered Address");

		Thread.sleep(3000);

		MobileNumber.sendKeys(mobilenumber);
		System.out.println("Entered MobileNumber");

		Thread.sleep(3000);

		Actions act2 = new Actions(driver);
		act2.moveToElement(SubmitButton).click().build().perform();
		System.out.println("Clicked on SubmitButton");
		
		Thread.sleep(3000);
		
		driver.quit();
		System.out.println("Browser Closed");
	}

}
