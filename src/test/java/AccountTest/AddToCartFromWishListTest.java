package AccountTest;

import Pages.ProductPage;
import Pages.WishListPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCartFromWishListTest extends AddToWishListTest{
    @Test(priority = 2, description = "add to cart from wishlist")
    public void addToCart() {
        WishListPage wishListPage = new WishListPage(driver);
        wishListPage.waitPageLoad();
        ProductPage productPage = wishListPage.addToCart();
        productPage.waitPageLoad();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'You need to choose options for your item.')]")).isDisplayed());
        productPage.selectColor();
        productPage.selectSize();
        wishListPage = productPage.addToCartFromWishlist();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wishListPage.waitPageLoad();
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'You have no items in your wish list.')]")).isDisplayed());
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wishListPage.openMiniCart();
//        Assert.assertTrue(driver.findElement(By.linkText("Бавовняний топ basic ")).isDisplayed());
    }

}
