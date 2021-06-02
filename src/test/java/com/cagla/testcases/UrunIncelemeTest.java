package com.cagla.testcases;

import com.cagla.pages.HomePage;
import com.cagla.pages.UrunInceleme;
import org.testng.annotations.Test;

public class UrunIncelemeTest extends BaseTest {
    @Test
    public void urunIncelemeTest() {
        HomePage homePage = new HomePage();
        UrunInceleme urunInceleme = homePage.goToSupersonic();
        urunInceleme.goToOnemliOzellikler();
    }
}
