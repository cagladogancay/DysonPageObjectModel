package com.cagla.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuLocators {
    @FindBy(css = "div[class='header__logo__inner']>a")
    public WebElement dysonTopMenuItem;
    @FindBy(css = "ul[class='header__nav__list']>li[class='header__nav-item']:first-of-type>a")
    public WebElement dysonTopMenuDeals;

}
