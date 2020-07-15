@api-debug-runner
Feature: School

  Scenario: Create a school
    Given System administrator wants to create a school with name "Elena Gjika", address "Rruga Tahir Meha", city "Prishtine", school type "PUBLIC", and created date "2020-07-15"
    Then This school should be create in system


  Scenario: Delete a school
    Given System administrator wants to delete a school with id "8188ac28-5920-442d-bd61-e3a7069f5a79"
    Then This school should be deleted

  Scenario: Update a school
    Given System administrator want to update school with id "0c126375-0a1c-4c7f-ba1d-1f72b541438f"
    Then This school should be updated