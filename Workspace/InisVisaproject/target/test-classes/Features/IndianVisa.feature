Feature: To check Functonality of Indian visa status for Ireland

  Scenario: User is on the inis website
    Given user has visited inis website
    When user select nationality from drop down list
    And hits select button
    Then user is navigated to visa-required page
    And when user select more than 3 months.
    Then user is navigated to study page.
    And when user clicks on the study link
    Then user is navigated to visa long study page
