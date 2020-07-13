@driver:chrome
@ui-debug-runner
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

  Scenario: User navigates to Login Page from Home Page
    Given User is on Home Page
    When User clicks Login Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/login"

  Scenario: User navigates to Register Page from Home Page
    Given  User is on Home Page
    When User clicks Register Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/register"