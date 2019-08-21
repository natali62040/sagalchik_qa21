package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver driver;
    @Test
    public void setUP() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.name("search")).sendKeys("java");
        Thread.sleep(7000);
        driver.quit();
    }
}
