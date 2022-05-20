package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PurchasePage extends Utility {

    private static final Logger log = LogManager.getLogger(PurchasePage.class.getName());

    public PurchasePage(){ PageFactory.initElements(driver,this);}

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement priceFilter;

    @CacheLookup
    @FindBy(xpath = "//option[@value='hilo']")
    WebElement highToLow;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement infantOnesie;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement backpack;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;


    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(id = "finish")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankyouMessage;















    public void enterUsernameAndPassword(String standard_user, String secret_sauce){
        log.info("Enter username : " + username.getText());
        log.info("Enter password: " + password.getText());
        sendTextToElement(username, standard_user);
        sendTextToElement(password, secret_sauce);
    }
    public void clickOnLoginButton(){
        log.info("Click On: " + loginButton.getText());
        clickOnElement(loginButton);
    }

    public void clickOnPriceFilterButton() {
        log.info("Click On: " + priceFilter.getText());
        clickOnElement(priceFilter);
    }

    public void clickOnPriceHighToLow(){
        log.info("Click On: " + highToLow.getText());
        clickOnElement(highToLow);

    }
    public void clickOnCheapestProductAddToCartTab(){
        log.info("Click On: " + infantOnesie.getText());
        clickOnElement(infantOnesie);
    }

    public void clickOnCostlyProductAddToCartTab(){
        log.info("Click On: " + backpack.getText());
        clickOnElement(backpack);
    }

    public void clickOnShoppingCart(){
        log.info("Click On: " + shoppingCart.getText());
        clickOnElement(shoppingCart);
    }
    public void clickOnCheckoutTab(){
        log.info("Click On: " + checkout.getText());
        clickOnElement(checkout);
    }

    public void enterFirstName(String Dennes){
        log.info("Enter: " + firstName.getText());
        sendTextToElement(firstName, Dennes);
    }

    public void enterLastName(String Lilly){
        log.info("Enter: " + lastName.getText());
        sendTextToElement(lastName,Lilly);
    }

    public void enterPostalCode(String CA9025){
        log.info("Enter: " + postalCode.getText());
        sendTextToElement(postalCode, CA9025);
    }

    public void clickOnContinue(){
        log.info("Click On: " + continueTab.getText());
        clickOnElement(continueTab);
    }

    public void clickOnFinish(){
        log.info("Click On: " + finishButton.getText());
        clickOnElement(finishButton);
    }

    public void verifyThankYouForYourOrder(){
        String expectedMessage = "Thank you for your order";
        String actualMessage = new PurchasePage().thankyouMessage.getText();
        Assert.assertEquals("Thank you for your order",expectedMessage,actualMessage);

    }






}
