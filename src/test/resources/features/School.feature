Feature: School

  @api-debug-runner
  @Smoke @Regression
  Scenario: Create a school
    Given System administrator wants to create a school with name "Elena Gjika", address "Rruga Tahir Meha", city "Prishtine", school type "PUBLIC", and created date "2020-07-15"
    Then This school should be create in system

  @Regression
  Scenario: Update a school
    Given System administrator want to update school with id "08a88645-bbd4-461b-bafe-4cfe289072da"
    Then This school should be updated

  @Regression
  Scenario: Delete a school
    Given System administrator wants to delete a school with id "866949bf-3c42-4fd9-917d-bd38f9205c9c"
    Then This school should be deleted