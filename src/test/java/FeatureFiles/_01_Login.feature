
Feature: Login Functionality


  Scenario: Login with valid username and password

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Login to with invalid username and password

    Given Navigate to basqar
    When Input login username and password
    Then error message should be displayed

