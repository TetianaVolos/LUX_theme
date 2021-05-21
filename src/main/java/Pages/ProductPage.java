package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;
    By prName = By.xpath("//h1/child::span");
    By addToWish = By.cssSelector("a.action.towishlist");
    By color = By.xpath("//div[@class='swatch-option color']");
    By size = By.xpath("//div[@class='swatch-option text']");
    By addToCartButton = By.id("product-addtocart-button");

    public ProductPage(WebDriver driver){this.driver = driver;}
    public String getName() {
        String name = driver.findElement(prName).getText();
        return name;
    }
    public LoginPage addToWishGuest() {
        driver.findElement(addToWish).click();
        return new LoginPage(driver);
    }

    public void selectColor() {
        driver.findElement(color).click();
    }

    public void selectSize() {
        driver.findElement(size).click();
    }

    public WishListPage addToCartFromWishlist() {
        driver.findElement(addToCartButton).click();
        return new WishListPage(driver);
    }

    public void waitPageLoad() {
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(size));
    }

}
