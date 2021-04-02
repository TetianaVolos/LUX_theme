package AccountTest;

import Base.BaseTest;
import Pages.AccountCreate;
import Pages.AccountPage;
import Pages.AddressesAddingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatingCustomerTest extends BaseTest {
protected AccountPage accountDashboard;
By DefaultBilling = By.cssSelector("div.box.box-address-billing");
    @Test(priority = 1, description="Creating Customer")
    public void testCreatingAccount(){
        AccountCreate accountCreate = homePage.clickCreateAccout();
        accountCreate.setFirstName("Auto");
        accountCreate.setLastName("Test");
        accountCreate.setEmail("auto.test@luxinten.com");
        accountCreate.setPassword("asdASD321321");
        AccountPage accountPage = accountCreate.clickRegisterButton();
        accountDashboard = new AccountPage(driver);
    }
    @Test(priority = 2, description="Adding first Address")
    public void addingFirstAddress(){

        driver.findElement(By.linkText("Manage Addresses")).click();
        AddressesAddingPage addressesAddingPage = new AddressesAddingPage(driver);
        addressesAddingPage.SetStreet("35, Sutton New Road");
        addressesAddingPage.SetPhone("0161 359 4777");
        addressesAddingPage.SetCity("Birmingham");
        addressesAddingPage.SubmitNewAddress();
        Assert.assertTrue(driver.findElement(DefaultBilling).getText().contains("35, Sutton New Road"));
    }
}
