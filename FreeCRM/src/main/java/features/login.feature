Feature: free CRM Login and create contact feature


Scenario: Free CRM login and create new contact test scenario

# data driven with simple feature file

Given user is present on login page
Then title of login page is Free CRM
Then user enters username and password
|username    | password  |
|gauravjayesh| Jayesh@123|
 Then user clicks on login button
Then user is on home page
Then user moves to contacts button
Then user clicks on new contact link
Then user enters  firstname and lastname and position
| firstname | surname   | position       |
| Mark      | Henry     | Batsman        |
| Joseph    | John      | Fast Bowler    |
| Smruti    | Mandhana  | Opening Batsman| 
Then verify contact created
#Then close the browser