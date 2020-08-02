@Smoke
Feature: Assign Leave

  @AssignLeave
  Scenario: Assign Leave
    Given I Login to Application
    Then I Goto Assign Leave Page
    And I Assign Leaves
    Then I Logout form Application