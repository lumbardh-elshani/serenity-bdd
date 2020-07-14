Feature: User

#  @Smoke
#  Scenario: Create user
#    Given I create user with name "Filan" and last name "Fisteku"
#    Then User should be created

  Scenario: Get user by id
    Given I want to get user with id
    Then you get the user

  Scenario: Create user
    Given I want to register with the necessary input
    Then I should be able to register
