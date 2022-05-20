package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.PurchasePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchaseSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String name, String pass)  {
        new PurchasePage().enterUserName(name);
        new PurchasePage().enterPassWord(pass);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new PurchasePage().clickOnLogInButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String byPrice)  {
        new PurchasePage().clickOnPriceTab();
        new PurchasePage().selectFilterBy(byPrice);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
    new PurchasePage().selectListOfItem();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new PurchasePage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new PurchasePage().clickOnCheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String arg0, String arg1, String arg2)  {
        new PurchasePage().enterFirstName("Mathew");
        new PurchasePage().enterLastName("Peter");
        new PurchasePage().enterZipCode("WA2 PL8");
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
        Assert.assertEquals("not found","THANK YOU FOR YOUR ORDER",new PurchasePage().verifyThankYou());
    }
}
