package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    By prName = By.xpath("//h1/child::span");
    By addToWish = By.cssSelector("a.action.towishlist");

    public ProductPage(WebDriver driver){this.driver = driver;}
    public String getName() {
        String name = driver.findElement(prName).getText();
        return name;
    }
    public LoginPage addToWishGuest() {
        driver.findElement(addToWish).click();
        return new LoginPage(driver);
    }

}
