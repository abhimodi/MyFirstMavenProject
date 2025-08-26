Feature: Login functionality

  Scenario: Valid login
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User should see the logout link
