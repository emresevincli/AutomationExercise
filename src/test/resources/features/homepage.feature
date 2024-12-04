@regression
  Feature: Tests on homepage

    Background:
      Given The user should able to open launch browser
      When The user navigate to url
      Then The user verifies that the home page is visible

    @wip
    Scenario: Subscription testing by email
      When The user scrolls down to footer
      Then The user verifies text SUBSCRIPTION
      When The user enters "email" address in input and click arrow button
      Then Verify success message "You have been successfully subscribed!" is visible