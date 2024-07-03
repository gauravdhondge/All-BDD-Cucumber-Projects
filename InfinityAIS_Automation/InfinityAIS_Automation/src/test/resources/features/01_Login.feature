Feature: Verify login feature

  @Smoke1
  Scenario Outline: Validate successful login into the system 
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
 #   And User checks Remember me checkbox
    And user clicks on login button
    Then user is on home page
    Then Inspector Manager signs out from the application

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 0         |


  @Smoke1
  Scenario Outline: Validate login into the system with invalid credentials
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user should get an error message
    Then user closes the browser

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 1         |
      
      
  @Smoke1
  Scenario Outline: Validate successful Logout from the system 
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
#    And User checks Remember me checkbox
    And user clicks on login button
    Then user is on home page
    Then Inspector Manager signs out from the application

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 0         |

