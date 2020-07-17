@driver:chrome
@ui-debug-runner
Feature: Logout

  @Smoke @Regression
  Scenario: Logout from the system
    Given User logged in the system
    When User clicks logout button
    Then User should be logged out
    And see  homepage

