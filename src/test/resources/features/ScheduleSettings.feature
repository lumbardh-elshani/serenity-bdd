@driver:chrome
@ui-debug-runner
Feature: Schedule Settings

  @Regression
  Scenario: Change the settings of schedule
    Given System administrator wants to change schedule settings
    When System administrator goes to schedule setting page
    And Changes the settings
    And System administrator saves the changed settings
    Then Schedule settings should be changed

  @Regression
  Scenario: Reset the settings of schedule
    Given System administrator wants to reset schedule settings to default
    When System administrator goes to schedule setting page to reset the settings
    And Cliks reset button
    Then Schedule settings should be reset