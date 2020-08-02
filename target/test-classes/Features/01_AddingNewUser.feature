@Smoke
Feature: Adding New User

  @AddUser
  Scenario: Adding New User
    Given I Login to Application
    Then I Goto Admin Page 
    And I Add New User
    Then I Logout form Application
    
    