package com.solvd.carina.demo.mobile.gui.homework.pages.android;

import com.solvd.carina.demo.mobile.gui.homework.pages.common.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement productsTitle;

    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        return productsTitle.isElementPresent();
    }
}
