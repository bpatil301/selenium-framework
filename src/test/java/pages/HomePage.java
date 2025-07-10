package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Locators
    By WelcomeMessage = By.id("Welcome");
    By logoutBoutton = By.id("Logout");

    //Constructor
    public  HomePage(WebDriver driver)
    {
        this.driver =driver;
    }

      //Actions
    public String getWelcomeMessage()
    {
        return driver.findElement(WelcomeMessage).getText();
    }
    public void clcickLogout()
    {
        driver.findElement(logoutBoutton).click();
    }
}
