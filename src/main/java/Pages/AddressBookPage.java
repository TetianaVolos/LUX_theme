package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressBookPage {
    private WebDriver driver;
    By AddAddressButton = By.xpath("//span[text()=\"Add New Address\"]");
    public AddressBookPage(WebDriver driver) {this.driver = driver;}

    public AddressesAddingPage clickAddAddress(){
       driver.findElement(AddAddressButton).click();
       return new AddressesAddingPage(driver);
    }

}
