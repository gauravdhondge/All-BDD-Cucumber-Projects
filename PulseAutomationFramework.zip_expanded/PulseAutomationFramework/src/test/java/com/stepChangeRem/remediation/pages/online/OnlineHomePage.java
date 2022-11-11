package com.stepChangeRem.remediation.pages.online;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.Link;
import org.openqa.selenium.By;

public class OnlineHomePage extends Control {
    private Link clickMe;
    private Button Getstarted;

    public Link getClickMe() {
        return clickMe=new Link(By.linkText("Click Here"));

    }
  
	public Button getGetstarted() { return Getstarted=new Button(By.xpath("//button[contains(text(),'Get started')]"));
		
	}


    public void clickOnClickMe()
    { this.getClickMe().click();
        getBrowser().sleep(2000);
        switchToNewWindow("Debt Advice");
        getDriver().manage().window().maximize();
          
    }
}
