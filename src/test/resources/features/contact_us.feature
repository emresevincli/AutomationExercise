@regression
Feature: Contact Us Form Test

  Background:
    Given The user should able to open launch browser
    When The user navigate to url
    Then The user verifies that the home page is visible


  Scenario Outline: Contact Us Form Test
    When The user click on Contact Us button
    Then The user verifies that GET IN TOUCH message
    When The user should be able to enter "<name>" "<email>" "<subject>" and "<message>" upload file and click Submit button
    And The user click on OK button
    Then The user verifies that success message
    When The user click on Home button
    Then The user verifies that landed to home page successfully
    Examples:
      | name | email              | subject      | message                        |
      | Emre | emre1234@gmail.com | About BlaBla | BlaBlaBlaBlaBlaBlaBlaBlaBlaBla |

