Feature: add the selected product to the cart

  Background: 
    Given login page is open
    When user enters dorsafothmen12@gmail.comandDodo27948.!
    And clicks on login  button
    And user is navigated to the home page

  @add
  Scenario: check add the selected product to the cart
    When the user clicks on technopro
    And the user clicks on the product he wants to buy
    And click on add to Cart
    Then Product added to cart successfully
