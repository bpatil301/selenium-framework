package stepDefinitions;

import Base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
    LoginPage loginPage;

    @Given("user is on Login Page")
    public void user_is_on_login_page() {
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("user enters {string} and {string}")
    public void user_enters_credientials(String username.String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("user should see Home Page")
    public void user_should_see_home_page() {
        //Validate home page
        utils.log("Successfully logged in");
        utils.takeScreenshot("HomePage");
    }
}


}
