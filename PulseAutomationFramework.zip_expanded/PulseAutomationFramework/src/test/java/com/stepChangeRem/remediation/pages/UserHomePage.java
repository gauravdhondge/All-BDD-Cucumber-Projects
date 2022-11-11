package com.stepChangeRem.remediation.pages;




import java.util.Set;



import org.openqa.selenium.By;



import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;



public class UserHomePage extends Control {
GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
//private Button DEVPulseTelephony;
private Button SITPulseTelephony;

public Button getSITPulseTelephony()
{return SITPulseTelephony;
}

public UserHomePage()
{
SITPulseTelephony= new Button(By.xpath("//*[@id=\"main-content\"]/div/div[2]/ul[2]/li[2]/a"));
}
public void UserHome()
{
GenericMethods_cvp.implicitWait(10000);
this.getSITPulseTelephony().click();
String parent = getDriver().getWindowHandle();
Set<String> allWindows = getDriver().getWindowHandles();
for(String child:allWindows)
{
if(!parent.equalsIgnoreCase(child))
{
getDriver().switchTo().window(child);
}
}
}



}
