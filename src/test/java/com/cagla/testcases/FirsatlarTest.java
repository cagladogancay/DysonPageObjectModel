package com.cagla.testcases;

import com.cagla.base.TopMenu;
import com.cagla.pages.HomePage;
import org.testng.annotations.Test;

public class FirsatlarTest extends BaseTest {
    @Test
    public void firsatlarTest() {
        HomePage homePage = new HomePage();
        homePage.goToKesfet();
        homePage.goToBackHomePage();
    }
}
