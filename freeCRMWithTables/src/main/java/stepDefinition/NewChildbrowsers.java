package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewChildbrowsers {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com");
	
	System.out.println("switched to mainpage");
	
	Thread.sleep(3000);

    List<WebElement> tryitbutton = driver.findElements(By.xpath("(//a[text()='Try it Yourself'])"));
//    tryitbutton.get(1).click();
//    tryitbutton.get(2).click();
//    tryitbutton.get(3).click();
    
    int a = tryitbutton.size();
    System.out.println("no of tryit buttons:"+a);
    
    
    for(int i=0; i<a;i++) {
    	
    	tryitbutton.get(i).click();
    	
    }
    
    
    System.out.println("clicked on all tryit buttons");
    
    Thread.sleep(3000);
    
    Set<String> addresses = driver.getWindowHandles();
   // System.out.println(addresses);
    
//---------getting id's of main and  child browsers-----------------------    
    
   ArrayList<String> addr = new  ArrayList<String>(addresses);
   
//   String ParentID = addr.get(0);
//   String ChildBrowser_1_ID = addr.get(1);
//   String ChildBrowser_2_ID = addr.get(2);
//   String ChildBrowser_3_ID = addr.get(3);
//   String ChildBrowser_4_ID = addr.get(4);
//   String ChildBrowser_5_ID = addr.get(5);
//    
//   System.out.println("ParentID:"+ParentID);
//   System.out.println("ChildBrowser_1_ID:"+ChildBrowser_1_ID);
//   System.out.println("ChildBrowser_2_ID:"+ChildBrowser_2_ID);
//   System.out.println("ChildBrowser_3_ID:"+ChildBrowser_3_ID);
//   System.out.println("ChildBrowser_4_ID:"+ChildBrowser_4_ID);
//   System.out.println("ChildBrowser_5_ID:"+ChildBrowser_5_ID);

//---------------------------------------------------------------------------------   
    
// ------switching to windows through ID's-------------------------------    
   
// driver.switchTo().window(ChildBrowser_1_ID);
// System.out.println("Title Of childbrowser_1:" +driver.getTitle()); 
//   
// Thread.sleep(3000); 
//   
// driver.switchTo().window(ParentID);
// System.out.println("Title Of ParentBowser:" +driver.getTitle()); 
   
 //--------------------------------------------------------------------------------
 
//--------------printing all window title through for loop-----------------------------------------
   
  
// for(String windowaddr:addr) {
//	 
//	 String addrs = driver.switchTo().window(windowaddr).getTitle();
//	 System.out.println(addrs);
// }
//   
//  driver.close(); 
   
//----------------------------------------------------------------------------------   
   
   
//-------closing specific browsers which we want-------------------------------------------   
   
    for(String windowaddr:addr) {
		 
		 String titles = driver.switchTo().window(windowaddr).getTitle();
		 System.out.println(titles);
		 if(titles.equals("SQL Tryit Editor v1.6")|| titles.equals("W3Schools Online Web Tutorials")) {
			 
			 driver.close();
			 
		 }
	 }
	   
   
   Actions act = new Actions(driver);
   act.moveToElement(null).build();
   
   
   
   
   
   
   
   
   
   
    
//    ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//    driver.switchTo().window(addr.get(1));
//    
//    System.out.println("Switched to childbrowser");
//    
//    Thread.sleep(3000);
//    
//    WebElement runbutton = driver.findElement(By.xpath("//button[@id='runbtn']"));
//    runbutton.click();
//	
//    System.out.println("clicked on run button on childbrowser");
//    
//    ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
//    driver.switchTo().window(addr1.get(0));
//    
//    System.out.println("Switched to mainpage");
    
    
    
    
    
    
    
    
}
}