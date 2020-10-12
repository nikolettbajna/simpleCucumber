Feature: teaTask

  Scenario: buy tea
    Given I can open the website
    And the title is equals to "Welcome"
    When I check the menu
    And I choose the "Red Tea"
    And I will buy the tea
    Then I go to checkout
