@regression
Feature: Login

  Scenario: Login
    Given User opened Login page
    When  User logs in with 'STANDARD_USER' credentials
    Then  User can see Main page url