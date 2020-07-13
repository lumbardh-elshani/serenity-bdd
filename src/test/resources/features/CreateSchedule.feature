@driver:chrome
@ui-debug-runner
Feature: Create Schedule

  Scenario: Create Date Based Schedule
    Given User wants to create a date based schedule
    When User opens page to create a date based schedule
    And Fills the form to create the date based schedule
    And Cliks button to save the schedule
    Then The schedule should be saved

  Scenario: Reset Date Based Schedule
    Given User wants to reset the date based schedule to default values
    When User opens date based schedule page
    And Cliks reset button to change the values to default
    Then The schedule should be reset

  Scenario: Create Periodic Schedule
    Given User wants to create a periodic schedule
    When User opens page to create a periodic schedule
    And  Fills the form to create a periodic schedule
    And Cliks button to save the periodic schedule
    Then The periodic schedule should be saved

  Scenario: Reset Periodic Schedule
    Given User wants to reset the periodic schedule to default values
    When User opens periodic schedule page
    And Clicks reset button for periodic schedule
    Then The periodic schedule should be reset
