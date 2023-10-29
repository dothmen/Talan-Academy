Feature: update for first name

  Background: 
  
    Given login page is open
    When user enters dorsafothmen12@gmail.comandDodo27948.!
    And clicks on login  button
    And user is navigated to the home page

    
  @update
  Scenario Outline: test update is successful
    When click on information button
    And user delete old first name
    When user writes <newfirstname>and<password>
    And click to pic message
    And click to pic confidentiality
    And click to save button
    Then update new first name is successful

    Examples: 
      | newfirstname | password    |
      | dorsafaa     | Dodo27948.! |

  @failedupdate
  Scenario Outline: test update is not successful
    Given user is navigated to the home page
    When click on information button
    And user delete old first name
    When user writes <newfirstname>and<password>
    And click to pic message
    And click to pic confidentiality
    And click to save button
    Then update new first name is not successful

    Examples: 
      | newfirstname | password |
      | dorsafaaa    | fgsfgf   |
