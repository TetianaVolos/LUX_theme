package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreate {
    private WebDriver driver;
    By FirstName =  By.id("firstname");
    By LastName = By.id("lastname");
    By Email = By.id("email_address");
    By Password = By.id("password");
    By PasswordConfirmation = By.id("password-confirmation");
    By RegisterButton = By.cssSelector("button.action.submit.primary");

    public AccountCreate(WebDriver driver){
        this.driver = driver;
    }
    public void setFirstName(String firstname){
        driver.findElement(FirstName).sendKeys(firstname);
    }
    public void setLastName(String lastname){
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(Password).sendKeys(password);
        driver.findElement(PasswordConfirmation).sendKeys(password);
    }
    public AccountPage clickRegisterButton(){
        driver.findElement(RegisterButton).click();
        return new AccountPage(driver);
    }
}
