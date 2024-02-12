Feature: Login function

  Scenario Outline: Check login with valid credentials
    Given open the browser
    And user navigate to website
    When user to enter again <username> and <password>
    And user to click on login button
    Then user to login succesfully

    Examples: 
      | username | password |
      | Admin    | admin123 |
