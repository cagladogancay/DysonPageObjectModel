package com.cagla.base;


import com.aventstack.extentreports.Status;
import com.cagla.listeners.CustomListeners;
import com.cagla.utilities.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Page {
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static ExcelReader excel = new ExcelReader(
            System.getProperty("user.dir") + "\\src\\test\\resources\\com\\cagla\\excel\\dyson.xlsx");
    public static WebDriverWait wait;
    public static String browser;
    public static TopMenu menu;

    public Page() {
        if (driver == null) {
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\com\\cagla\\properties\\Config.properties");
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                config.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\com\\cagla\\properties\\OR.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }
            try {
                OR.load(fis);

            } catch (IOException e) {
                e.printStackTrace();

            }
            //jenkins env
            if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
                browser = System.getenv("browser");
            } else {
                browser = config.getProperty("browser");
            }
            config.setProperty("browser", browser);
            switch (config.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                
            }
            driver.manage().window().maximize();
            driver.get(config.getProperty("browserurl"));
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
                    TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 5);
        }

    }

    public static void click(String locator) {
        if (locator.endsWith("_CSS")) {
            driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
        } else if (locator.endsWith("_XPATH")) {
            driver.findElement(By.xpath(OR.getProperty(locator))).click();

        } else if (locator.endsWith("_ID")) {
            driver.findElement(By.id(OR.getProperty(locator))).click();

        }
        CustomListeners.testReport.get().log(Status.INFO, "Click on : " + locator);
    }

    public static void type(String locator, String value) {
        if (locator.endsWith("_CSS")) {
            driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
        } else if (locator.endsWith("_XPATH")) {
            driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
        } else if (locator.endsWith("_ID")) {
            driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
        }
        CustomListeners.testReport.get().log(Status.INFO, "Typing in : " + locator + " entered value as " + value);
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
