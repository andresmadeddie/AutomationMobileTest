package com.solvd.carina.demo.mobile.saucedemomobile.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductsScreenBase extends AbstractSauceDemoScreenBase {

    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract LeftSideMenuScreenBase clickHamburgerMenuToGetLeftSideMenu();

    public abstract ProductDetailsScreenBase clickProductTitle(String productTitle);

    public abstract CartScreenBase clickCartButton();
}