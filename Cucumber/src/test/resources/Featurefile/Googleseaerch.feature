Feature: feature to search something on google

  Scenario: To Search and get result on google
    Given broswer is open 
    And user is on google search page 
    When user to enter text in searchbox
    And user to click on search icon
    Then user to navigate to the search result
    
   

