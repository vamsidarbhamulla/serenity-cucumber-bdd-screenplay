Feature: Checkout shopping cart
  To buy selected products
  as an online customer
  user should be able to checkout their shopping cart


  Background: User added a list of items to shopping cart that they want to buy
    Given that Byron is a registered member

  Scenario: Reviewing an order for items in the shopping cart
    Given that Byron has placed the following items in his shopping cart:
      | Product   | Color | Size | Quantity |
      | Blouse    | Black | M    | 1        |
    When he proceeds to the checkout
    Then he should see a summary of the items he wants to order:
      | Product | Description | Unit Price | Qty | Total |
      | Blouse  | Blouse      | 27.00      | 1   | 27.00 |
    And he should see the total cost including shipping:
      | Total Products | Total Shipping | Total |
      | 27.00          | 2.00           | 29.00 |

# TODO: Other similar scenarios which continue the order process through to shipping
