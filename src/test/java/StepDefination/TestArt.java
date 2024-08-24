package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Artpage;

public class TestArt {
    private WebDriver driver;
    private Artpage artpage;

    @Given("user landed on artnstock main page")
    public void user_landed_on_artnstock_main_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\PomaWithCucumberFramework\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("http://artnstock.com/");
        driver.manage().window().maximize();
        artpage = new Artpage(driver);
        
    }

    @When("User click on art page")
    public void user_click_on_art_page() throws InterruptedException {
    	Thread.sleep(3000);
        artpage.clickOnArtPage();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        // Scroll down a little bit
//        js.executeScript("window.scrollBy(50, 100);");
    }
    @Then("Click on seeall")
    public void click_on_seeall() throws InterruptedException {
    	Thread.sleep(3000);
       artpage.seeAll();
        
    }

    

    

    @When("user again click on Printable Wall Art frist photo")
    public void user_again_click_on_printable_wall_art_frist_photo() throws InterruptedException {
    	Thread.sleep(5000);
        artpage.clickOnPrintableWallArt();
        
    }
    @Then("add two product in item section")
    public void add_two_product_in_item_section() throws InterruptedException {
        // Perform some action to navigate to or display the item section
        artpage.selectItem();  // Ensure this method does what is intended

        // Pause for the item section to be ready (you may need to use WebDriverWait instead)
        Thread.sleep(3000);

        // Locate the multi-select dropdown
        WebElement dropdown = driver.findElement(By.xpath("(//input[@type='text'])[4]"));  // Use the correct XPath or locator

        // Create a Select object for the dropdown
        Select select = new Select(dropdown);

        // Verify if multiple selections are allowed
        if (select.isMultiple()) {
            // Select options by value
            select.selectByValue("4");
            select.selectByValue("5");  // Assuming you want to select another option with value "5"
        } else {
            System.out.println("The dropdown does not support multiple selections.");
        }

      
    }

        
        
        //(//input[@type='text'])[4]
        
        

    @Then("User Click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        artpage.addToCart();
    }
//    @Then("user click on frist photo")
//    public void user_click_on_frist_photo() {
//        artpage.clickOnartpage();
//    }


    @Then("I validate the outcomes")
    public void i_validate_the_outcomes() {
        System.out.println("see the outcomes");
    }
    
    
}
