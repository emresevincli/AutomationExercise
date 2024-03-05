@regression
Feature: Products Page Test

  Background:
    Given The user should able to open launch browser
    When The user navigate to url
    Then The user verifies that the home page is visible
  @wip
  Scenario: Verify All Products and product detail page
    When The user click on Products button
    Then The user verifies user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    When The user click on View Product of first product
    And The user is landed to product detail page
    Then The user verifies that detail detail is visible: product name, category, price, availability, condition, brand


