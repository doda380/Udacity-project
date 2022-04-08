Feature:User will be able to change currencies

  Scenario: User will be able to change US to Euro
    And user navigates to Home page
    When user press the combo box
    And user Select "1"
    Then The currency change



  Scenario: User will be able to change Euro to US
    And user navigates to Home page
    When user press the combo box
    And user Select "0"
    Then The currency change