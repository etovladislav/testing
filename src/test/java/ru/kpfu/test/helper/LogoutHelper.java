package ru.kpfu.test.helper;

import org.openqa.selenium.By;
import ru.kpfu.test.AppManager;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class LogoutHelper extends HelperBase {
    public LogoutHelper(AppManager appManager) {
        super(appManager);
    }

    public void logout() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#header > div.header-user > a.header-btn.header-avatar.js-open-header-member-menu > span > span.member-initials")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }
}
