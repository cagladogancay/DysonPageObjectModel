package com.cagla.base;

import com.cagla.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class TopMenu extends Page {
    WebDriver driver;

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage goToDyson() {
        click("dysontopmenu_CSS");
        return new HomePage();
    }

    public void goToFirsatlar() {
        click("firsatlarmenu_CSS");
    }

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
    }


}
