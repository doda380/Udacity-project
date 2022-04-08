@smoke
Feature: user will be able to login with valid credentials

  Scenario: user will be able to login with valid Email and password
   And user navigates to Login page
   When user enter valid "AhmedGamal99@gmail.com" , "123456"
   And press to login button
   Then user will redirect to home page







