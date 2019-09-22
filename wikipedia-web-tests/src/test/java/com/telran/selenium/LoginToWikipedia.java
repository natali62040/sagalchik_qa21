package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToWikipedia extends TestBase {
    @BeforeMethod
    public void preconditions(){
        if(!app.getSessionHelper().isElementPresent(By.id("pt-login"))){
            app.getSessionHelper().openSite("https://en.wikipedia.org/wiki/Main_Page");
        }
    }
    @Test

    public void LoginTest() throws InterruptedException {
        app.getSessionHelper().login("Natali62040","Sn271206");

        Thread.sleep(7000);

    }

    @AfterMethod
    public void postAction(){
        app.getSessionHelper().openSite("https://en.wikipedia.org/wiki/Main_Page");
    }

}
