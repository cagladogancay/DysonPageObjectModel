package com.cagla.base;

import com.cagla.actions.DealsPage;
import com.cagla.actions.HomePage;
import com.cagla.locators.TopMenuLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static com.cagla.base.Page.click;

public class TopMenu{
    public TopMenuLocators topMenuLocators;

    public TopMenu(WebDriver driver) {
        this.topMenuLocators = new TopMenuLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, topMenuLocators);
    }

    public HomePage goToDyson() {
        click(topMenuLocators.dysonTopMenuItem);
        return new HomePage();
    }

    public DealsPage goToDeals() {
        click(topMenuLocators.dysonTopMenuDeals);
        return new DealsPage();
    }
/*
    public void goToAlisveris() {
        click("alisverismenu_CSS");
    }

    public void goToUrunler() {
        click("urunlermenu_CSS");
    }

    public void goToProfIsletmeler() {
        click("profisletmelermenu_CSS");
    }

    public void goToDemoStore() {
        click("demostoremenu_CSS");
    }

    public void goToDestek() {
        click("destekmenu_CSS");
    }

    public void goToArama() {
        click("aramamenu_CSS");
    }

    public void goToAlisverisSepeti() {
        click("alisverissepetimenu_CSS");
    }*/


}
