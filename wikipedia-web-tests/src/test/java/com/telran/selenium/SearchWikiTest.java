package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test
    public void setUP() throws InterruptedException {

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java"+ Keys.ENTER);
        Thread.sleep(7000);

    }
}
