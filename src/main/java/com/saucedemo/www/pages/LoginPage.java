package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");
    By verifyMessage = By.xpath("//span[@class='title'and contains(text(),'Products')]");
    By itemVerify = By.xpath("//div[@class='inventory_item' ]");

    public void enterUserName(String name) {
        sendTextToElement(userName, name);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public String verifyText() {
        return getTextFromElement(verifyMessage);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public int verifyNumber(){
        return getValue(itemVerify);
    }
}
