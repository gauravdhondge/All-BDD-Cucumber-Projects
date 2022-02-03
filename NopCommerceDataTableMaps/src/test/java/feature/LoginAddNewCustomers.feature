Feature: Login into nopcommerce and add new customers feature

Scenario: add new customers scenario

Given user is present on loginpage 
And title of loginpage is Your store Login
When user enters email and password
|     email          |  password   |
|admin@yourstore.com |   admin     |
And user clicks on login button
Then user is on homepage
And user clicks on customers module and selects customer submodule
And user moves to add new button 
When user fills the customer info and clicks on save button
|       email          |  password  |  firstname  | lastname  |  gender  |date of birth|company name|  admin comment    | 
|davidwarner@gmail.com |  David@123 |    David    |  Warner   |   male   | 1/12/1990  |    Wipro   |  customer created |
#And  user verifies the new added customers
#And returns back to the homepage and logsout and close the browser