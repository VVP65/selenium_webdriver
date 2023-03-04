Feature: Add item to cart

  Scenario Outline: Add item to cart
    Given User Logged in to Main page with '<user_type>' credentials
    When  User click Add to cart button
    Then  User can see back pack item remove from cart button text

    Examples:
      | user_type               |
      | STANDARD_USER           |