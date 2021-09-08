Feature: Application Login

Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login to application with "Candi" and "Chiu"
    Then Home page is populated
    And Cards displayed "true"
    
Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login to application with "Candy" and "NotCandi"
    Then Home page is populated
    And Cards displayed "false"
