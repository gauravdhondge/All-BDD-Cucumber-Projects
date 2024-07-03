Feature: Verify Inspector Manager

  @Smoke2
  Scenario Outline: Validate all the tabs on Inspection Manager Home Page
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And user verify all the tabs on the Page
    Then Inspector Manager signs out from the application


    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 0         |


  @Smoke2
  Scenario Outline: Validate inspector fills the information and clicks on Cancel Button
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And user starts to creates a new Inspection case and click on cancel Button
    Then Inspector Manager signs out from the application

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 0         |
