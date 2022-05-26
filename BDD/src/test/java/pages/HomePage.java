package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//a[text()='Telecom Project']")
	private WebElement TelecomProject;

	@FindBy(xpath = "//a[text()='Telecom Project']")
	private WebElement CloseButton;

//	@FindBy(xpath = "//iframe[@name='__uspapiLocator']")
//	private WebElement Iframe;

	@FindBy(linkText = "Add Customer")
	private WebElement AddCustomerButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickTelecomProject_and_Select_AddCustomer() throws InterruptedException {

		Actions act1 = new Actions(driver);
		act1.moveToElement(TelecomProject).click().build().perform();
		System.out.println("Clicked on TelecomProject");

		Thread.sleep(2000);

		Actions act2 = new Actions(driver);
		act2.moveToElement(CloseButton).click().build().perform();
		System.out.println("Clicked on CloseButton");
		Thread.sleep(5000);

//		 WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__uspapiLocator']"));
//		 driver.switchTo().frame(iframe);
//		 
////		 driver.switchTo().frame(Iframe);
//		 System.out.println("Swtiched to Iframe");

		Thread.sleep(3000);

		// AddCustomerButton.click();

		Actions act3 = new Actions(driver);
		act3.moveToElement(AddCustomerButton).click().build().perform();
		System.out.println("Clicked on AddCustomerButton");

	}

}
