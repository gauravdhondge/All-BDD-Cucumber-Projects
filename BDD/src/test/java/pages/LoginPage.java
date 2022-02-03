package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;
	
	private By UserID = By.xpath("//input[@name='uid']");
	private By Password =  By.xpath("//input[@name='password']");
	private By Loginbutton = By.xpath("//input[@type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public void EnterUserID_and_Password(String userID,String password) throws InterruptedException {
		
		driver.findElement(UserID).sendKeys(userID);
		System.out.println("Entered UserID");
		Thread.sleep(2000);
		
		driver.findElement(Password).sendKeys(password);
		System.out.println("Entered Password");
		Thread.sleep(2000);
		
	}
	
	
	public void ClickLoginButton() throws InterruptedException {
		
		
		
		Thread.sleep(5000);
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");
		Thread.sleep(5000);
	
	}
	
	
	
	public String getHomePageTitle() {
		return driver.getTitle();	
		}
	
	
	
	
	
	
	
	
	
	
	
}
