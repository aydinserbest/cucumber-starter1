Feature: Order a coffee
  In order to save time when I pick up my morning coffee
  As a coffee lover
  I want to be able to rder my coffee in advance


  Scenario: Buyers order a coffee when they are close to the coffee shop
    Given Cathy is 100 meters from the coffee shop
    When Cathy orders a large cappucino
    Then Barry should receive the order
    And Barry should know that the coffee is Urgent
