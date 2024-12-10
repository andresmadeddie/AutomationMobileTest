package com.solvd.carina.demo.mobile.saucedemomobile.common;

import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractSauceDemoScreenBase {

    protected CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductDisplayed(String productName);

    public abstract CheckOutYourInformationScreenBase clickCheckOutButton();

    public abstract ProductsScreenBase clickContinueShopping();
}