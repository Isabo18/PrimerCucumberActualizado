package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import us.opencart.abstracta.pageobjects.MessagePage;

public class MessageStep {
    MessagePage messagePage = new MessagePage();

    @Step
    public void getMessageRegister(){
        Assertions.assertEquals("¡Felicidades!",messagePage.setMessageRegister());
    }
}
