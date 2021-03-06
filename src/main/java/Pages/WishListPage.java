package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage extends Header {
    private WebDriver driver;
    By notice = By.xpath("//div[@role=\"alert\"]/child::div");
    By addToCart = By.cssSelector("button.action.tocart.primary");
    By addAllToCart = By.xpath("//button[@data-role=\"all-tocart\"]");

    public WishListPage(WebDriver driver){this.driver = driver;}
    public void removeFromWish(String name) {
        WebElement remove = driver.findElement(By.xpath("//a[@class=\"product-item-photo\" and starts-with(@title,\"" + name +"\")]/preceding-sibling::a"));
        remove.click();
    }

    public ProductPage addToCart() {
        driver.findElement(addToCart).click();
        return new ProductPage(driver);
    }

    public void addAllToCart() {
        driver.findElement(addAllToCart).click();
    }

    public void waitPageLoad() {
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(notice));
    }


}
