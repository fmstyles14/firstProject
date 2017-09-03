package StepDefitions;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by OHLAR on 7/22/2017.
 */
public class LoginStep {

    WebDriver driver;


    public LoginStep(){
        this.driver = Hooks.driver;
    }

   @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        driver.get("https://www.heroku.com/login");
    }

   /*@When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.loginDetails("go2automationclass@gmail.com","Pass2016");*/

   @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
   public void i_enter_my_and(String username, String passwd) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       LoginPage loginPage= new LoginPage(driver);
       loginPage.loginDetails(username, passwd);

   }


   @When("^i click on login button$")
    public void i_click_on_login_button() throws Throwable {

        LoginPage loginPage= new LoginPage(driver);
        loginPage.clickLogin();

    }

   @Then("^I am able to login successfully$")
    public void i_am_able_to_login_successfully() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.isLoggedIn("Getting Started with Heroku");

    }

    @Then("^I am Unable to login successfully$")
    public void i_am_Unable_to_login_successfully() throws Throwable {
       LoginPage loginPage= new LoginPage(driver);
       loginPage.isNotLoggedIn();

    }
}
