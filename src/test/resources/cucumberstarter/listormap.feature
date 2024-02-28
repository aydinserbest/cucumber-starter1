Feature: Order a coffee more
  In order to save time when I pick up my morning coffee
  As a coffee lover
  I want to be able to rder my coffee in advance

  Background:
    Given Cathy has a Caffeinate-Me account

  Scenario: Buyer orders a coffee when they are far to the coffee shop
    And John is 300 meters from the coffee shop
    When John orders for following items
      | espresso| 2       |
      | cappuccino | 1    |
    And When Brew orders for following items
      | product | quantity|
      | espresso| 2       |
      | cappuccino | 1    |
    And When Mellow orders for following items
      | product | espresso|
      | quantity| 2       |
    Then the order should contain the following products:
      |espresso|
      |cappuccino|
    And He should know that the coffee is: "Normal"



