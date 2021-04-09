package AccountTest;

import Base.BaseTest;
import Base.BaseTestAccount;
import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToWishListTest extends BaseTestAccount {
    String itemName;
    @Test(priority = 1, description = "add to wishlist from product page (guest Customer) and than try to remove ")
    public void wishList() {
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = homePage.goToCategory();
        itemName = categoryPage.getName();
        categoryPage.addToWish();
        Boolean isPresent = driver.findElements(By.xpath("//a[@class=\"product-item-link\" and contains(text(),\"" + itemName +"\")]")).size() > 0;
        Assert.assertTrue(isPresent);
    }
}
