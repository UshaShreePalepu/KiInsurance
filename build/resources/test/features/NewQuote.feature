Feature: Create New Quotes

  Scenario Outline: Create a new Quote
    Given mock platform page is opened
    When the user selects selects <option> option
    Examples:
      | option               |
      | "Create a new quote" |
#    And clicks on "Next" button
#    Then next page should be opened

