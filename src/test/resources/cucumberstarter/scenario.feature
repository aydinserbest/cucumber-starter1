Feature: Order a coffee
  In order to save time when I pick up my morning coffee
  As a coffee lover
  I want to be able to rder my coffee in advance

  Background:
    Given Cathy has a Caffeinate-Me account

  Rule: Orders placed close to the store should be considered as Urgent
    Scenario Outline: Order priority depends on the distance from the shop
      And "Cathy" is <distance> meters from the coffee shop
      When "Cathy" orders a "large cappuccino"
      Then Barry should receive the order
      And He should know that the coffee is <status>
      Examples:
      |distance|status|
      |100|urgent|
      |300|normal|
      |1000|low|