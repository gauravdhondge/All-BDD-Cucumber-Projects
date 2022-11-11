package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.onlinePages.OnlineWelcomePage;

import cucumber.api.java.en.*;

public class OnlineWelcomeStepDef {
	OnlineWelcomePage onlineWelcomePage=new OnlineWelcomePage();
	@And("^User Navigates to Online Welcome Page$")
    public void UserNavigatesToOnlineWelcomePage()
{ 
		onlineWelcomePage.OnlineWelcome();
		
}

}
