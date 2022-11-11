package com.stepChangeRem.remediation.pages.onlinePages;

import org.openqa.selenium.By;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;

public class OnlineWelcomePage extends Control {
	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
	private Button Getstarted;

	public Button getGetstarted() {
		return Getstarted;
	}

	public OnlineWelcomePage() {
		Getstarted = new Button(By.xpath("//button[@data-test-id='202002111437210005103984' and text()='Get started']"));
	}
	
	

	public void OnlineWelcome(){
		getDriver().manage().window().maximize();
	    this.Getstarted.click();
	    switchToNewWindow("Debt Advice");
       
}}