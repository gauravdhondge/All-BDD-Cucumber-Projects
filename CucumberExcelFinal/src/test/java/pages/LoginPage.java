package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;
	

	
	private By Email = By.xpath("//input[@id='Email']");
	private By Password =  By.xpath("//input[@id='Password']");
	private By Loginbutton = By.xpath("//button[text()='Log in']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public void Email_and_Password(String emailID,String password) throws InterruptedException {
		
		driver.findElement(Email).clear();
		Thread.sleep(2000);
		driver.findElement(Email).sendKeys(emailID);
		System.out.println("Entered Email");
		Thread.sleep(2000);
		
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
		System.out.println("Entered Password");
	}
	
	
	public void ClickLoginButton() {
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");
	
	
	}
	
	
	
	public String getHomePageTitle() {
		return driver.getTitle();	
		}
	
	
	
	
	
	
	
	
	
	
	
}
