package AccountTest;

import Base.BaseTestAccount;
import Pages.AccountInformationPage;
import Pages.AccountPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountInformationPageTest extends BaseTestAccount {

    @Test
    public void goToAccountInfo(){
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickAccountInformation();
    }

    @Test
    public void testChangeEmail() {


    }

    @Test
    public void testChangePassword() {
    }

    @Test
    public void testSaveChanges() {
    }
}