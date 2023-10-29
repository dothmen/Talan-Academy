Feature: research product

  Background: 
    Given login page is open
    When user enters dorsafothmen12@gmail.comandDodo27948.!
    And clicks on login  button
    And user is navigated to the home page

  @research
  Scenario: check research product is successful
    When user wants to search for the cheapest software
    And user click on informatique button
    And choose the category user click on software button
    And click on relevance button and click on decreasing price
    Then user chooses the software that suits them
