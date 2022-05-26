Feature: guru99 login feature

@SmokeTest
Scenario Outline: guru99 login and Add customer test scenario

Given user is present on login page
And title of login page is GTPL Bank Home Page
When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on login button
Then user is on home page
And user clicks on telecom project and selects add customer
When user selects background check as done and enters billing address from given sheetname "<SheetName>" and rownumber <RowNumber>

Examples:

|        SheetName            |RowNumber|
|LoginAndAddCustomerDetails   |    0    |




@RegressionTest
Scenario Outline: guru99 login and Add tariff plan test scenario

Given user is already present on login page
And the title of login page is GTPL Bank Home Page
When user enters username and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
And then user clicks on login button
Then user comes on home page
And user clicks on telecom project and selects add tariff plan
When user enters add tariff plan details from given sheetname "<SheetName>" and rownumber <RowNumber>


Examples:

|        SheetName            |RowNumber|
|LoginAndAddTariffPlanDetails |    0    |



