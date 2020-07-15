@api-debug-runner
Feature: Comment

  Scenario: Post a comment
    Given User wants to write a comment with content "Test test" and note "TESTING"
    Then This comment should be posted

  Scenario: Edit a comment
    Given User wants to edit a comment with id "130b3cfc-ca65-4dd0-9bc3-d94948f68b77"
    Then This comment should be edited

  Scenario: Delete a comment
    Given User wants to delete a comment with id "9d489049-a2bc-4927-a172-4627e2d942d4"
    Then This comment should be deleted