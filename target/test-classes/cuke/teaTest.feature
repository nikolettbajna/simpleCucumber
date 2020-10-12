Feature: teaTask

  Scenario: buy tea
    Given I can open the website
    And the title is equals to "Welcome"
    When I check the menu
    And a choose which tea to buy
    Then I go to checkout
