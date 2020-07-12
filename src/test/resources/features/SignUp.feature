@driver:chrome
@debug
Feature: SignUp

  Scenario: SignUp with personal information
    Given User with valid personal details
    When User navigates to "http://localhost:4200/auth/register"
    And User fills SingUp Form
    Then User should be redirected to "http://localhost:4200/auth/login"