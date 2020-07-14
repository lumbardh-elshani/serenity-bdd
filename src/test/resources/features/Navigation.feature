@driver:chrome
@ui-debug-runner
Feature: Navigation

  Scenario: Navigate to personal profile
    Given User is logged in
    When User clicks to profile anchor
    Then User should see profile page


  Scenario: Navigate to notification page
    Given User is logged in
    When User clicks to notification anchor
    Then User should see the list of notifications

  Scenario: Navigate to calendar
    Given User is logged in
    When User clicks to calendar anchor
    Then User should see the calendar

  Scenario: Navigate to Login Page from Home Page
    Given User is on Home Page
    When User clicks Login Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/login"

  Scenario: Navigate to Register Page from Home Page
    Given  User is on Home Page
    When User clicks Register Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/register"