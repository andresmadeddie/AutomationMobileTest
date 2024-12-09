package com.solvd.carina.demo.mobile.saucedemomobile.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductDetailsScreenBase extends AbstractSauceDemoScreenBase {

    public ProductDetailsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartButton();

    public abstract void clickRemoveFromCartButton();

    public abstract boolean isAddToCartButtonPresent();

    public abstract boolean isRemoveFromCartButtonPresent();

    public abstract CartScreenBase clickCartButton();
}