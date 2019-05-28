package com.m2.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageIkea  {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePageIkea(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

        wait = new WebDriverWait(driver, 10);
    }
}

