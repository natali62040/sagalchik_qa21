package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{


    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String name, String password) {
        click(By.cssSelector("[href='/w/index.php?title=Special:UserLogin&returnto=Main+Page']"));
        type(By.cssSelector("[name='wpName']"), name);
        type(By.cssSelector("[name='wpPassword\']"), password);
        click(By.id("wpPassword1"));
    }

    public void openSite(String url) {
        driver.get(url);
    }
}
