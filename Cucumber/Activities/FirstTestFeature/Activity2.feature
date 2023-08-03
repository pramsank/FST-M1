@Activity2Test
Feature: Basic Syntax

  @Activity2
  Scenario: This is a login scenario
    Given User is on Login page
    When User enters username and password
    Then Read the page title and confirmation message
    And close the browser

