package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressesAddingPage {
    private WebDriver driver;
    By Phone = By.id("telephone");
    By Street = By.id("street_1");
    By City = By.id("city");
    By SaveButton = By.cssSelector("button.action.save.primary");
    By SuccessMessage = By.xpath("//div[starts-with(text(),\"You saved the address.\")]");
    By DefaultBillingCheckbox = By.xpath("//label[@for=\"primary_billing\"]");



    public AddressesAddingPage(WebDriver driver) {this.driver = driver;}
    public void SetPhone(String phone){driver.findElement(Phone).sendKeys(phone);}
    public void SetStreet(String street){driver.findElement(Street).sendKeys(street);}
    public void SetCity(String city){driver.findElement(City).sendKeys(city);}
    public void SetDefault(){driver.findElement(DefaultBillingCheckbox).click();}
    public AddressesAddingPage SubmitNewAddress(){
        driver.findElement(SaveButton).click();
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(SuccessMessage));
        return this;
    }


}
