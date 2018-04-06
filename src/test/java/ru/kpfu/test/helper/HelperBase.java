package ru.kpfu.test.helper;

import org.openqa.selenium.*;
import ru.kpfu.test.AppManager;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class HelperBase {
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

    public HelperBase(AppManager appManager) {
        this.driver = appManager.getDriver();
        this.baseUrl = appManager.getBaseUrl();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
