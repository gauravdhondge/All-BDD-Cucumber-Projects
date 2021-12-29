Feature: free CRM Login and create feature

Scenario: Free CRM login test scenario

Given user is present on login page
And title of login page is Free CRM
When user enters username and password in the respected fields
And user clicks on login button
Then user is on home page