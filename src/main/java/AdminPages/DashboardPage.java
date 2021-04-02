package AdminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private WebDriver driver;
    private By h1Title = By.cssSelector("h1.page-title");
    private By customerMenu = By.cssSelector("#menu-magento-customer-customer");
    private By AllCustomers = By.xpath("//span[text()='All Customers']");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }
    public String getTitle(){
        return driver.findElement(h1Title).getText();

    }
    public CustomerGrid menuNavigation(){
        driver.findElement(customerMenu).click();
        new WebDriverWait(driver, 1500)
                .until(ExpectedConditions.elementToBeClickable(AllCustomers)).click();
        return new CustomerGrid(driver);}
}
