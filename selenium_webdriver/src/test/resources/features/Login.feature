Feature: Login

  Scenario Outline: Login
    Given User opened Login page
    When  User logs in with '<user_type>' credentials
    Then  User can see Main page url

    Examples:
      | user_type               |
      | STANDARD_USER           |