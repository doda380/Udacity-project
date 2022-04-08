@smoke
Feature: user will be able to filter with color

  Scenario: user will be able to filter with any color

    And user will navigates to the home page
    When user select Apparel - shoes
    And use filter by the color
    Then item with color chosen will appear