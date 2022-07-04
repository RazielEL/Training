Feature: doing stuff on Alternet.org


  
  Scenario: Logo button is visible
    # Given user goes to alternet page
    Then logo is visible



  @an
  Scenario: Dashboard is visible
    # Given user goes to alternet page
  Then Dashboard is displayed
    |HOT TOPICS >>|FAQS|GET OUR DAILY NEWSLETTER!|THE RIGHT WING|RELIGIOUS RIGHT|GO AD FREE!|MAKE A ONE-TIME DONATION|


  @an
  Scenario: FAQS is displayed
  # Given user goes to alternet page
  When user goes to FAQS page
  Then FAQS are displayed
  Then title is displayed
