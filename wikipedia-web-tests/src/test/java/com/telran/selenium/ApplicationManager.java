package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;

    public void init() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        openSite("https://en.wikipedia.org/wiki/Main_Page");
        login("Natali62040","Sn271206");
        Thread.sleep(7000);
    }

    public void login(String name, String password) {
        click(By.cssSelector("[href='/w/index.php?title=Special:UserLogin&returnto=Main+Page']"));
        type(By.cssSelector("[name='wpName']"), name);
        type(By.cssSelector("[name='wpPassword\']"), password);
        click(By.id("wpPassword1"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text){
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void stop() {
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

    public String getArticleTitle() {
        return driver.findElement(By.cssSelector("#firstHeading")).getText();
    }
}
