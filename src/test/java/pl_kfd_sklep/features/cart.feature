Feature: Cart

  Background:
  Given User at Landing Page

  Scenario: Adding a product to the Cart
    When User adds a product to the Cart
    Then Modal informing about successfully adding the product to the Cart should be displayed

  Scenario: Deleting a product from the Cart
    When User adds a product to the Cart
    And Deletes it from the Cart
    Then Message informing about empty cart should be displayed

  Scenario: Changing the quantity of product in the Cart (quantity >= 2)
    When User adds a product to the Cart
    And Changes the quantity of product
    Then Proper quantity of product is added
    And The total price is properly recalculated

  Scenario: Changing the quantity of product in the Cart (quantity = 0)
    When User adds a product to the Cart
    And Changes the quantity of product to 0
    Then The quantity is automatically change to 1
    And Message informing that the minimal quantity = 1 is displayed
