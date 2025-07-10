package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Utils;


    public class BestTest extends tests.BestTest {

        LoginPage loginPage;
        HomePage homePage;

        @DataProvider(name = "loginData")
        public Object[][] getLoginData()
        {
            return new  Object[][]
                    {
                            {"testuser1","password123"},
                            {"testuser2","password456"},
                            {"testuser2","password789"}
                    };
        }


        @Test(dataProvider = "logindata")
        public void testValidLogin(String username, String password)

        {
            LoginPage loginPage = new LoginPage(driver);
            utils.log("Opening Login page");
            driver.get(("https://example.com");
            utils.log("Entering Username"+username);
            loginPage.enterUsername("testuser");
            utils.log("Entering Password"+password);
            loginPage.enterPassword("password123");
            utils.log("Clicking Login");
            loginPage.clickLogin();
            utils.takeScreenshot("AfterLogin"+username);
            utils.log("Page Title after login:"+loginPage.getPageTitle());

            //HomePage Object
            HomePage homePage = new HomePage(driver);
            String welcomeMessage = homePage.getWelcomeMessage();
            utils.log("Welcome Message:"+welcomeMessage);
            utils.takeScreenshot("HomePage_"+username);

            //Optionally logout
            homePage.clcickLogout();
            utils.log("logged out sucessfully.");
        }

    }

}
