package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    private void clickLink (String MenuItem){
        driver.findElement(By.linkText(MenuItem)).click();

    }
    public AddressBookPage clickAddressBook(){
        clickLink("Address Book");
        return new AddressBookPage(driver);
    }


    public AccountInformationPage clickAccountInformation(){
        clickLink("Account Information");
        return new AccountInformationPage(driver);
    }

    public WishListPage clickWishList(){
        clickLink("My Wish List");
        return new WishListPage(driver);
    }
//    public AddressBookPage clickManageAddresses(){
//        clickLink("Manage Addresses");
//        return new AddressBookPage(driver);
//    }
}
