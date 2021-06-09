package com.cagla.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(css ="a[href='https://www.dyson.com.tr/dyson-supersonic-black-nickel']")
    public WebElement supersonicSatinAl;
    @FindBy(css = "div[class='header__logo__inner']>a")
    public WebElement topMenuItem;

    @FindBy(css = ".product__stickynav__links--keyfeatures.js_dyson_stickynav_keyfeatures")
    public WebElement exploreItem;
}
