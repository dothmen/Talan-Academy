Feature: add the selected product to the cart

  Background: 
    Given login page is open
    When user enters dorsafothmen12@gmail.comandDodo27948.!
    And clicks on login  button
    And user is navigated to the home page
    When user wants to search for the cheapest software
    And user click on informatique button
    And choose the category user click on software button
    And click on relevance button and click on decreasing price
    Then user chooses the software that suits them

  @add
  Scenario: check add the selected product to the cart
    When when the user clicks on the product he wants to buy
    And click on add to Cart
    Then Product added to cart successfully
