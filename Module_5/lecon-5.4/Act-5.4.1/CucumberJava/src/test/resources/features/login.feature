
@tag
Feature: Test login functionality
  

  @tag1
  Scenario Outline: check login is successful with valid credentials
    Given browser is open
    When user enters <email>and<password>
    And clicks on login  button
    Then user is navigated to the home page
    
     Examples: 
      | email | password |
      | dorsaf.othmen@talan.com|     dodododo27948.! | 
    

 