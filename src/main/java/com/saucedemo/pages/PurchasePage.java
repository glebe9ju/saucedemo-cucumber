package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

public class PurchasePage extends Utility {
    private static final Logger log = LogManager.getLogger(PurchasePage.class.getName());

    public PurchasePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement addUserName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement addPassWord;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement logInButton;
    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement priceTab;
    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> listOfItems;
    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement addFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement addLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement addZipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishTab;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
    WebElement thankYou;



    public void enterUserName(String name){
        sendTextToElement(addUserName,name);
        log.info("Enter user name " + name + "user name field " + addUserName.toString());
    }
    public void enterPassWord(String pass){
        sendTextToElement(addPassWord,pass);
        log.info("Enter password " + pass + "password field " + addPassWord.toString());
    }
    public void clickOnLogInButton(){
        clickOnElement(logInButton);
        log.info("Click on login button " + logInButton.toString());
    }
    public void clickOnPriceTab(){
        clickOnElement(priceTab);
        log.info("Click on Price tab " + priceTab.toString());
    }
    public void selectFilterBy(String sortBy){
        selectByVisibleTextFromDropDown(filter,sortBy);
        log.info("Select filterby " + sortBy + "Filter Field " + filter.toString());
    }
    public void selectListOfItem(){
        clickOnElement(listOfItems.get(0));
        log.info("Slect costliest items " + listOfItems.get(0).toString());
        clickOnElement(listOfItems.get(listOfItems.size()-1));
        log.info("Select cheapest items " + listOfItems.get(listOfItems.size()-1) );
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        log.info("Click on shopping cart " + shoppingCart.toString());
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
        log.info("Click on checkout " + checkOut);
    }
    public void enterFirstName(String name){
        sendTextToElement(addFirstName,name);
        log.info("Enter FirstName " + name + addFirstName.toString());
    }
    public void enterLastName(String last){
        sendTextToElement(addLastName,last);
        log.info("Enter Password " + last + "Password field " + addLastName.toString());
    }
    public void enterZipCode(String zipCode){
        sendTextToElement(addZipCode,zipCode);
        log.info("Enter zipcode " + zipCode + "Zipcode field " + addZipCode.toString());
    }
    public void clickOnContinue(){
        clickOnElement(continueTab);
        log.info("Click on continue tab " + continueTab.toString());
    }
    public void clickOnFinish(){
        clickOnElement(finishTab);
        log.info("Click on Finish tab " + finishTab.toString());
    }
    public String verifyThankYou(){
        String message = getTextFromElement(thankYou);
        log.info("Getting text from element " + thankYou.toString());
        return message;
    }
}
