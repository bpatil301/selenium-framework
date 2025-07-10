package Base;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Utils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Utils;

public class BaseTest {
    public WebDriver driver;
    public Utils utils;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://yoururl.com");
        utils = new Utils(driver);
        loginPage =new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        {
            if (result.getStatus() == ITestResult.FAILURE) {
                utils.getScreenshot(result.getName());
            }
            if (driver != null)
                driver.quit();
        }


    }

    @Test
    public void testLogin()
    {
        LoginPage loginPage = new LoginPage(driver);
        utils.log("Opening Login page");
        driver.get("https://example.com");
        utils.log("Entering Username");
        loginPage.enterUsername("testuser");
        utils.log("Entering Password");
        loginPage.enterPassword("password123");
        utils.log("Clicking Login");
        loginPage.clickLogin();
        utils.takeScreenshot("AfterLogin");
        utils.log("Page Title after login:"+loginPage.getPageTitle());

        //HomePage usage
        HomePage homePage = new HomePage(driver);
        String welcomeText = homePage.getWelcomeMessage();
        utils.log("Welcome Message:"+welcomeText);
        utils.takeScreenshot("HomePage_"+username);

        //Optionally logout
        homePage.clcickLogout();
        utils.log("logged out sucessfully.");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
