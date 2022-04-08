@smoke
Feature: user will be able to register

  Scenario: user will be able to register with valid credentials

    And user navigates to register page
    When user enter "Ahmed" , "Gamal" , "AhmedGamal99@gmail.com" , "EWM" , "123456" and "123456"
    And user pressed register button
    Then user redirected to confirmation page

