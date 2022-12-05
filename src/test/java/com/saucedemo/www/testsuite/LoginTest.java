package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
  LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
      loginPage.enterUserName("standard_user");
      loginPage.enterPassword("secret_sauce");
      loginPage.clickOnLogin();
        Assert.assertEquals(loginPage.verifyText(),"PRODUCTS","not verify");
    }
    @Test
  public void verifyThatSixProductsAreDisplayedOnPage(){
      loginPage.enterUserName("standard_user");
      loginPage.enterPassword("secret_sauce");
      loginPage.clickOnLogin();
       Assert.assertEquals(loginPage.verifyNumber(),6,"not verify");
    }
}
