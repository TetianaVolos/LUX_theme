package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    By userNameField = By.xpath("//input[@name='login[username]']");
    By passwordField = By.xpath("//input[@name='login[password]']");
    By signInButtonForm = By.cssSelector("button.action.login.primary");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public AccountPage clickLoginButton(){
        driver.findElement(signInButtonForm).click();
        return new AccountPage(driver);
    }
    public WishListPage clickLoginAfterWishAdding(){
        new WebDriverWait(driver,1000).until(ExpectedConditions
                .elementToBeClickable(signInButtonForm)).click();
        return new WishListPage(driver);
    }
}
