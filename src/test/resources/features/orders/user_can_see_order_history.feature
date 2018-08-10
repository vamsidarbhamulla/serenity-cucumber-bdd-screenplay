Feature: User can access their order history
  To check the status of existing orders
  as an online customer
  user should be able to access their order history

Background: Carla is a registered member
  Given Carla is a registered member
  And Carla has completed an order for the following items:
    | Product                      | Color | Size | Quantity |
    | Blouse                       | Black | M    | 1        |
    | Faded Short Sleeve T-shirts  | Orange| M    | 2        |

  Scenario: User access their order history

    Given Carla has signed in with her account
    When she views her previous orders
    Then she should see the following orders:
    | Product                      | Status    |
    | Blouse                       | On backorder |
    | Faded Short Sleeve T-shirts  | On backorder |
