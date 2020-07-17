Feature: Comment

  @Regression
  Scenario: Post a comment on a forum post
    Given User wants to write a comment with content "Test test" and note "TESTING" on forum post with id "292866b9-e99f-4d1a-9d83-0e56ec0297b3"
    Then This comment should be posted

  @Regression
  Scenario: Edit a comment on a forum post
    Given User wants to edit a comment with id "ec16717a-a11f-477c-85b6-d4b1f1b8e78c" on forum post with id "292866b9-e99f-4d1a-9d83-0e56ec0297b3"
    Then This comment should be edited

  @Regression
  Scenario: Get a comment on a forum post by id
    Given User wants to get a comment with id "ec16717a-a11f-477c-85b6-d4b1f1b8e78c" on forum post with id "292866b9-e99f-4d1a-9d83-0e56ec0297b3"
    Then User should get that comment

  @Regression
  Scenario: Delete a comment on a forum post
    Given User wants to delete a comment with id "e96c212b-10c9-4511-9b87-315fe99e0ac9" on forum post with id "292866b9-e99f-4d1a-9d83-0e56ec0297b3"
    Then This comment should be deleted
