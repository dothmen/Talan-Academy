
Feature: Test login functionality

  @login
  Scenario Outline: check login is successful with valid credentials
    Given login page is open
    When user enters <email>and<password>
    And clicks on login  button
    Then user is navigated to the home page

    Examples: 
      | email                    | password    |
      | dorsafothmen12@gmail.com | Dodo27948.! |

  @failedlogin
  Scenario Outline: check login not valid
    Given login page is open
    When user enters <email>and<password>
    And clicks on login  button
    Then user recived error message

    Examples: 
      | email                   | password    |
      | dorsafothmen1@gmail.com | dodo27948.! |
