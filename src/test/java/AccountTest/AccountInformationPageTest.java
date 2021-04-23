package AccountTest;

import Base.BaseTestAccount;
import Pages.AccountInformationPage;
import Pages.AccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountInformationPageTest extends BaseTestAccount {


    @Test (priority = 1)
    public void testChangeEmail() {
        AccountInformationPage accountInformationPage = accountPage.clickAccountInformation();
        accountInformationPage.changeEmail("auto.test+edited@luxinten.com", "asdASD321321");
        accountInformationPage.changePassword("ASDasd321321");
        accountInformationPage.saveChanges();
    }

    @Test (priority = 2)
    public void testLoginWithNewCredentials() {
        loginPage.setUsername("auto.test+edited@luxinten.com");
        loginPage.setPassword("ASDasd321321");
        loginPage.clickLoginButton();
        accountPage.clickAccountInformation();
        Assert.assertEquals(driver.getTitle(),"My Account");
    }
}