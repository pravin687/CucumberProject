@Login
Feature: Login scenario test

  Scenario Outline: Successfully login with testdata
    Given user login in "https://debugautomation.com/" website
    When User insert username  "<username>" and password "<password>"
    Then user will verify homepage

    Examples: 
      | username  | password      |
      | testuser  | testpassword  |
      | testuser1 | testpassword3 |
      | testuser2 | testpassword3 |
