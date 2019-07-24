Feature: is Employee exist?
  Everybody wants to know there is at least one Employee

  Scenario: Employees id must be zero
    Given employee is exist
    When is there any employee
    Then I should be told "0"