@Home
Feature: Home page

  Background: 
    Given user login in "https://debugautomation.com/" website
    When User insert username  "testuser" and password "testpassword"
    And user click on submit button

  @Regression
  Scenario: verify selenium link
    When I click on Selenium link
    Then I check user land on selenium webpage

  #Scenario: verify api link
   # When I click on api link
    #Then I check user land on api webpage
