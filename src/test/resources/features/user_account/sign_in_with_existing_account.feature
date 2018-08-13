Feature: Sign in with an existing account
  As an online customer
  user should be able to sign in with their account
  to purchase new items
  and access their order history



  Scenario: Sign in with valid user account
    Given that Carla is a registered member
    When she logs in with valid credentials
      | username                              | password |
      | carla_the_online_customer@getnada.com | password |
    Then she should be able to view her account profile
