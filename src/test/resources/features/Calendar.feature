Feature: Calendar

  Scenario: Create new event
    Given User wants to add new event to his calendar
    Then Event should be saved to the database and returned

  Scenario: Get school events
    Given User wants to get the school's events
    Then Events are returned

  Scenario: Delete event
    Given User wants to delete an event
    Then Event should be deleted