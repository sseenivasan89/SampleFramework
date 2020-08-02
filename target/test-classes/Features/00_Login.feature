@Smoke
Feature: Login Feature

  @Login
  Scenario Outline: Login Feature
    Given I Login to Application as "<userId>"
    And I Logout form Application
    
    Examples:
    | userId | 	
    |  Admin  |  
    |  Admin1  | 
    
  