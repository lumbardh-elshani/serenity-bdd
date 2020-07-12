@driver:chrome
@debug
Feature: Login

  Scenario: Login with valid credentials
    Given User ready to login with valid credentials
    When User goes to "http://localhost:4200/auth/login"
    And User writes "lumbardhelshani00@gmail.com" for email address field and "1111" for password
    And User clicks login button
    Then User should be logged in and see dashboard

  Scenario: Login with invalid credentials
    Given User with invalid credentials and opened browser on "http://localhost:4200/auth/login"
    When User type "asdasd" for email address and "asdasd" for password
    Then User shouldn't be able to log in
    And User should see an alert
