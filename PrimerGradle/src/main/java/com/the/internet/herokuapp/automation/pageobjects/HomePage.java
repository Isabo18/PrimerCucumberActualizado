package com.the.internet.herokuapp.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;


@DefaultUrl("https://the-internet.herokuapp.com/")
public class HomePage extends PageObject {
    By formAuthentication = By.xpath("//a[@href='/login']");

    public void clickFormAuthentication(){

        getDriver().findElement(formAuthentication).click();
    }
}
