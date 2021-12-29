Feature: Facebook new account login feature

Scenario Outline: Facebook new account test scenario

Given user is already present on loginpage
Then user verifies the title of loginpage
Then user clicks on create new account button
#Then user enters "<firstname>" and "<lastname>" and "<phonenumber>" and "<newpassword>"
Then user selects date of birth
#Then user selects gender
#Then user clicks on signup button

Examples:

|firstname  | lastname  |  phonenumber   |  newpassword    |
|jayu       | dhondge   | 8007975732     | Gaurav@123      |