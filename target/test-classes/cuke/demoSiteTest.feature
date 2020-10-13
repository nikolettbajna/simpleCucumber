Feature: demoSiteTest
  I want to register to the website
  So I can use my username and password to login

  Scenario: register
    Given I can access the "http://thedemosite.co.uk/" website
    And I can navigate to the register page
    When I type in the following credentials
      | root		  |   root   |
    Then I am able to register
    
    
    Scenario: login
    Given I can navigate to the login page
    When To login I type in the following credentials
      | root		  |   root   |
    Then I am able to login