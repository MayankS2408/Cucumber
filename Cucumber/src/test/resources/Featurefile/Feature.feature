Feature: feature to login

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enter username and password
    And user click on login button
    Then user succesfully login
    

    
