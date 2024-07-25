package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumCodePractice {
	
	
	
	public static String caseID;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);

//----------selecting all the links from page--------------------------------------------		
		
//		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
//		
//		int a = LinkList.size();
//		
//		System.out.println("no. of links present on page:"+a);
//		
//		for(WebElement e : LinkList ) {
//			
//		System.out.println(e.getText());	
//			
//		}
		
//-----------selecting default value from list box------------------------------------------		
		
		
		
//		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		CreateNewAcc.click();
//		
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		
//		Select s = new Select(month);
//		
//		String defaultvalue = s.getFirstSelectedOption().getText();
//		
//		System.out.println("the default option is:"+defaultvalue);
		
		
//------Print All options from list box------------------------------------------		
		
//		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		CreateNewAcc.click();	
//		
//		
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		
//		Select s = new Select(month);
//		
//		List<WebElement> allmonths = s.getOptions();
//		
//		for(WebElement e : allmonths) {
//			
//			System.out.println(e.getText());
//			
//		}
		
//------------selecting option from list box without using select class---------------------------------		
		
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		CreateNewAcc.click();	
		
	
//--------through text		
//		WebElement Specificmonth = driver.findElement(By.xpath("(//select[@id='month'])//option[text()='Feb']"));
//		Specificmonth.click();
		
//--------through index---------		
		
//		WebElement Specificmonth = driver.findElement(By.xpath("(//select[@id='month'])//option[@value='1']"));
//		Specificmonth.click();		


//		WebElement Status = driver.findElement(By.xpath("//span[text()='New']"));
//      String StatusBeforeCreatingCase = Status.getText();
//		softAssert.assertEquals(StatusBeforeCreatingCase, "New");


//--------------------	assertions--------------------------------------------	
		
 // 1. soft assert

//		WebElement Status = driver.findElement(By.xpath("//span[text()='New']"));
//      String StatusBeforeCreatingCase = Status.getText();
//		softAssert.assertEquals(StatusBeforeCreatingCase, "New");
		
		
//  2. hard assert
		
//		String StatusBeforeCaseCreation = driver.findElement(By.xpath("//span[text()='New']")).getText();
//		Assert.assertEquals(StatusBeforeCaseCreation,"New");

		
		
	//----------------------------get case ID/ read case ID-------------------------------	
		
		
//		public static String getCaseID() {
//			
//			caseID= driver.findElement(CaseID).getAttribute("value" );
//			return caseID;
//		}
//		
//		
//		public void selectInspector() {
//			getCaseID();
//			driver.findElement(selectInspector).click();
//		}
		
		
	

}
}