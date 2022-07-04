Feature:  Searching in google


  @google
  Scenario: Sending keys
    # Given Admin goes to google page
    When Admin sends keys to search bar
    Then Keys should be sent