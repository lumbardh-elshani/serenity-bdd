@driver:chrome
@ui-debug-runner
Feature: Schedule Settings

  Scenario: User changes the settings of schedule
    Given User wants to change schedule settings
    When User goes to schedule setting page
    And Changes the settings
    And User saves the changed settings
    Then Schedule settings should be changed

  Scenario: User resets the settings of schedule
    Given User wants to reset schedule settings to default
    When User goes to schedule setting page to reset the settings
    And Cliks reset button
    Then Schedule settings should be reset