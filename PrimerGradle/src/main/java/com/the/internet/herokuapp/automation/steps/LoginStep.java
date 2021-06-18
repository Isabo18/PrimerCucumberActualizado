package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginStep = new LoginPage();

    @Step
    public void login(){
        loginStep.setUserName();
        loginStep.setPassword();
        loginStep.clickLoginButton();
    }
}
