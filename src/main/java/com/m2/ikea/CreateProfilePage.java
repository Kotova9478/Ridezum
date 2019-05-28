package com.m2.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateProfilePage extends BasePageIkea {
    public CreateProfilePage (WebDriver driver){
        super(driver);
    }
    @FindBy(css ="input")//"ikea-map-input.inputs.capitalize.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset" )
    private List<WebElement> fields;
     /*  0: input.ui-input-text.ui-body-a.ui-corner-all.ui-shadow-inset
1: input#name.ikea-map-input.inputs.capitalize.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
2: input#surname.ikea-map-input.inputs.capitalize.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
3: input#phone.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
4: input#email.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
5: input#repeatEmail.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
6: input#password.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
7: input#repeatPassword.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset
8: input#captchaId
9: input#captchaInput.ikea-map-input.inputs.ui-input-text.ui-body-c.ui-corner-all.ui-shadow-inset */

    private WebElement lastNameField;
    private WebElement phoneField;
    private WebElement emailField;
    private WebElement repeatEmailField;
    private WebElement passwordField;
    private WebElement rePasswordField;
    private WebElement captchaIdField;
    private WebElement captchaInputField;

   // @FindBy(css = ".clearfix")
   // private WebElement createProfileButton;

    @FindBy(css = "#submit")
    private WebElement createSubmitButtun;

    public void inputNameField(String name){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(1)));
        fields.get(1).sendKeys(name);
    }
    public void lastNameField(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(2)));
        fields.get(2).sendKeys(lastName);
    }
    public void inputPhoneField(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(3)));
        fields.get(3).sendKeys(phone);
    }

    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(4)));
        fields.get(4).sendKeys(email);
    }
    public void inputRepeatEmailField(String repetEmail){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(5)));
        fields.get(5).sendKeys(repetEmail);
    }
    public void inputPasswordField(String password){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(6)));
        fields.get(6).sendKeys(password);
    }
    public void inputRePasswordField(String rePassword){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(7)));
        fields.get(7).sendKeys(rePassword);
    }
    public void captchaIdField(String characters){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(8)));
       fields.get(8).sendKeys(characters);
    }
    public void inputcaptchaInputField(String characters){
        wait.until(ExpectedConditions.elementToBeClickable(fields.get(9)));
        fields.get(9).sendKeys(characters);
    }
    /*public void selectRandomCharacters() {
        // wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));
        Select selectRandom;
        selectRandom = new Select(fields.get(9));
        int index = 0;
        Random random = new Random();
        random.nextInt(7);
        if (index == 0){
            index = 1; }*/

       // public void clickSubmit(){
       // createSubmitButtun.click();




    }
         /*public void selectRandomCharacters() {
        // wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));
        Select selectRandom;
        selectRandom = new Select(fields.get(9));
        int index = 0;
        Random random = new Random();
        random.nextInt(7);
        if (index == 0){
            index = 1; }*/











