package pages;

import org.neo4j.annotations.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    //Locators
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login");

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
            //Actions
    public void enterUsername(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogin()
    {
        driver.findElement(loginButton).click();
    }
    Public String getPageTitle()
    {
        return driver.getTitle();
    }

}
