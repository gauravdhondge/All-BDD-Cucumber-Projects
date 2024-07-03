Feature: Verify Reviewers could reject the inspection

  @Rejection
  Scenario Outline: Validate inspector manager fills the information and completes the Inspection form
    Given user is present on login page
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And user starts to creates a new Inspection and completes the inspection.
    Then user signing out

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         0 |

  @Rejection
  Scenario Outline: Validate inspector approves the Inspection form
    Given inspector is present on login page
    When inspector enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And inspector clicks on login button
    And inspector clicks on the created case and completes it

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         4 |

  @Rejection
  Scenario Outline: Validate reviewer completes the Inspection form
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And reviewer reviews the inspection and rejects it

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         6 |

  @Rejection
  Scenario Outline: Verify a new re-inspection case is created
    Given user is present on login page
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And inspection manager gets the case name of the newly created reinspection case

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         0 |

  @Rejection
  Scenario Outline: Validate inspector fills the information and clicks on Cancel Button
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And inspector reinspects the rejected inspection
    Then user signing out

    Examples:
      | SheetName    | RowNumber |
      | LoginDetails |         0 |