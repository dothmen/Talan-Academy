
@tag
Feature: Test login functionality
  

  @tag1
  Scenario: check login is successful with valid credentials
    Given browser is open
    And user is login page
    When user enters "dorsafothmen12@gmail" and "dodododo27948.!"
    Then user is navigated to the home page
    

 