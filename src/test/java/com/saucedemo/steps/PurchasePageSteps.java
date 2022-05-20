package com.saucedemo.steps;

import com.saucedemo.pages.PurchasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchasePageSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {

    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new PurchasePage().enterUsernameAndPassword(username, password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new PurchasePage().clickOnLoginButton();
    }


    @And("^I click on price filter button$")
    public void iClickOnPriceFilterButton() {
        new PurchasePage().clickOnPriceFilterButton();
    }


    @And("^I select Price high to low$")
    public void iSelectPriceHighToLow() {
        new PurchasePage().clickOnPriceHighToLow();
    }

    @And("^I select cheapest products and add to basket$")
    public void iSelectCheapestProductsAndAddToBasket() {
        new PurchasePage().clickOnCheapestProductAddToCartTab();

    }

    @And("^I select costliest products and add to basket$")
    public void iSelectCostliestProductsAndAddToBasket() {
        new PurchasePage().clickOnCostlyProductAddToCartTab();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new PurchasePage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new PurchasePage().clickOnCheckoutTab();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String Dennis) {
        new PurchasePage().enterFirstName(Dennis);

    }

    @And("^I enter lastName \"([^\"]*)\"$")
    public void iEnterLastName(String Lilly) {
        new PurchasePage().enterLastName(Lilly);
    }

    @And("^I enter zipPostalCode \"([^\"]*)\"$")
    public void iEnterZipPostalCode(String CA9025) {
        new PurchasePage().enterPostalCode(CA9025);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new PurchasePage().clickOnContinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new PurchasePage().clickOnFinish();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        new PurchasePage().verifyThankYouForYourOrder();
    }
}