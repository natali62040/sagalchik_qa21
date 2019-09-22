package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test
    public void setUP() throws InterruptedException {

        app.getSearchHelper().type(By.cssSelector("[name='search']"),"java"+ Keys.ENTER);
        Thread.sleep(7000);
        String articleTitle = app.getSearchHelper().getArticleTitle();
        Assert.assertEquals(articleTitle.toLowerCase(),"java".toLowerCase());

    }
}











