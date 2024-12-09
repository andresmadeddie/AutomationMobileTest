package com.solvd.carina.demo.mobile.gui.homework.utils;

import com.solvd.carina.demo.mobile.gui.homework.pages.common.*;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public class MobileAuthUtils implements ICustomTypePageFactory {

    public ProductScreenBase login(String username, String password) {
        LoginScreenBase loginScreenBase = initPage(LoginScreenBase.class);
        loginScreenBase.typeUsername(username);
        loginScreenBase.typePassword(password);
        return loginScreenBase.clickLoginButton();
    }

    public ProductScreenBase loginStandardUser() {
        return login(R.TESTDATA.get("standard_username"), R.TESTDATA.get("standard_password"));
    }
}