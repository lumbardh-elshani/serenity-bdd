Feature: User

  @Regression
  Scenario: Get user by id
    Given I want to get user with id
    Then you get the user

  @Regression
  Scenario: Create user
    Given I want to register with the necessary input
    Then I should be able to register
