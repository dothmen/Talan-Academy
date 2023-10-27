@tag
Feature: login fuctionnality

  @tag1
  Scenario Outline: test valid login
    Given user in home page
    When click on connexion butten
    And user enters Email and Password<Email>and<Password>
    And clicks on connexion button
    Then user is navigated to the profil page

    Examples: 
      | Email                   | Password    |
      | dorsaf.othmen@talan.com | Dodo27948.! |

  @tag2
  Scenario Outline: test invalid Email
    Given user in home page
    When click on connexion butten
    And user enters Email and Password<Email>and<Password>
    And clicks on connexion button
    Then user recived error message

    Examples: 
      | Email                  | Password    |
      | dorsaf.othmentalan.com | Dodo27948.! |

 @tag3
  Scenario Outline: test invalid Password
    Given user in home page
    When click on connexion butten
    And user enters Email and Password<Email>and<Password>
    And clicks on connexion button
    Then user recived error message

    Examples: 
      | Email                  | Password    |
      | dorsaf.othmentalan.com | dodo27948.! |
