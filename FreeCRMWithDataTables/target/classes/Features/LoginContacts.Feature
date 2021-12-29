Feature: free CRM Login and create contact feature

# data driven with Data Tables feature file

Scenario: free CRM login feature test


Given user is already present on loginpage
Then title of loginpage
Then user enters username and password
|jayeshgaurav| Gaurav@123|
Then user clicks on login button
Then title of mainpage
Then close the browser