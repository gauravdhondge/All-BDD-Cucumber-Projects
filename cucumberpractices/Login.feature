Feature: free CRM login feature
 
Scenario: Free CRM login contact test scenario

Given user is present on login page
And title of login page is Free CRM
When user enters username and password 
Then user clicks on login button
And user is on home page