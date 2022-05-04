package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class ErrorMessagePage extends Utility {

    By clicksigninbutton = (By.linkText("Sign In"));
    By username = (By.xpath("//input[@id='user[email]']"));
    By password = (By.xpath("//input[@id='user[password]']"));
    By signin = ((By.xpath("//input[@value='Sign in']")));

    public void setClicksigninbutton() {
        clickOnElement(clicksigninbutton);
    }

   public  void  enterInvalidUserName() {
       sendTextToElement(username, "abc@gmail.com");
   }

   public void enterInvalidPassword(){
            sendTextToElement(password,"abc");

        }
        public void clickonsigninbutton(){
            clickOnElement(signin);
        }
    }


