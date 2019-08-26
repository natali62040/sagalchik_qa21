package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase{
    @Test
    public void LoginTest(){
        openSite("https://ebay.com");
        //init login
        initLogin();
        //fill login form
        fillLoginForm("1111@mail.ru", "123456789");

        clickLoginButton();

    }


}
