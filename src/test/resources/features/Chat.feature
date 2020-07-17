@driver:chrome
@ui-debug-runner
Feature: Chat

  @Regression
  Scenario: Send a message
    Given User wants to send a message to a friend
    When User types the message in chat
    And Clicks the send button
    Then The message should be sent to that particular friend