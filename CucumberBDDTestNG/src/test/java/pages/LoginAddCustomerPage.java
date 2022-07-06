package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginAddCustomerPage {

	private WebDriver driver;

	private By UserID = By.xpath("//input[@name='uid']");
	private By Password = By.xpath("//input[@name='password']");
	private By Loginbutton = By.xpath("//input[@type='submit']");
	private By TelecomProject = By.xpath("//a[text()='Telecom Project']");
	private By AddCustomerButton = By.xpath("(//a[text()='Add Customer'])[1]");
	private By Firstname = By.xpath("//input[@id='fname']");
	private By Lastname = By.xpath("//input[@id='lname']");
	private By Email = By.xpath("//input[@id='email']");
	private By Address = By.xpath("//textarea[@id='message']");
	private By MobileNumber = By.xpath("//input[@id='telephoneno']");

	public LoginAddCustomerPage(WebDriver driver) {
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

	public void ClickOnAddCustomerButton() throws InterruptedException {

		Thread.sleep(4000);
		driver.findElement(AddCustomerButton).click();
		System.out.println("Clicked on Add Customer Button");

	}

	public String GetCustomerPageTitle() throws InterruptedException {

		Thread.sleep(2000);
		return driver.getTitle();

	}

	
	public void EnterBillingAddress(String firstname,String lastname,String email,String address,String mobilenumber ) throws InterruptedException {
		
		driver.findElement(Firstname).sendKeys(firstname);
		System.out.println("Entered FirstName");
		Thread.sleep(2000);
		
		driver.findElement(Lastname).sendKeys(lastname);
		System.out.println("Entered LastName");
		Thread.sleep(2000);
		
		driver.findElement(Email).sendKeys(email);
		System.out.println("Entered Email");
		Thread.sleep(2000);
		
		driver.findElement(Address).sendKeys(address);
		System.out.println("Entered Address");
		Thread.sleep(2000);
		
		driver.findElement(MobileNumber).sendKeys(mobilenumber);
		System.out.println("Entered MobileNumber");
		Thread.sleep(2000);
		
		
		
	}

	
	
	
	
	
	
	
}
