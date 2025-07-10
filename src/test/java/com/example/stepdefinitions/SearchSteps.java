
package com.example.stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchSteps {

WebDriver driver;

 @Given("User is on Google Home Page")
 public void user_is_on_google_home_page() {
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

  ChromeOptions options = new ChromeOptions();
  options.setBinary("C:\\Program Files\\chrome-win64\\chrome.exe");

   driver = new ChromeDriver(options);

   //driver = new ChromeDriver();
 driver.get("https://www.google.com");
 }
 @When("User enters {string} in the search box")
 public void user_enters_in_the_search_box(String keyword) {
 driver.findElement(By.name("q")).sendKeys(keyword);
 }

 @When("User clicks on the search button")
 public void user_clicks_on_the_search_button() {
 driver.findElement(By.name("q")).submit();
 }

 @Then("Search results for {string} should be displayed")
 public void search_results_should_be_displayed(String keyword) {
 boolean resultsDisplayed = driver.getTitle().toLowerCase().contains(keyword.toLowerCase());
 if (!resultsDisplayed) {
 throw new AssertionError("Search results not displayed for: " + keyword);
 }
 driver.quit();
 }
}
