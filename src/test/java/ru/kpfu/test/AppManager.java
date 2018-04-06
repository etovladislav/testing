package ru.kpfu.test;

import org.openqa.selenium.WebDriver;
import ru.kpfu.test.helper.*;

/**
 * Created by Vladislav Ulyanov on 06.04.18.
 * vk.com/etovladislav
 */
public class AppManager {

    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

    private BoardHelper boardHelper;
    private NavigationHelper navigationHelper;
    private RegistrationHelper registrationHelper;
    private TaskHelper taskHelper;
    private LogoutHelper logoutHelper;

    public AppManager(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
        boardHelper = new BoardHelper(this);
        navigationHelper = new NavigationHelper(this);
        registrationHelper = new RegistrationHelper(this);
        taskHelper = new TaskHelper(this);
        logoutHelper = new LogoutHelper(this);
    }

    public LogoutHelper getLogoutHelper() {
        return logoutHelper;
    }

    public void setLogoutHelper(LogoutHelper logoutHelper) {
        this.logoutHelper = logoutHelper;
    }

    public RegistrationHelper getRegistrationHelper() {
        return this.registrationHelper;
    }

    public TaskHelper getCreateCardHelper() {
        return this.taskHelper;
    }

    public NavigationHelper getNavigateHelper() {
        return this.navigationHelper;
    }

    public BoardHelper getBoardHelper() {
        return this.boardHelper;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public boolean isAcceptNextAlert() {
        return acceptNextAlert;
    }

    public void setAcceptNextAlert(boolean acceptNextAlert) {
        this.acceptNextAlert = acceptNextAlert;
    }

    public StringBuffer getVerificationErrors() {
        return verificationErrors;
    }

    public void setVerificationErrors(StringBuffer verificationErrors) {
        this.verificationErrors = verificationErrors;
    }

    public void setBoardHelper(BoardHelper boardHelper) {
        this.boardHelper = boardHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void setNavigationHelper(NavigationHelper navigationHelper) {
        this.navigationHelper = navigationHelper;
    }

    public void setRegistrationHelper(RegistrationHelper registrationHelper) {
        this.registrationHelper = registrationHelper;
    }

    public TaskHelper getTaskHelper() {
        return taskHelper;
    }

    public void setTaskHelper(TaskHelper taskHelper) {
        this.taskHelper = taskHelper;
    }
}
