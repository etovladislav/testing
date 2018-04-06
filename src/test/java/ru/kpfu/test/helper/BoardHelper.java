package ru.kpfu.test.helper;

import org.openqa.selenium.By;
import ru.kpfu.test.AppManager;
import ru.kpfu.test.Board;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class BoardHelper extends HelperBase {

    public BoardHelper(AppManager appManager) {
        super(appManager);
    }

    public void createBoard(Board board) {
        driver.findElement(By.xpath("//div[@id='header']/div/a/span[2]")).click();
        driver.findElement(By.cssSelector("#boards-drawer > div > div.board-drawer-content.u-fancy-scrollbar > div.js-board-drawer-buttons > div > a.quiet-button.js-add-board")).click();
        driver.findElement(By.cssSelector("#classic > div.window-overlay.mod-no-chrome-overlay > div > div > form > div > div > div:nth-child(2) > input")).clear();
        driver.findElement(By.cssSelector("#classic > div.window-overlay.mod-no-chrome-overlay > div > div > form > div > div > div:nth-child(2) > input")).sendKeys(board.getName());
        driver.findElement(By.cssSelector("#classic > div.window-overlay.mod-no-chrome-overlay > div > div > form > button")).click();

    }
}
