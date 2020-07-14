Feature: Calendar

  Scenario: Create new event
    Given User wants to add new event to his calendar
    Then Event should be saved to the database and returned