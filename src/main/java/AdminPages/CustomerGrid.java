package AdminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerGrid {
    private WebDriver driver;
    private By Filter = By.xpath("//button[text()=\"Filters\"]");
    private By EmailInput = By.xpath("//input[@name='email']");
    private By loader = By.xpath("//div[@style=\"display: none;\" and contains(@data-component,\"customer_listing\")]");
    private By ActiveFilters = By.xpath("//span[text()=\"Active filters:\"]");
    private By ClearingFilters = By.xpath("//button[text()=\"Clear all\"]");
    private By ApplyFilters = By.xpath("//span[text()=\"Apply Filters\"]/parent::button");
    private By checkbox = By.xpath("//label[@class=\"data-grid-checkbox-cell-inner\"]");
    private By ActionsList = By.cssSelector("button.action-select");
    private By DeleteItem = By.xpath("//span[text()=\"Delete\"]/parent::li");
    private By OKPopupButton = By.xpath("//span[text()=\"OK\"]/parent::button");
    public CustomerGrid(WebDriver driver){
        this.driver = driver;
    }

    public void ClearFilters() {
        //check if there is active filter already
        if (driver.findElement(ActiveFilters).isDisplayed()) {
            driver.findElement(ClearingFilters).click();
        }
    }
    public void FilterByEmail(String Email){
        //open filter panel
        driver.findElement(Filter).click();
        driver.findElement(EmailInput).sendKeys(Email);
    }
    public void ApplyFilters() {
        driver.findElement(ApplyFilters).click();
    }

    public void Waiting() {
        //wait until grid is loaded
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .presenceOfElementLocated(loader));
    }

    public void SelectingCustomer() {driver.findElement(checkbox).click();}
    public void DeletingCustomer(){
        driver.findElement(ActionsList).click();
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .elementToBeClickable(DeleteItem)).click();
        new WebDriverWait(driver, 1000).until(ExpectedConditions
                .elementToBeClickable(OKPopupButton)).click();;
    }
}
