$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "\r\nAs a user I want to purchase cheapest and costliest product from the saucedemo after\r\nsorting the products by High and Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3321335200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on price filter button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Price high to low",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select cheapest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter firstname \"Dennis\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter lastName \"Lilly\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter zipPostalCode \"CA9025\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchasePageSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 90346500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchasePageSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 155044300,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 137549200,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iClickOnPriceFilterButton()"
});
formatter.result({
  "duration": 74328300,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iSelectPriceHighToLow()"
});
formatter.result({
  "duration": 150712700,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iSelectCheapestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 96393600,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iSelectCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 61049900,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 74925100,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 54870000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dennis",
      "offset": 19
    }
  ],
  "location": "PurchasePageSteps.iEnterFirstname(String)"
});
formatter.result({
  "duration": 70335600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lilly",
      "offset": 18
    }
  ],
  "location": "PurchasePageSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 76584800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CA9025",
      "offset": 23
    }
  ],
  "location": "PurchasePageSteps.iEnterZipPostalCode(String)"
});
formatter.result({
  "duration": 74032500,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 57650500,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 53697600,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 36079200,
  "status": "passed"
});
formatter.after({
  "duration": 77400,
  "status": "passed"
});
});