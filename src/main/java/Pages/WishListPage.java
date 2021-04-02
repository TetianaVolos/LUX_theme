package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage {
    private WebDriver driver;
    By notice = By.xpath("//div[@role=\"alert\"]/child::div");

    public WishListPage(WebDriver driver){this.driver = driver;}
    public void removeFromWish(String name) {
        WebElement remove = driver.findElement(By.xpath("//a[@class=\"product-item-photo\" and starts-with(@title,\"" + name +"\")]/preceding-sibling::a"));
        remove.click();
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(notice));
    }

}
