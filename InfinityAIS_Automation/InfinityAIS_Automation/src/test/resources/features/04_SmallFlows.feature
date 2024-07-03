Feature: Verify the small features like save and miscellaneous

  @Misc
  Scenario Outline: Validate inspector fills the information and completes the Inspection form
    Given user is present on login page
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And user starts to creates a new Inspection and completes the inspection.
    Then user signing out

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         0 |

  @Misc
  Scenario Outline: Validate inspector does not complete the Inspection form
    Given inspector is present on login page
    When inspector enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And inspector clicks on login button
    And inspector does not complete the inspection

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         4 |

  @Misc
    Scenario Outline: Validate inspector saves the Inspection form
    Given inspector is present on login page
    When inspector enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And inspector clicks on login button
    And inspector clicks on the created case and saves it

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         4 |