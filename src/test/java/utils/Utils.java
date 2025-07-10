
package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Utils {

 WebDriver driver;
 public Utils(WebDriver driver) {
 this.driver = driver;
 }
 // Screenshot Method
 public String getScreenshot(String testName) {
 TakesScreenshot ts = (TakesScreenshot) driver;
 File source = ts.getScreenshotAs(OutputType.FILE);
 String destination = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
 try {
 FileUtils.copyFile(source, new File(destination));
 } catch (IOException e)
 {
     e.printStackTrace();
 }
 return destination;
 }

 // Explicit Wait Method
 public WebElement waitForElement(By locator, int timeOutInSeconds) {
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
 }
}
