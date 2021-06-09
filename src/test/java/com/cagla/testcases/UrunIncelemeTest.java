package com.cagla.testcases;

import com.cagla.actions.DealsPage;
import com.cagla.actions.HomePage;
import com.cagla.base.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UrunIncelemeTest {


    @Test
    public void urunIncelemeTest() {
        Page.initConfiguration();
        HomePage homePage = new HomePage();
        homePage.goToSupersonic();
        DealsPage dealsPage= homePage.goToExplore();


    }

    @AfterMethod
    public void tearDown() {
        Page.quit();
    }
}
