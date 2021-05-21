package Base;

import AdminPages.AdminLoginPage;
import AdminPages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class BaseTestAdmin {
    private WebDriver driver;
    protected AdminLoginPage adminLoginPage;
    protected DashboardPage dashboardPage;

    @BeforeClass
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://luxima.luxinten.com/admin");
        adminLoginPage = new AdminLoginPage(driver);
        adminLoginPage.setUsername("autotest");
        adminLoginPage.setPassword("lux123123");
        adminLoginPage.clickLoginButton();
        dashboardPage = new DashboardPage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
