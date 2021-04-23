package AccountTest;

import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginAndLogoutTest extends BaseTest {
    @Test(priority = 1)
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tetiana.kozibroda@luxinten.com");
        loginPage.setPassword("asdASD321321");
        loginPage.clickLoginButton();

    }
    @Test(priority=2)
    public void testSuccessfulLogout(){
        homePage.clickLogOut();


    }
}
