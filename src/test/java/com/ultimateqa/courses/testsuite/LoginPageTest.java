package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.ErrorMessagePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    ErrorMessagePage errorMessagePage = new ErrorMessagePage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        loginPage.setClickLogin();
        String expectedMessage = "Welcome Back!";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Welcome Back!']"));
        Assert.assertEquals("Welcome Back! text is not displayed",expectedMessage , actualMessage);

    }
    @Test
    public void verifyTheErrorMessage(){
        errorMessagePage.setClicksigninbutton();
        errorMessagePage.enterInvalidUserName();
        errorMessagePage.enterInvalidPassword();
        errorMessagePage.clickonsigninbutton();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = getTextFromElement(By.xpath("//li[contains(text(),'Invalid email or password.')]"));
        Assert.assertEquals("Error message text is not displayed",expectedMessage , actualMessage);


    }

}
