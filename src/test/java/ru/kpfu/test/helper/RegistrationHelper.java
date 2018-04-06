package ru.kpfu.test.helper;

import org.openqa.selenium.By;
import ru.kpfu.test.AppManager;
import ru.kpfu.test.Registration;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class RegistrationHelper extends HelperBase {
    public RegistrationHelper(AppManager appManager) {
        super(appManager);
    }

    public void openRegistrationPage() {
        driver.get("https://trello.com/logged-out");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("Зарегистрироваться")).click();
    }

    public void fillRegistrationForm(Registration registration) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(registration.getEmail());
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(registration.getPassword());
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(registration.getName());
        driver.findElement(By.id("signup")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
