package com.cagla.testcases;

import com.cagla.actions.DealsPage;
import com.cagla.actions.HomePage;
import com.cagla.base.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirsatlarTest {
    @Test
    public void firsatlarTest() {
        Page.initConfiguration();
        HomePage homePage = new HomePage();
        DealsPage dealsPage = Page.menu.goToDeals();
        homePage.goToBackHomePage();

    }

    @AfterMethod
    public void tearDown() {
        Page.quit();
    }
}
