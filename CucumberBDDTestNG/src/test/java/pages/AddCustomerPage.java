package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddCustomerPage {

	
private WebDriver driver;
	
	private By TelecomProject = By.xpath("//a[text()='Telecom Project']");
	private By AddCustomerButton = By.xpath("(//a[text()='Add Customer'])[1]");
	
	
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
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
	
	
}


	
public void ClickOnAddCustomerButton() throws InterruptedException {
	

	Thread.sleep(2000);
	driver.findElement(AddCustomerButton).click();
	System.out.println("Clicked on Telecom Project");


 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
