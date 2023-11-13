Feature: add a comment

  Background: 
    Given login page is open
    When user enters dorsafothmen12@gmail.comandDodo27948.!
    And clicks on login  button
    And user is navigated to the home page
    When the user clicks on technopro
    And the user clicks on the product he wants to buy

  @addcomment
  Scenario: add a comment
    When user click on add a comment
    And enter title and comment
    And click on submit button
    Then submit comment is successful
