Feature: Search for an item
  To check an item price and add them to shopping cart
  as an online customer
  user should be able to search for an item

  Background: User visits our "E-Commerce" website
    Given that Carla is a registered member

  Scenario: Search products from navigation-menu
    Given that Carla wants to buy T-shirt
    When she searches for T-shirts using the navigation menu
    Then she should see the list of T-shirts with prices available for sale

  Scenario Outline: Search products with a keyword
    Given that Carla wants to buy a dress
    When she searches for keyword <item_keyword>
    Then she should see the list of <item_keyword> with prices available for sale

    Examples:
      | item_keyword    |
      | casual dresses  |
      | evening dresses |
      | summer dresses  |
