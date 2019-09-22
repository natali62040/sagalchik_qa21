package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase {

    WebDriver driver;

    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle() {
        return driver.findElement(By.cssSelector(".firstHeading")).getText();
    }
}
