Feature: Client sign up

  Scenario: Client sign up Successfully
    Given Pepito wants to have an account
    When he sends required information to get the account
    Then he should be told that the account was created

  Scenario: Client sign up failed
    Given Pepito wants to have an account
    When he sends required information to get the account
    Then he should be told that the account was not created