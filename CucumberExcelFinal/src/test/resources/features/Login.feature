Feature: NopCommerce login feature

Scenario Outline: NopCommerce login test scenario

# data driven with excel sheet

Given user is present on loginpage 
And title of loginpage is Your store Login
When user enters email and password from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on login button
Then user is on home page


Examples:

|  SheetName      | RowNumber |
|  DetailsOfLogin |    0      |

