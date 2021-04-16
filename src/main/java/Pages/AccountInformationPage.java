package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInformationPage {
    private WebDriver driver;
    By emailCheck = By.xpath("//label[@for=\"change-email\"]");
    By passwordCheck = By.xpath("//label[@for=\"change-password\"]");
    By email = By.id("email");
    By currentPass = By.id("current-password");
    By newPas = By.id("password");
    By confirmPass = By.id("password-confirmation");
    By saveButton = By.xpath("//button[@title=\"Save\"]");

    public AccountInformationPage(WebDriver driver){this.driver = driver;}

    public void changeEmail() {
        driver.findElement(emailCheck).click();
        driver.findElement(email).sendKeys("auto.test+edited@luxinten.com");
        driver.findElement(currentPass).sendKeys("asdASD321321");
    }

    public void changePassword() {
        driver.findElement(passwordCheck).click();
        driver.findElement(newPas).sendKeys("ASDasd321321");
        driver.findElement(confirmPass).sendKeys("ASDasd321321");
    }

    public AccountPage saveChanges() {
        driver.findElement(saveButton).click();
        return new AccountPage(driver);
    }

}
