package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {

        this.driver = driver;
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text){
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
