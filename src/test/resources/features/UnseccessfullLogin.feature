@smoke
Feature: Login

  Scenario: Unsuccessful Login
    Given User opened Login page
    When  User logs in with 'LOCKED_OUT_USER' credentials
    Then  User can see login error message