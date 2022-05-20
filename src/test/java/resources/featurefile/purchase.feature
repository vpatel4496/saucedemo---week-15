Feature: Search functionality

  As a user I want to purchase cheapest and costliest product from the saucedemo after
  sorting the products by High and Low filter.

  Scenario: User navigates saucedemo page and complete the item purchase
    Given I am on saucedemo page
    When  I login with credential username "standard_user" and password "secret_sauce"
    And   I click on Login button
    And   I click on price filter button
    And   I select Price high to low
    And   I select cheapest products and add to basket
    And   I select costliest products and add to basket
    And   I open shopping cart
    And   I go to checkout
    And   I enter firstname "Dennis"
    And   I enter lastName "Lilly"
    And   I enter zipPostalCode "CA9025"
    And   I click on continue button
    And   I click on finish button
    Then  I should be able to see message 'Thank you for your order'
