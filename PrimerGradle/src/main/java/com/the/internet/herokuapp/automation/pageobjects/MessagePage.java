package com.the.internet.herokuapp.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {

    By messageLogin = By.id("flash");

    public String  messageLogin(){
       return getDriver().findElement(messageLogin).getText().replace("\n", "").substring(0,30);
    }
}
