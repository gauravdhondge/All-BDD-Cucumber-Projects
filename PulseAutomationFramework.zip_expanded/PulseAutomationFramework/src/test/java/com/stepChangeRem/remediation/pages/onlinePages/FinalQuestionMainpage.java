package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class FinalQuestionMainpage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button HaveUBeenAwardebankRuptcyNoRB;
    private Button MinimalAssetsProcessNoRb;
    private Button IsEveryoneShareDebtsNoRb;
    private Button WhatisdebtSolutionNoRb;
    private Button ContinueButton;

    //getters
    public Button getHaveUBeenAwardebankRuptcyNoRB() {
        return HaveUBeenAwardebankRuptcyNoRB;
    }
    public Button getMinimalAssetsProcessNoRb() {
        return MinimalAssetsProcessNoRb;
    }
    public Button getIsEveryoneShareDebtsNoRb() {
        return IsEveryoneShareDebtsNoRb;
    }
    public Button getWhatisdebtSolutionNoRb() {
        return WhatisdebtSolutionNoRb;
    }
    public Button getContinueButton() {return ContinueButton; }

    public FinalQuestionMainpage(){
        HaveUBeenAwardebankRuptcyNoRB = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        MinimalAssetsProcessNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[4]"));
        IsEveryoneShareDebtsNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[6]"));
        //WhatisdebtSolutionNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[6]"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
    }

    public void PerformActionOnFinalQuestionMainPage(){
        GenericMethods_cvp.implicitWait(5000);
        this.getHaveUBeenAwardebankRuptcyNoRB().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getMinimalAssetsProcessNoRb().click();
        GenericMethods_cvp.implicitWait(5000);
       this.getIsEveryoneShareDebtsNoRb().click();
       // GenericMethods_cvp.implicitWait(5000);
       // this.getWhatisdebtSolutionNoRb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }


    	
}
