@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given user on register page
    When user enters name <name>
    And user enters lastname <lastname> 
    And user enters password <Motdepasse> 
    And user enters email <email> 
    And user enters birthday <birthday> 
    And user click on inscrition button
    Then account is created

    Examples: 
      | name        | lastname  |   Motdepasse   | email      | birthday  | 
      | dor      | oth |   55555doroth   | farahbarbouch15@gmail.com   | 15/09/1993 | 