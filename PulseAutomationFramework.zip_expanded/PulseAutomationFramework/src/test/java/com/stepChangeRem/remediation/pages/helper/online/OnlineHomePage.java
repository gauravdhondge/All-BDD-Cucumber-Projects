package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.core.GenericMethods;

import org.openqa.selenium.By;

public class OnlineHomePage extends Control {
    private Link clickMe;
   

    public Link getClickMe() {
        return clickMe=new Link(By.linkText("Click Here"));

    }

    public void clickOnClickMe()
    {  
    	this.getClickMe().click();
        getBrowser().sleep(2000);
        switchToNewWindow("Debt Advice");
        
    }
}
