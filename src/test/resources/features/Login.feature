Feature: Login Functionality
  Scenario: Valid Login
    Given user is on Login Page
    When user enters "testuser" and "pssword123
    Then user should see Home Page