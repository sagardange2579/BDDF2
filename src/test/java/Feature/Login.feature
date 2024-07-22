Feature: Test Orange HRM Application

  Scenario: Validate Login Page functionality
    When User is on login Page
    Then Enter UserName and Password
      | Admin | admin123 |
    And click on login button
