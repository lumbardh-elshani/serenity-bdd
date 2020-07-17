@driver:chrome
@ui-debug-runner
Feature: Create Schedule

  @Regression
  Scenario: Create Date Based Schedule
    Given Student wants to create a date based schedule
    When Student opens page to create a date based schedule
    And Fills the form to create the date based schedule
    And Cliks button to save the schedule
    Then The schedule should be saved

  @Regression
  Scenario: Reset Date Based Schedule
    Given Student wants to reset the date based schedule to default values
    When Student opens date based schedule page
    And Cliks reset button to change the values to default
    Then The schedule should be reset

  @Regression
  Scenario: Create Periodic Schedule
    Given Student wants to create a periodic schedule
    When Student opens page to create a periodic schedule
    And  Fills the form to create a periodic schedule
    And Cliks button to save the periodic schedule
    Then The periodic schedule should be saved

  @Regression
  Scenario: Reset Periodic Schedule
    Given Student wants to reset the periodic schedule to default values
    When Student opens periodic schedule page
    And Clicks reset button for periodic schedule
    Then The periodic schedule should be reset
