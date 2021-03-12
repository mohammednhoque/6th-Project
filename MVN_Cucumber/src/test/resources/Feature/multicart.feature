Feature: Multicart feature 

  Scenario Outline: user can login with valid credential
    Given webpage should be open with select browser
    And hit in the login button
    When put the  <username> and <password>
    And hit on login button
    Then user will be in the home page
    And close the browser

    Examples: 
      |username|password|
      |user|pass|
