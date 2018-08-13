Feature: User can access their order history
  To check the status of existing orders
  as an online customer
  user should be able to access their order history

Background: User has an order history in his account
  Given that Byron is a registered member
  And he has completed an order for the following items:
    | Product                      | Color | Size | Quantity |
    | Blouse                       | Black | M    | 1        |
    | Faded Short Sleeve T-shirts  | Orange| M    | 2        |

  Scenario: User access their order history

    Given that Byron has signed in with his account
    When he views his previous orders
    Then he should see the following orders:
    | Product                      | Status    |
    | Blouse                       | On backorder |
    | Faded Short Sleeve T-shirts  | On backorder |
