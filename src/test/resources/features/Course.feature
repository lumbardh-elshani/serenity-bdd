Feature: Course

  Scenario: Get courses by student id
    Given I want to courses by student id
    Then I get a list of courses

  Scenario: Get courses by teacher id
    Given I want to courses by teacher id
    Then I get a list of courses taught by that teacher

  Scenario: Get courses by teacher id
    Given I want to create a new forum post by the necessary info
    Then I get the created forum post

  Scenario: Get forum posts by course id
    Given I want to get forum posts by course id
    Then I get a list of forum posts