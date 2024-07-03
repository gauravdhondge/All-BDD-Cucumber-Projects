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



public class ConfirmPatientDetailsAndAddAnotherPatientPage {

	private WebDriver driver;

	private By AddAdditionalPatientButton=By.xpath("//button[contains(text(),'Add additional patient')]");
	
	public SoftAssert softassert= new SoftAssert();
	
	
	public ConfirmPatientDetailsAndAddAnotherPatientPage(WebDriver driver) {
		this.driver = driver;
		
			
	}
	
	public void clickOnAddAdditionalPatient() {
		driver.findElement(AddAdditionalPatientButton).click();
	}
	
}
