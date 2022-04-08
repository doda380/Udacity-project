@smoke
Feature: user will be able to search for any product on the system

  Scenario: user will be able to search for any product using full name

    And user navigates to home page
    When user clicks on search field
    And user search with name of product "laptop"
    Then user could find relative product
    