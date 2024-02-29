@sprint-1
  @issue:CRED-7
Feature: Order a coffee more
  In order to save time when I pick up my morning coffee
  As a coffee lover
  I want to be able to rder my coffee in advance

  Background:
    Given Cathy has a Caffeinate-Me account

  Scenario: Buyers order a coffee when they are close to the coffee shop
    And "Cathy" is 100 meters from the coffee shop
    When "Cathy" orders a "large cappuccino"
    Then Barry should receive the order
    And He should know that the coffee is Urgent
@smoketest
  Scenario: Buyer orders a coffee when they are far to the coffee shop
    And "John" is 300 meters from the coffee shop
    When "Cathy" orders for following items
    | product | quantity|
    | espresso| 2       |
    | cappuccino | 1    |
    Then the order should contain following products:
    |espresso|
    |cappuccino|
    And He should know that the coffee is "Normal"


