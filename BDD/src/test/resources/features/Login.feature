Feature: guru99 login feature

Scenario Outline: guru99 login test scenario

# data driven with excel sheet

Given user is present on login page
And title of login page is GTPL Bank Home Page
When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on login button
Then user is on home page
And user clicks on telecom project and selects add customer
When user selects background check as done and enters billing address from given sheetname "<SheetName>" and rownumber <RowNumber>

Examples:

|        SheetName                   |RowNumber|
|LoginAndAddCustomerDetails          |  0      |
|LoginAndAddCustomerDetails          |  1      |