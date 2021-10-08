Feature: To check Functonality of French visa status for Ireland

  Scenario: User is on the inis webpage
    Given user is on the website
    When user selects nationality from drop down list
    And user hits select button
    Then user is navigated to visa not required page.
