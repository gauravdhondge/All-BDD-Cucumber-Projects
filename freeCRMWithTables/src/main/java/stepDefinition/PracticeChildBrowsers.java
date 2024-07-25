package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChildBrowsers {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chrome February\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> tryit = driver.findElements(By.xpath("//a[text()='Try it Yourself']"));
	
//---------------------clicking on all tryit buttons--------------------------------------------------
		
		int a = tryit.size();
		System.out.println("No.of Tryit Buttons = "+a);
		
		
//		for(int i=0; i<a;i++) {
//			
//			tryit.get(i).click();
//		}
//		
		
//-----------------------------clicking on specific tryit buttons---------------------------------------		
		
		
		tryit.get(1).click();
		tryit.get(2).click();
		tryit.get(3).click();
        tryit.get(4).click();

		
		
		
		
		
//------switching to a specific window directly and getting page title---------------------------------------------		
		
		
		Thread.sleep(5000);

		
//	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());	
//		
//	String title = driver.switchTo().window(addr.get(5)).getTitle();	
//		
//	    System.out.println(title);
//		System.out.println("Switched");	
		
	
//-------------------switching to specific window by getting adresses--------------------------------	
	
	
	Set<String> addresses = driver.getWindowHandles();
	
	ArrayList<String> addr = new ArrayList<String>(addresses);
	
	
	String mainpage = addr.get(0);
	String child1 = addr.get(1);
	String child2 = addr.get(2);
	String child3 = addr.get(3);
	String child4 = addr.get(4);
	


	
	System.out.println("mainpage = "+mainpage);
	System.out.println("child1 = "  + child1);
	System.out.println("child2 = "  +child2);
	System.out.println("child3 = "  +child3);
	System.out.println("child4 = "  +child4);



//	Thread.sleep(3000);
//
//	driver.switchTo().window(child1);
//
//	System.out.println("Switched child1");
		
	Thread.sleep(5000);
//	
//	driver.switchTo().window(child2);
//
//	System.out.println("Switched child2");
	
	
//---------------------close specific window/tabs-------------------------------------------------------	
	
	
	

   driver.switchTo().window(mainpage);
   
   System.out.println("Switched to mainpage");
   
	Thread.sleep(8000);

   driver.switchTo().window(child1);

   System.out.println("Switched to child1");
   
	Thread.sleep(5000);

   
   WebElement RestoreButton = driver.findElement(By.xpath("//button[@id='restoreDBBtn']"));
   RestoreButton.click();
   
	Thread.sleep(5000);

	Alert alt = driver.switchTo().alert();
	String AlertText = alt.getText();
	alt.accept();
	
for(String Titles: addr) {
		
		String PageTitles= driver.switchTo().window(Titles).getTitle();
		System.out.println(PageTitles);
		
	if(PageTitles.equals("W3Schools Tryit Editor"))
	{
		
		driver.close();
	}



}
	

   
//   Thread.sleep(8000);
//
//   driver.switchTo().window(child2);
//
//   System.out.println("Switched to child2");
//   
//   Thread.sleep(8000);
//
//   driver.switchTo().window(child3);
//
//   System.out.println("Switched to child3");
//   
//   Thread.sleep(8000);
//
//   driver.switchTo().window(child4);
//
//   System.out.println("Switched to child4");
   
	
		
	}

}
