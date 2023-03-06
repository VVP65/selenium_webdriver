Feature: Add item to cart

  Scenario: Add item to cart
    Given User Logged in to Main page with 'STANDARD_USER' credentials
    When  User click Add to cart button
    Then  User can see back pack item remove from cart button text