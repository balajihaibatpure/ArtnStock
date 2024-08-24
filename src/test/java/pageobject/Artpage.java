package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Artpage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/art-home']")
    private WebElement artPageLink;

    @FindBy(xpath = "(//div[@class='row-span-4 rounded-2xl group overflow-hidden'])[1]")
    private WebElement firstImage;
    
    @FindBy(xpath = "//button[normalize-space()='See All Subjects']")
    private WebElement clickonsee;
    
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/artnstockimg/image/upload/v1719495044/artnstock/e3vl6nhjqjl7gbocswm5.jpg']")
    private WebElement clickonPrintableWallArt;
    
    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement selectitem;
    
    @FindBy(xpath ="//div[contains(@class,'mt-[23px] flex gap-[8px] mb-[7px]')]//button[contains(@class,'px-[20px] h-[40px] border-[2px] border-[#333333] hover:border-[black] flex items-center rounded-3xl text-sm14 text-[#333333] hover:text-[black] font-medium')][normalize-space()='Add to Cart']")
    private WebElement enteroncart;
    
    public Artpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnArtPage() {
        artPageLink.click();
    }

    public void selectPhoto() {
        firstImage.click();
    }

    public void seeAll() {
        clickonsee.click();
    }

    public void clickOnPrintableWallArt() {
        clickonPrintableWallArt.click();
    }

    public void selectItem() throws InterruptedException {
        // Create a Select object for the dropdown
        Select select = new Select(selectitem);

        // Verify if multiple selections are allowed
        if (select.isMultiple()) {
            // Select options by value
            select.selectByValue("4");
            select.selectByValue("5");  // Assuming you want to select another option with value "5"
        } else {
            System.out.println("The dropdown does not support multiple selections.");
        }

        // Optional: Pause to observe the selections (or better use WebDriverWait for dynamic waits)
        Thread.sleep(3000);
    }

    public void addToCart() {
        enteroncart.click();
    }

	public void clickOnArtPage1() {
		// TODO Auto-generated method stub
		
	}

	public void seeAll1() {
		// TODO Auto-generated method stub
		
	}
}
