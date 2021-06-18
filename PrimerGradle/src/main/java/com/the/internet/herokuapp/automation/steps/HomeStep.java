package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void clickFormAuthentication(){
        homePage.clickFormAuthentication();
    }
}
