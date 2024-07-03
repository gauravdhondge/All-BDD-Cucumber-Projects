Feature: Inspectors Manager Create Inspection Form And Inspector Save it When Routed to Him

  @InspectionFormSavedByInspector
  Scenario Outline: Validate inspector manager fills the information and completes the Inspection form
    Given user is present on login page
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page
    And Inspector Manager Creates the new case
    Then Inspector Manager signs out from the application

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 0         |

  @InspectionFormSavedByInspector
  Scenario Outline: Validate inspector saves the Inspection form
    Given inspector is present on login page
    When inspector enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And inspector clicks on login button
    And inspector clicks on the created case and saves it

    Examples:
      | SheetName                | RowNumber |
      | PegaInfinityLoginDetails | 3         |