Feature: Checkout shopping cart
  To buy selected products
  as an online customer
  user should be able to checkout their shopping cart


  Background: User added a list of items to shopping cart that they want to buy
    Given "Carla" wants to buy 2 items
    When "she" visit "automation practice" website
    Then "she" add 2 items to shopping cart

  Scenario: Order the shopping cart items
    Given "Carla" shopping cart has items to buy
    When "she" sign in with her existing account
    And provides address
    And provides shipping details
    And get payment details
    Then should see a successful order confirmation