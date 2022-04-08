Feature:User will be able to reset his password

  Scenario: User will be able to reset his password
    And user navigates to Login page
    When user press forget password link text
    And user enter recovery "AhmedGamal99@gmail.com"
    Then confirmation message will appear