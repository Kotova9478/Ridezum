package com.m2.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPageIkea extends BasePageIkea{
    public LoginPageIkea(WebDriver driver) {super(driver);
    }

    @FindBy (css = ".ui-link-inherit")
    private List<WebElement> createProfile;
    /*0: span.ui-btn-text
    1: span.ui-btn-text
    2: div.ui-btn-text
    3: div.ui-btn-text
     */

    public CreateProfilePage clickCreateButton(){
      wait.until(ExpectedConditions.elementToBeClickable(createProfile.get(1)));
        createProfile.get(1).click();
        return new CreateProfilePage(driver);

    }
}
