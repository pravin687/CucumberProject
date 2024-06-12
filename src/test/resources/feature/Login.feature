@Login
Feature: Login scenario

  Background: 
    Given user login in "https://debugautomation.com/" website

  @Regression
  Scenario: Login with incorrect username and password
    When User insert username  "testuser" and password "testpahssdword"
    And user click on submit button
    Then user will verify homepage

  @Sanity @Regression
  Scenario: Login with correct username and password
    When User insert username  "testuser" and password "testpassword"
    And user click on submit button
    Then user will verify homepage
    
    
 