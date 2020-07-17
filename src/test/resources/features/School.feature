Feature: School

  @api-debug-runner
  @Smoke @Regression
  Scenario: Create a school
    Given System administrator wants to create a school with name "Elena Gjika", address "Rruga Tahir Meha", city "Prishtine", school type "PUBLIC", and created date "2020-07-15"
    Then This school should be create in system

  @Regression
  Scenario: Update a school
    Given System administrator want to update school with id "63f8e59c-7101-47eb-b1e9-0452ffacf71f"
    Then This school with id "63f8e59c-7101-47eb-b1e9-0452ffacf71f" should be updated

  @Regression
  Scenario: Delete a school
    Given System administrator wants to delete a school with id "866949bf-3c42-4fd9-917d-bd38f9205c9c"
    Then This school should be deleted