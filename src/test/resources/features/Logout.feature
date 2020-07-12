@driver:chrome
@debug
Feature: Logout

  Scenario: Logout from the system
    Given User logged in the system
    When User clicks logout button
    Then User should be logged out
    And see  homepage