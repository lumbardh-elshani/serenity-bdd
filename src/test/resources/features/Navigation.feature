@driver:chrome
@ui-debug-runner
Feature: Navigation

  @Regression
  Scenario: Navigate to personal profile
    Given User is logged in
    When User clicks to profile anchor
    Then User should see profile page

  @Regression
  Scenario: Navigate to notification page
    Given User is logged in
    When User clicks to notification anchor
    Then User should see the list of notifications

  @Regression
  Scenario: Navigate to calendar
    Given User is logged in
    When User clicks to calendar anchor
    Then User should see the calendar

  @Regression
  Scenario: Navigate to Login Page from Home Page
    Given User is on Home Page
    When User clicks Login Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/login"

  @Regression
  Scenario: Navigate to Register Page from Home Page
    Given  User is on Home Page
    When User clicks Register Button on Homepage
    Then User should be redirected to "http://localhost:4200/auth/register"