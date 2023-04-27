Feature: guru99 login feature

Scenario Outline: guru99 login test scenario and Add Customer

# data driven with excel sheet

Given user is present on login page
And title of login page is GTPL Bank Home Page
When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on login button
Then user is on home page
Then user clicks on Telecom Project
Then user clicks on close button
Then user clicks on add customer button 
Then user is on add customer page 
Then user enters billing address from given sheetname "<SheetName>" and rownumber <RowNumber>


Examples:

|SheetName     |RowNumber |
|LoginDetails  |  0       |      
 

 Scenario Outline: guru99 login test scenario and Add Tariff Plan

# data driven with excel sheet

Given user is already present on login page
And title of the login page is GTPL Bank Home Page
When user enter userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on the login button
Then user navigates to home page
Then user clicks on Telecom Project field
Then user clicks on the close button
Then user clicks on add Tariff Plan 
Then user is on add tariff plan page
Then user enters tariff plan details from given sheetname "<SheetName>" and rownumber <RowNumber>


Examples:

|SheetName                  |RowNumber |
|LoginAddTariffPlanDetails  |  0       |      
 
 
 
 
 
 
 
 
 
 