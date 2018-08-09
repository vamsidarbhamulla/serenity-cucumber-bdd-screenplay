Feature: Sign in with an existing account
  As an online customer
  user should be able to sign in with their account
  to purchase new items
  and access their order history


  Background: User visits our "E-Commerce" website
    Given "Carla" access website URL "automationpractice.com/index.php"
    Then "she" visits website homepage


  Scenario: Sign_in with valid user account
    Given "Carla" access the sign in page
    When "she" provide her login details
    Then "she" should be able to see her account profile