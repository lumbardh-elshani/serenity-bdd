Feature: User

  @debug
  Scenario: Create user
    Given I create user with name "Filan" and last name "Fisteku"
    Then User should be created