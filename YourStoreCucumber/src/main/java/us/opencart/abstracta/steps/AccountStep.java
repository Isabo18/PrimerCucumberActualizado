package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import us.opencart.abstracta.pageobjects.AccountPage;
import us.opencart.abstracta.models.Data;

public class AccountStep {

    AccountPage accountPage = new AccountPage();

    @Step
    public void registerUser (Data data){
        accountPage.setUserName(data.getUserName());
        accountPage.setLastName(data.getLastName());
        accountPage.setEmail(data.getEmail());
        accountPage.setTelephone(data.getTelephone());
        accountPage.setPassword(data.getPassword());
        accountPage.setConfirmPassword(data.getPassword());
        accountPage.clickCheckIAgree();
        accountPage.clickContinueButton();
    }
    @Step
    public void validateMessageAccountInvalid(){
        accountPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(accountPage.getMessageAccountInvalid()));

    }

}
