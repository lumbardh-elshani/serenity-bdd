@driver:chrome
@ui-debug-runner
Feature: Presence

  @Regression
  Scenario: Set presence to students
    Given Professor wants to set the presence to students
    When Professor opens the presence page
    And Sets the presence to present students
    Then This presence should be saved in the database