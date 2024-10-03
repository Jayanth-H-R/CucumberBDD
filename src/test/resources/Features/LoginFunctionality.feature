Feature: Test the login functionality of OrangeHRM

  Scenario: Test the valid login
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user should land on home page

  Scenario Outline: Test the valid login
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user should land on home page

    Examples: 
      | username | password |
      | admin    | admin123 |
