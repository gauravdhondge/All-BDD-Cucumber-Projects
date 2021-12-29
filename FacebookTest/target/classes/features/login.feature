Feature: Facebook login feature

Scenario: Facebook login test scenario

Given user is already present on loginpage
When title of the page is facebook
Then user enters username and password
Then user clicks on login button
And user is on homepage
