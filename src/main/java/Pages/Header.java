package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    private WebDriver driver;
    By minicart = By.xpath("//a[@class='action showcart']");

    public void openMiniCart() {
        driver.findElement(minicart).click();
    }
}
