package us.opencart.abstracta.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {

    By messageRegister = By.id("//body/div[@id='common-success']/div[1]/div[1]/p[1]");

    public String setMessageRegister(){
        return getDriver().findElement(messageRegister).getText();
    }
}
