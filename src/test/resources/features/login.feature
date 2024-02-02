@regression
Feature: Login, Logout, Negative Login And Account Deleted Test

  Background:
    Given The user should able to open launch browser
    When The user navigate to url
    Then The user verifies that the home page is visible


  Scenario: Positive Login Test And Delete Account Test
    When The user click on Signup Login button
    Then The user verifies Login to your account is visible
    When The user should able to enter correct email and password
    Then The user verifies that Logged in as username is visible
    When The user should be able to click Delete Account button
    Then The user verifies that ACCOUNT DELETED! is visible


  Scenario Outline: Negative Login Test
    When The user click on Signup Login button
    Then The user verifies Login to your account is visible
    When The user should able to enter incorrect "<email>" and "<password>"
    Then The user verifies thar error message
    Examples:
      | email               | password  |
      | emre54477@gmail.com | emre12345 |


  Scenario: Positive Login And Logout Test
    When The user click on Signup Login button
    Then The user verifies Login to your account is visible
    When The user should able to enter correct email and password
    Then The user verifies that Logged in as username is visible
    When The user click on Logout button
    Then The user verifies that is on the Login Page