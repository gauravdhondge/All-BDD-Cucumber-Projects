Feature: free CRM Login and create deals feature

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