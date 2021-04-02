package AccountTest;

import Base.BaseTest;
import Base.BaseTestAccount;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.WishListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddToWishListTest extends BaseTest {
    String itemName;

    @Test(priority = 1, description = "add to wishlist from product page (guest Customer) and than try to remove ")
    public void wishList() {

        ProductPage productPage = homePage.goToProduct();
        itemName = productPage.getName();
        LoginPage loginPage = productPage.addToWishGuest();
        loginPage.setPassword("asdASD321321");
        loginPage.setUsername("auto.test@luxinten.com");
        WishListPage wishListPage = loginPage.clickLoginAfterWishAdding();
        wishListPage.removeFromWish(itemName);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class=\"product-item-link\" and contains(text(),\"" + itemName +"\")]")).isDisplayed());
    }
//    @Test(priority = 2, description = "remove from wishlist")
//    public void removeFromWishlist() {
//
//    }
}