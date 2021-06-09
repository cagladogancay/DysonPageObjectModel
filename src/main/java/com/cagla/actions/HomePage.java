package com.cagla.actions;

import com.cagla.base.Page;
import com.cagla.locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends Page {
    public HomePageLocators homePageLocators;

    public HomePage() {
        this.homePageLocators = new HomePageLocators();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(ajaxElementLocatorFactory, this.homePageLocators);
    }

    public DealsPage goToExplore() {
        click(homePageLocators.exploreItem);
        return new DealsPage();
    }

    public HomePage goToBackHomePage() {
        click(homePageLocators.topMenuItem);
        return new HomePage();
    }

    public HomePage goToSupersonic() {
        click(homePageLocators.supersonicSatinAl);
        return new HomePage();
    }
}
