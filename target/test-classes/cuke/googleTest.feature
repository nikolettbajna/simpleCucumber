Feature: googleTest

  Scenario: find kitten images on google
    Given we can open google
    And the title is equal to "google"
    When we search for kitten
    Then google will return us images of kittens
