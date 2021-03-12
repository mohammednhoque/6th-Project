Feature: Title of your feature

@Smoketest
  Scenario: login to the web application
    Given browse web application
    When put username and password
    And click on Login button
    Then enter in the home page
