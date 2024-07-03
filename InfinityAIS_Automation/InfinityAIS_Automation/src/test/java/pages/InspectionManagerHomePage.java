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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class InspectionManagerHomePage {
    

	private WebDriver driver;


	private By InspectionTab=By.xpath("//span[text()='Inspection']");
	private By ManagerDashboardTab=By.xpath("//span[text()='Inspection']");
	private By ReportsTab=By.xpath("//span[text()='Reports']");
	private By ManagePeriodicityTab=By.xpath("//span[text()='Manage Periodicity']");
	//private By ManagerDashboardTab=By.xpath("//a[@class='ais-sidemenu-link active']");
	//private By InquiryTab=By.xpath("(//a[@class='ais-sidemenu-link'])[1]");
	//private By ManagePeriodicityTab=By.xpath("(//a[@class='ais-sidemenu-link'])[2]");
	private By CreateNewButton=By.xpath("//div[contains(text(),'Create New')]");
	
	
	SoftAssert softAssert=new SoftAssert();
	
	public InspectionManagerHomePage(WebDriver driver) {
		this.driver = driver;
			
	}

	public Boolean verifyManagerDashboardTab() throws InterruptedException {
		Thread.sleep(20);
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ManagerDashboardTab)));
		return driver.findElement(ManagerDashboardTab).isDisplayed();
	}

	public Boolean verifyPegaInfinityManagerDashboardTab() throws InterruptedException {
		Thread.sleep(5);
		driver.findElement(By.xpath("(//span[@role='presentation'])[1]")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(InspectionTab)));
		return driver.findElement(InspectionTab).isDisplayed();
	}



	public Boolean verifyReportsTab() {
		return driver.findElement(ReportsTab).isDisplayed();
	}
	
	public Boolean verifyManagePeriodicityTab() {
		return driver.findElement(ManagePeriodicityTab).isDisplayed();
	}
	
	public void clickonCreateNewButton() throws InterruptedException, AWTException {
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(CreateNewButton)).perform();	
		driver.findElement(CreateNewButton).click();
		Thread.sleep(5000);
	}

	public void clickonInspectionButton() throws InterruptedException, AWTException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@role='presentation'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Inspection']")).click();
		Thread.sleep(2000);

	}



}
	