Feature: List items

  Scenario: Hello world is displayed
    Then I expect to see the text Hello world!

  Scenario: Button changes text
    When I click the button
    Then I expect to see the text button clicked