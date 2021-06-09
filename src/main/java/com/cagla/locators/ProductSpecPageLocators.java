package com.cagla.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSpecPageLocators {
    @FindBy (css = "a[data-sticky-nav-target='product-promo']")
    public WebElement spec;
}
