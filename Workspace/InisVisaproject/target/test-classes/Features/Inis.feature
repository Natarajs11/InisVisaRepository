Feature: To check the functionality of inis web page

  Scenario: validate google search page for inis website
    Given browser is open
    And user is on the google search page
    When user enters a text in the search box
    And hits enter
    Then user is navigated to search results
