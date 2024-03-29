@sprint-2
Feature: list or map
  In order to save time when I pick up my morning coffee
  As a coffee lover
  I want to be able to order my coffee in advance

  Background:
    Given Cathy has a Caffeinate-Me account

  @smokingtest
  Scenario: Buyer orders a coffee when they are far to the coffee shop
    And John is 300 meters from the coffee shop
    # asLists
    When John orders for following items
      | espresso   | 2 |
      | cappuccino | 1 |
    # asMaps
    And Brew orders for following items
      | product    | quantity |
      | espresso   | 2        |
      | cappuccino | 1        |
    # asMap
    And Mellow orders for following items
      | product  | espresso |
      | quantity | 2        |
    # asList
    Then the order should contain the following products:
      | espresso   |
      | cappuccino |
    And  Mike orders for following items
      | product    | quantity |
      | espresso   | 2        |
      | cappuccino | 1        |
    And Mellow orders for following items
      | product  | 1 |
      | quantity | 2        |
    And He should know that the coffee is: "Normal"



