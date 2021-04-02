package Base;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestAccount {
    protected WebDriver driver;
    protected AccountPage accountPage;
    protected LoginPage loginPage;
    @BeforeClass
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://luxima.luxinten.com/customer/account/login/");
        loginPage = new LoginPage(driver);
        loginPage.setUsername("auto.test@luxinten.com");
        loginPage.setPassword("asdASD321321");
        loginPage.clickLoginButton();
        accountPage = new AccountPage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
