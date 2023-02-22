Feature: Login to Main Page

  Scenario: Login to Main Page
    Given User opened Login page
    When  User logs in with 'STANDARD_USER' credentials
    Then  User can see Main page url