package com.stepChangeRem.remediation.pages.onlinePages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;

public class YourMakingGoodProgress extends Control {
	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
	private Button ContinueWithDebtAdvice;
	private Button CarryOnThrough;
	private Button WhenWeHaveEveryThing;
	private Button IfYouAreElgible;
	
	public Button getContinueWithDebtAdvice() {return ContinueWithDebtAdvice;}
	public Button getCarryOnThrough() {return CarryOnThrough;}
	public Button getWhenWeHaveEveryThing() {return WhenWeHaveEveryThing;}
	public Button getIfYouAreElgible() {return IfYouAreElgible;}
	
	public YourMakingGoodProgress() {
		ContinueWithDebtAdvice = new Button(By.xpath("(//button[contains(text(),'Continue')])[1]"));
		CarryOnThrough =new Button(By.xpath("//p[contains(text(),'Carry on')]"));
		WhenWeHaveEveryThing=new Button(By.xpath("(//div[contains(text(),'When we')])[1]"));
		IfYouAreElgible =new Button(By.xpath("(//div[contains(text(),'If you’re eligible')])[2]"));
	}
	public void YourMakingGoodprogress(){
		//switchToActiveFrame();
		GenericMethods_cvp.implicitWait(10000);
		this.getContinueWithDebtAdvice().click();
		
	}
		
	
	

}
