@wip
Feature: Register User

  Background:
    Given The user should able to open launch browser
    When The user navigate to url
    Then The user verifies that the home page is visible

  Scenario: Positive Sign Up
    When The user click on Signup Login button
    Then The user verifies New User Signup! is visible

