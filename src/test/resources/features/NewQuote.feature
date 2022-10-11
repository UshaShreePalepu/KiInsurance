Feature: Create New Quotes

  Scenario Outline: Create a new Quote
    Given mock platform page is opened
    When the user selects <option> option
    Examples:
      | option               |
      | "Create a new quote" |
    And clicks on "Next" button
    And the user selects primary country "France" option
    And the user selects primary insured "AAA Inc" option
    And the user selects class of business "Energy" option
    And clicks on "Next" button
    And the user enters Inception date "11/09/2019"
    And the user enters AUM Value "100000.00"
    And the user enters Premium "100000.00"
    And clicks on "Next" button
    And the quote should be created successfully

