Feature: User can access their order history
  To check the status of existing orders
  as an online customer
  user should be able to access their order history


  Background: User has ordered items previously
    Given "Carla" has completed one order with 2 items earlier
    Then her order history has 2 items listed

  Scenario: User access their order history
    Given "Carla" sign in with her account
    When she access her Account profile
    Then she should be able to access her order history
    And check the status of her previous order