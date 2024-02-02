@regression
Feature: Register User

  Background:
    Given The user should able to open launch browser
    When The user navigate to url
    Then The user verifies that the home page is visible

  Scenario Outline: User is Register
    When The user click on Signup Login button
    Then The user verifies New User Signup! is visible
    When The user should be able to enter "<name>" and "<emailAddress>" and click Signup button
    Then The user verifies that Enter Account Information is visible
    When The user is should be able to enter title "<password>" dateOfBirth
    And The user should be able to select checkboxes
    And The user should be able to enter "<firstName>" "<lastName>" "<company>" "<address1>" "<address2>""<state>" "<city>" "<zipCode>" "<phoneNumber>" and click Create Account button
    Then The user verifies that ACCOUNT CREATED! is visible

    Examples:
      |  name| password |  | firstName | lastName | company | address1   | address2 | emailAddress | state    | city  | zipCode | phoneNumber |  |
      | emreee | emre1234 |  | emre      | sevvvvv  | okeanx  | 5246 sokak | no55     | emreeeee@gmail.com | Alsancak | izmir | 35264   | 5556664785  |  |


  Scenario: Negative Register
    When The user click on Signup Login button
    Then The user verifies New User Signup! is visible
    When The user should enter name and currently registered email address and click Signup button
    Then The user verifies already Registered Message
