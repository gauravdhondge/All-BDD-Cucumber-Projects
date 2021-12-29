Feature: free CRM Login and create contacts and deals feature


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



Scenario: Free CRM login and create new deals test scenario

Given user is present on login page
And title of login page is Free CRM
When user enters username and password
|username    | password  |
|gauravjayesh| Jayesh@123|
And user clicks on login button
Then user is on home page
When user moves to deals button
And user clicks on new deal  link
And user enters Title and Amount and Probablity and Commission
| Title      | Amount   | Probability| Commission |
| TestDeal21 | 21000     |      12   |     4      |
| TestDeal22 | 23000     |      13   |     5      |
| TestDeal23 | 11000     |      14   |     7      |
Then verify deals created
#And close the browser