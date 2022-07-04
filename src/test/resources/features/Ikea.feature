Feature: Buying stuff from Ikea

  @ikea
  Scenario: Buying sofa and table
   # Given user goes to ikea page
    When user search for sofa
    And user adds sofa to the cart
    Then user search for the table
    And user adds table to the cart
    And user goes to the cart
    Then user verifies number of items in the cart
    And user applies the discount code
    But gets error message

