package com.m2.ikea.helper;

import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class UserIkea {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String incorrectEmail;
    private String repetEmail;
    private String rePassword;

    public UserIkea() {
        name = "Elis";
        lastName = "Cat";
        phoneNumber = "1234567890";
        password = "67788888";
        rePassword = "67788888";
        repetEmail = "cat@gmail.com";
        email = "cat@gmail.com";

    }
    public String getName() {
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRepetEmail(){return repetEmail;}

    public String getRePassword(){return rePassword;}



}
