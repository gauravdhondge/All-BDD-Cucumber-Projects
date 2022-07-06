Feature: guru99 login feature

Scenario Outline: guru99 login test scenario

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

|SheetName     |RowNumber |SheetName     |RowNumber|
|loginDetails  |  0       |BillingDetails| 0       |

