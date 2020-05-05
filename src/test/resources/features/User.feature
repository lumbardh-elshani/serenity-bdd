Feature: User

  @debugApi
  Scenario: Create user
    Given I create user with name "filan" and last name "fisteku"
    Then user should be created
