@driver:chrome
@ui-debug-runner
Feature: Grade Book

  Scenario: Check grades
    Given Student wants to see the grades obtained
    When Student goes to grade book page
    Then Student should be able to check personal grades