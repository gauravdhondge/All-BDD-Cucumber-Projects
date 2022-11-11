package com.stepChangeRem.remediation.test.StepDefinition;

import com.stepChangeRem.remediation.pages.SignPostingPage;
import com.stepChangeRem.remediation.pages.helper.vo.SignPostingFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.List;

public class SignPostingStepdefs {
    SignPostingPage sign=new SignPostingPage();
    @Then("^User Do Sign Posting$")
    public void userDoSignPosting(DataTable table) {
        sign.getSignPosting().click();
        List<SignPostingFields> signPostingFields = table.asList(SignPostingFields.class);
        sign.getSignPostingDone(signPostingFields);
    }
}
