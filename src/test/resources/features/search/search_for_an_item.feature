@cucumber
@smoke
Feature: Search for an item
  To check an item price and add them to shopping cart
  as an online customer
  user should be able to search for an item

  Scenario: Search products from navigation-menu
    Given that Carla wants to buy Sweater
    When she searches for Sweater using the navigation menu
    Then she should see the list of Sweaters with prices available for sale


  Scenario Outline: Search products with a keyword
    Given that Carla wants to buy an item
    When she searches for keyword <item>
    Then she should see the list of <item> with prices available for sale

    Examples:
      | item     |
      | cushion  |
      | notebook |
      | poster   |
