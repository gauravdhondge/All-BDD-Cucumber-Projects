package pages;

import basePackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class InspectorPage {
	GenericMethod genericMethod=new GenericMethod();
	private WebDriver driver;

	private By syncNow=By.xpath("//span[contains(text(),'Sync Now')]");
	private By preInspectionChecklist= By.xpath("//span[contains(text(),'Pre Inspection Checklist')]");
	private By preInspquestion1=By.xpath("(//input[@class='radio-button ais-radio' and @value='9'])[1]");
	private By preInspquestion2=By.xpath("(//input[@class='radio-button ais-radio' and @value='9'])[2]");
	private By submit= By.xpath("//button[contains(text(),'Submit')]");
	private By submit2=By.xpath("(//Button[contains(text(),'Submit')])[2]");
	private By save=By.xpath("//button[contains(text(),'Save')]");
	private By savedSignCheckbox= By.xpath("//input[@id='b7-Signature']");
	private By submitSignature=By.xpath("//span[contains(text(),'Submit')]");
	private By greenChecklisticon=By.xpath("//i[@class='icon text-green-light fa fa-check-circle-o fa-1x']");
	private By startButton=By.xpath("//span[contains(text(),'Start')]");
	private By inspectionReport=By.xpath("//textarea[@id='TextArea_Comments2']");
	private By pullDownButton=By.xpath("//div[@class='osui-accordion-item__icon osui-accordion-item__icon--caret']");
	SoftAssert softAssert=new SoftAssert();

	public InspectorPage(WebDriver driver) {
		this.driver = driver;

	}


	public void incompleteInspection() throws InterruptedException{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(syncNow));
		driver.findElement(syncNow).click();
		String caseIDtoclick= "//span[text()='"+EntityInformationPage.caseID+"']";
		genericMethod.waitFor(6);
		driver.findElement(By.xpath(caseIDtoclick)).click();
		genericMethod.waitFor(5);
		driver.findElement(preInspectionChecklist).click();
		genericMethod.waitFor(2);
		driver.findElement(preInspquestion1).click();
		driver.findElement(preInspquestion2).click();
		driver.findElement(submit).click();
		genericMethod.waitFor(2);
		driver.findElement(greenChecklisticon).isDisplayed();
		System.out.println("Pre-Inspection Checklist is completed");
		driver.findElement(startButton).click();
		genericMethod.waitFor(2);
		driver.findElement(inspectionReport).sendKeys("Automation Testing");
		driver.findElement(submit).click();
		driver.findElement(By.xpath("//div[text()='Please fill required details']")).isDisplayed();
	}

	public void clickoncreatedcaseandcompleteit() throws InterruptedException{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(syncNow));
		driver.findElement(syncNow).click();
//		driver.findElement(By.xpath("//span[@class='ais-tab' and contains(text(),'In Progress')]")).click();
//		genericMethod.waitFor(2);
		String caseIDtoclick= "//span[text()='"+EntityInformationPage.caseID+"']";
		genericMethod.waitFor(6);
		driver.findElement(By.xpath(caseIDtoclick)).click();
		genericMethod.waitFor(5);
		driver.findElement(preInspectionChecklist).click();
		genericMethod.waitFor(2);
		driver.findElement(preInspquestion1).click();
		driver.findElement(preInspquestion2).click();
		driver.findElement(submit).click();
		genericMethod.waitFor(2);
		driver.findElement(greenChecklisticon).isDisplayed();
		System.out.println("Pre-Inspection Checklist is completed");
		driver.findElement(startButton).click();
		genericMethod.waitFor(2);
		driver.findElement(pullDownButton).click();
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[1]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[2]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[3]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[4]")).click();
		genericMethod.waitFor(1);
		driver.findElement(inspectionReport).sendKeys("Automation Testing");
		driver.findElement(submit).click();
		genericMethod.waitFor(1);
		driver.findElement(savedSignCheckbox).click();
		genericMethod.waitFor(2);
		driver.findElement(submit2).click();
	}

	public void inspectorFillsAndSavesInspection() throws InterruptedException{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(syncNow));
		driver.findElement(syncNow).click();
		String caseIDtoclick= "//span[text()='"+EntityInformationPage.caseID+"']";
		genericMethod.waitFor(6);
		driver.findElement(By.xpath(caseIDtoclick)).click();
		genericMethod.waitFor(5);
		driver.findElement(preInspectionChecklist).click();
		genericMethod.waitFor(2);
		driver.findElement(preInspquestion1).click();
		driver.findElement(preInspquestion2).click();
		driver.findElement(submit).click();
		genericMethod.waitFor(2);
		driver.findElement(greenChecklisticon).isDisplayed();
		System.out.println("Pre-Inspection Checklist is completed");
		driver.findElement(startButton).click();
		genericMethod.waitFor(2);
		driver.findElement(pullDownButton).click();
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[1]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[2]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[3]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[4]")).click();
		genericMethod.waitFor(1);
		driver.findElement(inspectionReport).sendKeys("Automation Testing");
		driver.findElement(save).click();
	}

	public void inspectorSavesInspection() throws InterruptedException{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(syncNow));
		driver.findElement(syncNow).click();
		String caseIDtoclick= "//span[text()='"+EntityInformationPage.caseID+"']";
		genericMethod.waitFor(6);
		driver.findElement(By.xpath(caseIDtoclick)).click();
		genericMethod.waitFor(5);
		driver.findElement(preInspectionChecklist).click();
		genericMethod.waitFor(2);
		driver.findElement(preInspquestion1).click();
		driver.findElement(preInspquestion2).click();
		driver.findElement(submit).click();
		genericMethod.waitFor(2);
		driver.findElement(greenChecklisticon).isDisplayed();
		System.out.println("Pre-Inspection Checklist is completed");
		driver.findElement(startButton).click();
		genericMethod.waitFor(2);
		driver.findElement(pullDownButton).click();
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[1]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[2]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[3]")).click();
		genericMethod.waitFor(1);
		driver.findElement(By.xpath("(//input[@class='radio-button' and @value='9'])[4]")).click();
		genericMethod.waitFor(1);
		driver.findElement(inspectionReport).sendKeys("Automation Testing");
		driver.findElement(save).click();
	}
}

	