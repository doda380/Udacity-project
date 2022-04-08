@smoke
Feature: user will be able to  add different products to Shopping cart

  Scenario: user will be able to add different products to Shopping cart
    And user navigates to Login page
    When user enter valid "AhmedGamal99@gmail.com" , "123456"
    And press to login button
    When user press add to cart for a specific product
    Then Confirmation message appear



  Scenario: user will be able to add product to Wish list
    And user navigates to Login page
    When user enter valid "AhmedGamal99@gmail.com" , "123456"
    And press to login button
    When user press add to Wish list for a specific product
    Then Confirmation message appear


  Scenario: user will be able to add product to Wish list
    And user navigates to Login page
    When user enter valid "AhmedGamal99@gmail.com" , "123456"
    And press to login button
    When user press add to compare list for a specific product
    Then Confirmation message appear


  Scenario: user will be able to create successful Order
    And user navigates to Login page
    When user enter valid "AhmedGamal99@gmail.com" , "123456"
    And press to login button
    When user press add to cart for a specific product
    And user checkout by adding his info "California" , "Wall Street" , "11311" , "0112255448"
