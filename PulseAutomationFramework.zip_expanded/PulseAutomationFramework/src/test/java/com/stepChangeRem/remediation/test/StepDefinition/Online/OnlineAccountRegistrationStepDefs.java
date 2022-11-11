package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineAccountRegistrationHelper;
import com.stepChangeRem.remediation.pages.helper.vo.AccountRegistrationFields;
import com.stepChangeRem.remediation.pages.onlinePages.AccountRegistrationPage;
import com.stepChangeRem.remediation.pages.onlinePages.HelpUsPageOnline;
import com.stepChangeRem.remediation.pages.onlinePages.OnlineWelcomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class OnlineAccountRegistrationStepDefs {
    OnlineAccountRegistrationHelper registrationHelper=new OnlineAccountRegistrationHelper();
    AccountRegistrationPage CreateStepChangeAccountPage=new AccountRegistrationPage();
    HelpUsPageOnline helpUsPageOnline = new HelpUsPageOnline();
    
    @Then("Client Registered With StepChnage")
    public void clientRegisteredWithStepChnage(DataTable values) {
        List<AccountRegistrationFields> accountRegistrationFields = values.asList(AccountRegistrationFields.class);
        registrationHelper.fillAccountRegistration(accountRegistrationFields);

    }
    @When("^On Step Change Account Registration Continue without registration$")
    public void on_Step_Change_Account_Registration_continue_without_registration() {
        CreateStepChangeAccountPage.withoutRegistrationOnline();
        //HouseholdPageObj.
        
    }
    @And("^User Clicks CheckBox Button And Clicks Continue Button$")
    public void User_Clicks_CheckBox_Button_And_Clicks_Continue_Button() {
    	helpUsPageOnline.HelpUsOnline();
    
    }
    
}
