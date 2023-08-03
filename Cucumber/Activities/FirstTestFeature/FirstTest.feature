@SmokeTest
Feature: Basic Syntax

  @Scenario1
  Scenario: This is the first scenario
    Given I launch TS page
    When the user clicks on About Us link
    Then the user is redirected to About Us page
    And close the browser






