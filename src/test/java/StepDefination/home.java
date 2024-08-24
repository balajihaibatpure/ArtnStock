package StepDefination;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageobject.Homepage;

public class home {
	private WebDriver driver;
    private Homepage homepage;
	    @Given("User is on the Artnstock webpage")
	    public void user_is_on_artnstock_webpage() throws Exception {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
	        driver = new ChromeDriver();
	        Thread.sleep(2000);
	        driver.get("http://artnstock.com/");
	        driver.manage().window().maximize();
	         homepage= new Homepage(driver);
	    }

	    @And("User click on artnstock home page")
	    public void user_clicks_artnstock_homepage() throws InterruptedException {
	        //homepage = new Homepage(driver);
	        Thread.sleep(2000);
	       homepage.clickOnhomepage();
	       
	    }

	    @And("User navigates to the {string} section")
	    public void user_navigates_to_section(String section) throws InterruptedException {
	       Thread.sleep(2000);
	    	homepage.clickonphoto();
	        
	    }

//	    @And("User selects the {string} option for digital art prints")
//	    public void user_selects_option_for_digital_art_prints(String option) {
//	        // Implementation to select the specified option for digital art prints
//	    homepage.clickonphoto2();
//	    }

	    @And("User selects the following options:")
	    public void user_selects_the_following_options(DataTable dataTable) {
	     Map<String, String> map = dataTable.asMap(String.class,String.class); 
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    System.out.println("user enter the art print type"+map.get("Art Print Type"));
	    System.out.println("user enter of print orientation"+map.get("Print Orientation"));
	    System.out.println("user enter the print size"+map.get("Print Size"));
	    
	    }
	    
	    

	    @When("User adds the selected digital art print to the cart")
	    public void user_adds_selected_digital_art_print_to_cart() {
	       homepage.addcart();
	    }

	    @And("User proceeds to checkout")
	    public void user_proceeds_to_checkout() {
	       
	    }

	    @And("User selects {string} as the payment method")
	    public void user_selects_payment_method(String paymentMethod) {
	        // Implementation to select the payment method
	    }
	    @When("User provides the following credit\\/debit card information:")
	    public void user_provides_the_following_credit_debit_card_information(io.cucumber.datatable.DataTable dataTable) {
	        
	        throw new io.cucumber.java.PendingException();
	    }


	    @And("User provides the following contact information:")
	    public void user_provides_contact_information(DataTable dataTable) {
	        // Implementation to provide contact information
	    }

	    @And("User provides the following shipping address:")
	    public void user_provides_shipping_address(DataTable dataTable) {
	        // Implementation to provide shipping address
	    }

	    @And("User continues to checkout")
	    public void user_continues_to_checkout() {
	        // Implementation to continue to checkout
	    }

	    @And("User click on complete order")
	    public void user_clicks_complete_order() {
	        // Implementation to click complete order
	    }

	    @And("user click on card")
	    public void user_clicks_on_card() {
	        // Implementation to click on card
	    }

	    @And("User click on pay now")
	    public void user_clicks_on_pay_now() {
	        // Implementation to click on pay now
	    }

	    @Then("User should see the checkout confirmation page")
	    public void user_should_see_checkout_confirmation_page() {
	        // Implementation to verify the checkout confirmation page
	    	
	    }
	    @Then("User selects the {string} option for digital art prints")
	    public void user_selects_the_option_for_digital_art_prints(String string) {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }

	}




