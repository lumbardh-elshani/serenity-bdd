@debug
Feature: Navigation

  Scenario: User navigates to personal profile
    Given User is logged in
    When User clicks to profile anchor
    Then User should see profile page


  Scenario: User navigates to notification page
    Given User is logged in
    When User clicks to notification anchor
    Then User should see the list of notifications

  Scenario: User navigates to calendar
    Given User is logged in
    When User clicks to calendar anchor
    Then User should see the calendar