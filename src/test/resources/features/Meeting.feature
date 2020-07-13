@driver:chrome
@ui-debug-runner
Feature: Meeting

  Scenario: User creates a new online meeting
    Given User wants to create a new online meeting
    When User clicks to create a new meeting
    Then User should be able to fill the meeting form
    And User should save the meeting information


  Scenario: User edits a created meeting
    Given User wants to edit a meeting
    When User selects the meeting and clicks on Edit Button
    Then User should be able to edit that meeting
    And User should save edited information

  Scenario: User deletes a created meeting
    Given User wants to delete a meeting
    When User selects the meeting and clicks on Delete Button
    Then that meeting should be deleted


