Feature: Validation of E2E scenario 89963
  @SoleClientPaymentSuspensionScotlandSC89963
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate E2E scenario 89963
    Given User is on Your debt advice journey starts here page
    And User Navigates to Online Welcome Page
    When User Navigate to Create a StepChange account page and Clicks Continue without registering
    #Then User Naviagate to Your House hold Page from dashboard and enter valid data
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
      |Living with family         |Single       |0                |0                     |0                |false                    |Unemployed: not looking for work|false             |0           |
    #And User Navigate to Debts page and enter debts details
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor      | debttype             |      amountOwed  | liability | areYouBehindWithPayments |ongoingMobileService|furtherAction |furtherActionType                 |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|arrangementRepayInsurance|reasonForSpending               |spentAmount|
      | HSBC          |  Credit card         |      3600        | You       |  No                      |false               |       No     |   false                          |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |false      |
      | Lowell        |  Mobile phone arrears|      3600       | You       |  false                   |No                  |      false   |   No action taken (arrears only) |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |fasle      |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    And Action on Additional questions about your debts page
    And User Naviagate to Creating your budget from dashboard and Click on Continue
    And User Navigate to Your Income Page and Click on Continue
    And user Navigate to Your Spending cost Page from dashboard and Enter valid data
    And user Navigate to Your Advice on your budget Page from dashboard and Click on Register to Save Progress link
    And user Navigate to Create Step Change Account page and Enter Valid data
    And User Clicks CheckBox Button And Clicks Continue Button
    And User Navigate to Your Income Page from dashboard and Enter Valid data
    And user Navigate to Your Advice on your budget Page from dashboard and perform Action on Page
    And user Navigate to Your your budget Summary page and Perform Action On Page
    And user Navigate to Final Question Assets page and Future Changes Page and perform Action on page
    And User Navigate to Final Questions Page and Perform Action on Page
    And User Navigate to Your priority payments page from dashboard and Click on Continue
    And User Navigate to Review Your options page from dashboard and Click on Continue
    And Verify Payment Suspension is one of the recommended solution from Your Recommended Solutions Page
    And Click on close and close Browser
    #And close Browser