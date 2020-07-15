@api-debug-runner
Feature: Comment
  Scenario: Post a comment
    Given User wants to write a comment with content "Test test" and note "TESTING"
    Then This comment should be posted