package com.the.internet.herokuapp.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

   By userName = By.name("username");
   By password = By.id("password");
   By loginButton = By.xpath("//button[@type='submit']");

   public void setUserName(){
      getDriver().findElement(userName).sendKeys("tomsmith");
   }
   public void setPassword(){
      getDriver().findElement(password).sendKeys("SuperSecretPassword!");
   }
   public void clickLoginButton(){
      getDriver().findElement(loginButton).click();
   }
}
