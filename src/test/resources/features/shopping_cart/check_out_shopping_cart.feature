@cucumber
@smoke
Feature: Checkout shopping cart
  To buy selected products
  as an online customer
  user should be able to checkout their shopping cart


  Background: User added a list of items to shopping cart that they want to buy
    Given that Byron is a registered member

  Scenario: Reviewing an order for items in the shopping cart
    Given Byron logs in with valid credentials
      | username                   | password |
      | byron_the_buyer@cmail.club | password |
    And he has placed the following items in his shopping cart:
      | Product               | Color | Quantity | Description |
      | brown bear cushion    | Black |    1     | Cushion with removable cover and invisible zip on the back. 32x32cm |
    When he proceeds to the checkout
    Then he should see a summary of the items he wants to order:
      | Product             | Unit Price | Qty | Total | Description                                                         |
      | brown bear cushion  |  18.90     | 1   | 18.90 | Cushion with removable cover and invisible zip on the back. 32x32cm |
    And he should see the total cost including shipping:
      | Total Products | Total Shipping | Total |
      | 18.90          | 7.00           | 25.90 |

# TODO: Other similar scenarios which continue the order process through to shipping
