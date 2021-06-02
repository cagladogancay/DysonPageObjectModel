package com.cagla.testcases;

import com.cagla.base.Page;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    @AfterSuite
    public void tearDown() {
        Page.quit();
    }
}

