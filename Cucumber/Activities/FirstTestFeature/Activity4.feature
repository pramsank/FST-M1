@Activity4Test
Feature: Basic Syntax

  @Activity4
  Scenario: This is a login scenario
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And close the browser
