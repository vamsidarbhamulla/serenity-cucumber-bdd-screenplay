@cucumber
@smoke
Feature: Sign in with an existing account
  As an online website user
  I should be able to sign in with account credentials
  to purchase new items
  and access their order history



  Scenario: Sign in with valid user account
    Given that Carla is a registered member
    When she logs in with valid credentials
      | username                              | password |
      | carla_the_online_customer@getnada.com | password |
    Then she should be able to view her account profile


  Scenario: Sign in with valid admin account
    Given that Adam is a registered admin
    When he logs in with valid credentials
      | username                          | password |
      | adam_the_web_admin@mailinator.com | password |
    Then he should be able to view his account profile
