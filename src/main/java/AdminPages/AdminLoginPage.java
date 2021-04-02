package AdminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage {
    private WebDriver driver;
    By adminUserName = By.id("username");
    By adminPassword = By.id("login");
    By submitButton = By.className("action-login");

    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(adminUserName).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(adminPassword).sendKeys(password);
    }
    public DashboardPage clickLoginButton(){
        driver.findElement(submitButton).click();
        return new DashboardPage(driver);
    }
}