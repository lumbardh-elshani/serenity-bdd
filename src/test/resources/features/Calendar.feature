Feature: Calendar

  @Regression
  Scenario: Create new event
    Given User wants to add new event to his calendar
    Then Event should be saved to the database and returned

  @Regression
  Scenario: Get school events
    Given User wants to get the school's events
    Then Events are returned

  @Regression
  Scenario: Delete event
    Given User wants to delete an event
    Then Event should be deleted