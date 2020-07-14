@driver:chrome
@ui-debug-runner
Feature: RecoverPassword

  Scenario: Recover the forgotten password
    Given User that forgot the password
    When User clicks forgot password button on Login Page
    Then User should see the Recover Password page
    When User writes the email
    And Clicks Forgot Password? Button
    Then  User should get an email to recover password