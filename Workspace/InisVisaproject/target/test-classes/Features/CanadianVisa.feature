Feature: To check Functonality of Canadian visa status for Ireland

  Scenario: User is on the inis webpage
    Given User has visited inis website
    When user selects his nationality from drop down list
    And hits on the select button
    Then Users are navigated to visa requiremnt page
    And when user select more than 3 months option.
    Then users are navigated to study page.
    And when users clicks on the study link
    Then Users are navigated to visa not required page
