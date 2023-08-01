Feature: Login feature
  Verify the login functionality

  Scenario Outline: Login functionality
    Given Enter the username <username>
    Given Enter the password <password>
    When I click on Login button
    Then Homepage should be displayed

    Examples: 
     |username|password| 
     |Admin|admin123| 
