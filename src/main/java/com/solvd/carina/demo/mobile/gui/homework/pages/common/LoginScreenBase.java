package com.solvd.carina.demo.mobile.gui.homework.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginScreenBase extends AbstractSauceDemoScreenBase{

    protected LoginScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUsername(String username);

    public abstract void typePassword(String password);

    public abstract ProductScreenBase clickLoginButton();
}
