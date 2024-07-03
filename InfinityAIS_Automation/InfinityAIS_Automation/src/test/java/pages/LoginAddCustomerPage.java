package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginAddCustomerPage {

	private WebDriver driver;

	private By UserID = By.xpath("//input[@id='txtUserID']");
	private By Password = By.xpath("//input[@id='txtPassword']");
	private By UserIDInspector = By.xpath("//input[@id='txtUserID']");
	private By PasswordInspector = By.xpath("//input[@id='txtPassword']");
	private By Loginbutton = By.xpath("//button[@id='sub']");

	private By LoginbuttonInspector= By.xpath("//button[@id='sub']");
	private By ForgetPassword = By.xpath("//span[contains(text(),'Forgot ')]");
	private By RememberMeCheckBox=By.xpath("//input[@id='Checkbox1']");
	private By InvalidErrorMessage= By.xpath("//div[@id='error']");
	private By LogOutButton=By.xpath("//span[contains(text(),'Log out')]");
	
	SoftAssert softAssert=new SoftAssert();

	public LoginAddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void EnterUserID_and_Password(String userID, String password) throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(UserID));
		driver.findElement(UserID).sendKeys(userID);
		System.out.println("Entered UserID");
		wait.until(ExpectedConditions.elementToBeClickable(Password));
		driver.findElement(Password).sendKeys(password);
		System.out.println("Entered Password");
	}
	public void InspectorEntersUserID_and_Password(String userID, String password) throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,10);
//		driver.findElement(By.xpath("//a[@id='wt5_wtMainContent_wtOpenInNewTabLink']")).click();
		Thread.sleep(5000);
//		driver.switchTo().frame(driver.findElement(By.id("contents_frame")));
		wait.until(ExpectedConditions.elementToBeClickable(UserIDInspector));
		driver.findElement(UserIDInspector).sendKeys(userID);
		System.out.println("Entered UserID");
		wait.until(ExpectedConditions.elementToBeClickable(PasswordInspector));
		driver.findElement(PasswordInspector).sendKeys(password);
		System.out.println("Entered Password");
	}

	public void ClickLoginButton() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Loginbutton));
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");

	}

	public void ClickLoginButtonInspector() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Loginbutton));
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");
	}

	public String getHomePageTitle() throws InterruptedException {
		String Title= driver.getTitle();
		softAssert.assertEquals(Title, "ManagerDashboard");
		System.out.println("Sucessfully LoggedIn to the Application");
		Thread.sleep(20000);
		return driver.getTitle();
	}

	public String GetCustomerPageTitle() throws InterruptedException {

		return driver.getTitle();

	}
	
	public void verifyErrorMessage() {
		String ErrorMessageonHomePage= driver.findElement(InvalidErrorMessage).getText();
		softAssert.assertEquals(ErrorMessageonHomePage, "The information you entered was not recognized.");
		
	}
	
	public void clickonForgetPasswordLink() {
		driver.findElement(ForgetPassword).click();
	}
	
	public void RememberMeCheckBox() {
		driver.findElement(RememberMeCheckBox).click();
	}
	
	public void LogoutButton() {
		driver.findElement(LogOutButton).click();
	}

	
}
