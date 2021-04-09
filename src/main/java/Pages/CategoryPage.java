package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    By prName = By.cssSelector("a.product-item-link");
    By addToWish = By.cssSelector("a.action.towishlist");

    public CategoryPage(WebDriver driver){this.driver = driver;}
    public String getName() {
        String name = driver.findElement(prName).getText();
        return name;
    }
    public WishListPage addToWish() {
        driver.findElement(addToWish).click();
        return new WishListPage(driver);
    }
}
