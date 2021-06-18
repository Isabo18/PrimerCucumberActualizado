package com.the.internet.herokuapp.automation;

import com.the.internet.herokuapp.automation.steps.HomeStep;
import com.the.internet.herokuapp.automation.steps.LoginStep;
import com.the.internet.herokuapp.automation.steps.MessageStep;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;

public class TestAuthentication {

    @Steps
    HomeStep homeStep = new HomeStep();

    @Steps
    LoginStep loginStep = new LoginStep();

    @Steps
    MessageStep messageStep = new MessageStep();

    @Test
    public void authenticationInHerokuapp()throws InterruptedException{
        homeStep.openBrowser();
        homeStep.clickFormAuthentication();
        loginStep.login();
        Thread.sleep(4000);
        messageStep.messageLogin();
    }
}
