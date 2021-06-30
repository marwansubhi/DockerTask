Feature: login to host successfully

  Background:
    Given user is on the login page

  @happyPath
  Scenario: when suer provide a valid credentials


    When user enters valid "username" and "password"

    Then user should login successfully

  @negative
  Scenario: when suer provide a invalid credentials

    When user provide invalid "username" and "password"

    Then user should see error message




