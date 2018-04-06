package ru.kpfu.test.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.kpfu.test.AppManager;
import ru.kpfu.test.Card;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class TaskHelper extends HelperBase{

    public TaskHelper(AppManager appManager) {
        super(appManager);
    }

    public void createNewCard(Card card) {
        driver.findElement(By.linkText("Добавить карточку…")).click();
        driver.findElement(By.xpath("//div[@id='board']/div/div/div[2]/div/div/div/textarea")).clear();
        driver.findElement(By.xpath("//div[@id='board']/div/div/div[2]/div/div/div/textarea")).sendKeys(card.getName());
        driver.findElement(By.xpath("//input[@value='Добавить']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
