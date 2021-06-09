package com.cagla.actions;

import com.cagla.base.Page;
import com.cagla.locators.ProductSpecPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProductSpecPage extends Page {
    public ProductSpecPageLocators productSpecPageLocators;

    public ProductSpecPage() {
        this.productSpecPageLocators = new ProductSpecPageLocators();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(ajaxElementLocatorFactory, this.productSpecPageLocators);
    }

    public void goToSpecifications() {
        click(productSpecPageLocators.spec);
    }
}
