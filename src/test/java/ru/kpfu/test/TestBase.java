package ru.kpfu.test;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vladislav Ulyanov on 04.04.18.
 * vk.com/etovladislav
 */
public class TestBase {

    protected WebDriver driver;
    protected String baseUrl;
    protected AppManager appManager;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        appManager = new AppManager(driver, baseUrl);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        appManager.getLogoutHelper().logout();
    }
}
