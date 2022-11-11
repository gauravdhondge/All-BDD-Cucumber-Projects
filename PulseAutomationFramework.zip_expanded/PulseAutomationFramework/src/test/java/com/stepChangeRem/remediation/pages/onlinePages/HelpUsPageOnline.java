package com.stepChangeRem.remediation.pages.onlinePages;
import org.openqa.selenium.By;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;

public class HelpUsPageOnline extends Control {
	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
	private Button HelpusContinue;
	private Button HelpusBack;
	private Button ContactedCheckBox;
	private Button CloseButton;
	
	public Button getHelpusContinue() {return HelpusContinue;}
	public Button getHelpusBack() {return HelpusBack;}
	public Button getContactedCheckBox() {return ContactedCheckBox;}
	public Button getCloseButton() {return CloseButton;}
	
	public HelpUsPageOnline() {
		HelpusContinue = new Button(By.xpath("//button[contains(text(),'Continue')]"));
		HelpusBack =new Button(By.xpath("//button[@class='SC_Button_Quinary pzhc pzbutton']"));
		ContactedCheckBox=new Button(By.xpath("//label[@class=' cb_standard']"));
		CloseButton =new Button(By.xpath("//i[@name='SelfServiceHeader_pyWorkPage_38']"));
	}
	
	public void HelpUsOnline() {
		GenericMethods_cvp.implicitWait(10000);
		this.getContactedCheckBox().click();
		GenericMethods_cvp.implicitWait(10000);
		this.getHelpusContinue().click();
		GenericMethods_cvp.implicitWait(10000);
		/*this.getHelpusBack().click();
		GenericMethods_cvp.implicitWait(10000);
		this.getCloseButton().click();
		GenericMethods_cvp.implicitWait(1000);*/
		}
	

}
