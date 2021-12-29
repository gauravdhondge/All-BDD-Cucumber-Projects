Feature: free CRM Login feature

Scenario: Free CRM login and create new contact test scenario

# data driven with simple feature file

Given user is present on login page
Then title of login page is GTPL Bank Home Page
Then user enters username and password 
Then user clicks on login button
Then user is on home page