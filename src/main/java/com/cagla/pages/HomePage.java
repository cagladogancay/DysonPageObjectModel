package com.cagla.pages;

import com.cagla.base.Page;
import com.cagla.pages.firsatlar.FirsatlarPage;

public class HomePage extends Page {
    public FirsatlarPage goToKesfet(){
        click("kesfet_CSS");
        return new FirsatlarPage();
    }
    public HomePage goToBackHomePage(){
        click("dysontopmenu_CSS");
        return new HomePage();
    }
    public UrunInceleme goToSupersonic(){
      click("supersonicsatinal_CSS");
      return new UrunInceleme();
    }
}
