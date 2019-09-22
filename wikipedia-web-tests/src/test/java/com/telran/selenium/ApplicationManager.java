package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    SessionHelper sessionHelper;
    SearchHelper searchHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init()  {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }if(browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        searchHelper = new SearchHelper(driver);
        sessionHelper = new SessionHelper(driver);

        sessionHelper.openSite("https://en.wikipedia.org/wiki/Main_Page");
        sessionHelper.login("Natali62040","Sn271206");
        //Thread.sleep(7000);
    }

    public void stop() {
        driver.quit();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public SearchHelper getSearchHelper() {
        return searchHelper;
    }
}
