package com.cagla.actions;

import com.cagla.base.Page;
import com.cagla.locators.DealsPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DealsPage  extends Page {
    public DealsPageLocators dealsPageLocators;
    public DealsPage(){
        this.dealsPageLocators= new DealsPageLocators();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajaxElementLocatorFactory,this.dealsPageLocators);
    }


}
