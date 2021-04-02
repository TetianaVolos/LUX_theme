package AccountTest;

import Base.BaseTest;
import Base.BaseTestAccount;
import Pages.AddressBookPage;
import Pages.AddressesAddingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAddresses extends BaseTestAccount {
    @Test
    public void addAdditionalAddress(){
       AddressBookPage addressBookPage = accountPage.clickAddressBook();
       addressBookPage.clickAddAddress();
       AddressesAddingPage addressesAddingPage = new AddressesAddingPage(driver);
       addressesAddingPage.SetStreet("35, Sutton New Road Edited");
       addressesAddingPage.SetPhone("0161 123 4777");
       addressesAddingPage.SetCity("Birmingham New");
       addressesAddingPage.SetDefault();
       addressesAddingPage.SubmitNewAddress();
       Assert.assertTrue(driver.findElement(By.cssSelector("div.box.box-address-billing")).getText().contains("35, Sutton New Road Edited"));
       //Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"box box-address-billing\"]/descendant::address")).getText().contains("01611234777"));

    }
}
