package com.cagla.base;


import com.aventstack.extentreports.Status;
import com.cagla.listeners.CustomListeners;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Page {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static String browser;
    public static TopMenu menu;


    public static void initConfiguration() {
        if (Constants.browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Constants.browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(Constants.browserurl);
        driver.manage().window().maximize();
        menu = new TopMenu(driver);
    }


    public static void click(WebElement element) {
        element.click();
        CustomListeners.testReport.get().log(Status.INFO, "Click on : " + element);
    }

    public static void type(WebElement element, String value) {
        element.sendKeys(value);
        CustomListeners.testReport.get().log(Status.INFO, "Typing in : " + element + " entered value as " + value);
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
