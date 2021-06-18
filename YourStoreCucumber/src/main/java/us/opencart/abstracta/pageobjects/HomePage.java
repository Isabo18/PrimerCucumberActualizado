package us.opencart.abstracta.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class HomePage extends PageObject {

    By myAccount = By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]/span[2]");
    public By register = By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    By buttonInsecureContent = By.xpath("//button[@id='details-button']");
    By buttonAccessInsecureContent = By.xpath("//a[@id='proceed-link']");

    public void clickMyAccount() {

        getDriver().findElement(myAccount).click();
    }
    public void clickRegister() {
        getDriver().findElement(register).click();
    }
    public void clickButtonInsecureContent(){
        getDriver().findElement(buttonInsecureContent).click();
    }
    public void clickButtonAccessInsecureContent() {
        getDriver().findElement(buttonAccessInsecureContent).click();
    }
}

