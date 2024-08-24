package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.Photos;
import io.cucumber.java.en.Then;

public class Steps {
    private WebDriver driver;
    private Photos photos;

    @Given("User is on the Artnstock website")
    public void user_is_on_the_artnstock_website() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe ");
        driver = new ChromeDriver();
        driver.get("http://artnstock.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("User clicks on the photo section")
    public void user_clicks_on_the_photo_section() throws InterruptedException {
        photos = new Photos(driver);
        Thread.sleep(2000);
        photos.clickOnPhotos();
    }

    @Then("User is redirected to the login page")
    public void user_is_redirected_to_the_login_page() {
        // Assuming login page detection logic
    }

    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) throws InterruptedException {
        photos.enterUsername(username);
        Thread.sleep(2000);
        photos.enterPassword(password);
        Thread.sleep(2000);
        photos.clickLoginButton();
    }

    @Then("User should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
        // Assuming successful login detection logic
    	photos.clickLoginButton();
    }

    @Then("User should be on the photo section page")
    public void user_should_be_on_the_photo_section_page() {
        // Assuming photo section page detection logic
    }
    
//    @When("User clicks on the photo section")
//    public void user_clicks_on_the_photo_section() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User is redirected to the login page")
//    public void user_is_redirected_to_the_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User logs in with username {string} and password {string}")
//    public void user_logs_in_with_username_and_password(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User should be successfully logged in")
//    public void user_should_be_successfully_logged_in() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User should be on the photo section page")
//    public void user_should_be_on_the_photo_section_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
   }

