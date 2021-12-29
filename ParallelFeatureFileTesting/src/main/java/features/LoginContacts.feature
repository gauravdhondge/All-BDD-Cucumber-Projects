Feature: free CRM Login and create contact feature


Scenario: Free CRM login and create new contact test scenario


Given user is already present on login page
Then the title of loginpage is Free CRM
Then user enter username and password
|username    | password  |
|gauravjayesh| Jayesh@123|
 Then user click on login button
Then user comes on home page
Then user moves to contacts button
Then user clicks on new contact link
Then user enters  firstname and surname and position
| firstname | surname   | position       |
| Markes    | Henry     | Batsman        |
| Josh      | John      | Fast Bowler    |
| Smruti    | Mandhana  | Opening Batsman| 
Then verify contact created
#Then close the browser