package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MyProject.MyFirstMavenProject.Pages.LoginPage1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepDef1 {

	WebDriver driver;
    LoginPage1 loginPage1;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage1 = new LoginPage1(driver);
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
    	loginPage1.enterUsername("tomsmith");
    	loginPage1.enterPassword("SuperSecretPassword!");
    }

    @When("Clicks on login button")
    public void clicks_on_login_button() {
    	loginPage1.clickLogin();
    }

    @Then("User should see the logout link")
    public void user_should_see_the_logout_link() {
        Assert.assertTrue(loginPage1.isLogoutDisplayed());
        driver.quit();
    }
}
