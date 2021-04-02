package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    By accountIcon = By.xpath("//div[@class='humberger-item']");
    By signIn = By.linkText("Sign In");
    By signOut = By.linkText("Sign Out");
    By accountCreate = By.linkText("Create an Account");
    By productLink = By.cssSelector("a.product-item-link");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        new WebDriverWait(driver,1000).until(ExpectedConditions
                .elementToBeClickable(accountIcon)).click();
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }
    public HomePage clickLogOut() {
        new WebDriverWait(driver,1000).until(ExpectedConditions
                .elementToBeClickable(accountIcon)).click();
        driver.findElement(signOut).click();
        new WebDriverWait(driver,1000).until(ExpectedConditions
                .urlToBe("https://luxima.luxinten.com/"));
        return this;
    }

    public AccountCreate clickCreateAccout() {
        new WebDriverWait(driver,1000).until(ExpectedConditions
                .elementToBeClickable(accountIcon)).click();
        driver.findElement(accountCreate).click();
        return new AccountCreate(driver);
    }

    public ProductPage goToProduct() {
        WebElement item = driver.findElement(productLink);
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", item);
        driver.findElement(productLink).click();
        return new ProductPage(driver);
    }
}
