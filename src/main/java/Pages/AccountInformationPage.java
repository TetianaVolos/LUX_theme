package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountInformationPage {
    private WebDriver driver;
    By emailCheck = By.xpath("//label[@for=\"change-email\"]");
    By passwordCheck = By.xpath("//label[@for=\"change-password\"]");
    By newEmail = By.id("email");
    By currentPass = By.id("current-password");
    By newPas = By.id("password");
    By confirmPass = By.id("password-confirmation");
    By saveButton = By.xpath("//button[@title=\"Save\"]");
    By SuccessMessage = By.xpath("//div[starts-with(text(),\"You saved the\")]");

    public AccountInformationPage(WebDriver driver){this.driver = driver;}

    public void changeEmail(String email, String password) {
        driver.findElement(emailCheck).click();
        driver.findElement(newEmail).clear();
        driver.findElement(newEmail).sendKeys(email);
        driver.findElement(currentPass).sendKeys(password);
    }

    public void changePassword(String password) {
        driver.findElement(passwordCheck).click();
        driver.findElement(newPas).sendKeys(password);
        driver.findElement(confirmPass).sendKeys(password);
    }

    public LoginPage saveChanges() {
        driver.findElement(saveButton).click();
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(SuccessMessage));
        return new LoginPage(driver);
    }

}
