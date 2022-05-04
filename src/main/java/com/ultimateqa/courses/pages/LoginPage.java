package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By clickLogin = (By.linkText("Sign In"));

    public void setClickLogin() {
        clickOnElement(clickLogin);
    }

}




