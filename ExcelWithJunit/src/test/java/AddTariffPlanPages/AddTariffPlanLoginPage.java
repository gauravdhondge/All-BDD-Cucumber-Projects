package AddTariffPlanPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlanLoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='uid']")
	private WebElement UserID;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginButton;

	public AddTariffPlanLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void EnterUserID_and_Password(String userID, String password) throws InterruptedException {

		UserID.sendKeys(userID);
		System.out.println("Entered UserID");
		Thread.sleep(2000);

		Password.sendKeys(password);
		System.out.println("Entered Password");
		Thread.sleep(2000);

	}

	public void ClickLoginButton() throws InterruptedException {

		LoginButton.click();
		System.out.println("Clicked on Login button");
		Thread.sleep(2000);

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
