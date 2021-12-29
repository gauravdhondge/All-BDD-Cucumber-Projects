Feature: Guru99 login and create telecom project

Scenario: telecom project and add customers test scenario

Given user is present on login page
And title of login page is GTPL Bank Home Page
When user enters userID and password 
|userID    | password  |
|mngr376749| vavAqUp   |
And user clicks on login button
Then user is on home page
And user clicks on telecom project
And user clicks on add customer
When user selects background check as done and enters billing address
| firstname    | lastname    | email                     | address     | mobilenumber |
| madhuri      | dhondge     |gauravdhondge@gmail.com    | Nashik      |8007975732    |
| mangesh      | dhondge     |kulkarnijayesh11@gmail.com | Mumbai      |8830407067    |
And user again comes on telecom projects homepage


