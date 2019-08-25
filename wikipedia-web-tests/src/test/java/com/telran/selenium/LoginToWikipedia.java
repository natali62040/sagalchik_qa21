package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWikipedia extends TestBase {
    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        click(By.id("pt-login"));
        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("1111@mail.ru");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("123456789");

        click(By.id("wpLoginAttempt"));

        Thread.sleep(7000);

    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
}
