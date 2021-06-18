package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.MessagePage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;


public class MessageStep {
    MessagePage messagePage = new MessagePage();

    @Step
    public void messageLogin(){
        Assertions.assertEquals("You logged into a secure area!", messagePage.messageLogin());
    }
}
