package com.m2.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePageIkea extends BasePageIkea {

    public  HomePageIkea(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".top-menu__title.header__h6")
    private List<WebElement> loginButton;

    public LoginPageIkea clickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton.get(1)));
        loginButton.get(1).click();
        return  new LoginPageIkea(driver);
    }
}

