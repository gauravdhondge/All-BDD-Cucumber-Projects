Feature: free CRM Login and create contact feature

Scenario Outline: Free CRM login and create new contact test scenario

# data driven with examples keyword feature file

Given user is present on login page
Then title of login page is Free CRM
Then user enters "<username>" and "<password>" 
Then user clicks on login button
Then user is on home page
Then user moves to contacts button
Then user clicks on new contact link
Then user enters contact details "<firstname>" and "<surname>" and "<position>"
Then user clicks on save button
Then verify contact created
Then close the browser


Examples:


| username     |     password   | firstname   |   surname    | position        |
| gauravjayesh | Jayesh@123     | Rohit       |   sonkamble  | Captain         |
| gauravjayesh | Jayesh@123     | Shardul     |   Thakur     | Bowler      	   |
| gauravjayesh | jayesh@123     | Rahul     |   KL           | Vice Captain    |