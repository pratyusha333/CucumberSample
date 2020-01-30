Feature: Pixel store pos

  Background: 
    Given sales executive logged into the machine

@RegressionTest
Scenario: Executive signup
Given executive is at the signup registration
When executive provides "admin" and "admin"
Then signup succeessful

@Smoke @RegressionTest
Scenario: shopping cart
Given executive added the items to cart
When items price is calculated
Then bill is generated with final amount

  Scenario: Registration with store
    Given Alex is an existing customer
    And Alex had good purchase record
    When Alex provide with mobile no
    Then Registration is success

  Scenario: Refund of a microwave
    Given Alex purchased microwave for 100 dollers
    And Alex has a receipt
    When Alex returns the faulty microwave
    Then Alex got refund of 100 dollers
    
@FunctionalTest
  Scenario Outline: Sales executive signin
    When Sales executive provides "<user>" and "<password>"
    Then Login is successful
    Examples: 
      | user    | password    |
      | Lalitha | password1234 |
      | pratyu  |      123456 |
      
      @datadriven
      Scenario: Searching for a product
      When Larry searches for a product in search field
      Then Larry verifies the product availability
      |Head|
      |Hand|
      |Lap|
