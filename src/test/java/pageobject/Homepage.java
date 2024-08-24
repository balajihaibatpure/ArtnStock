package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@class='mr-[32px] relative bottom-[3px] cursor-pointer']")
    private WebElement homepageElement;

    @FindBy(xpath = "//div[@class='row-span-4 rounded-2xl group overflow-hidden cursor-pointer']")
    private WebElement clickinputElement;

    @FindBy(xpath = "(//img[@class='rounded-2xl'])[1]")
    private WebElement selectandclickElement;

//    @FindBy(xpath = "//div[@class='w-[48px] h-[48px] rounded-[10px] bg-cover bg-center']")
//     private WebElement clickinputElement2;

    @FindBy(xpath = "//button[@id='headlessui-tabs-tab-:r4:']")
    private WebElement clickSizeElement;

    @FindBy(xpath = "(//*[name()='svg' and @width='48' and @height='48'])[7]")
    private WebElement selectOrientation;

    @FindBy(xpath = "(//*[@class='containerCheck text-[13px] text-primaryGray w-[119px]'])[2]")
    private WebElement selectvarticale;

    @FindBy(xpath = "(//*[@class='w-[11px] h-[11px]'])[1]")
    private WebElement plusebutton;

    @FindBy(xpath = "(//*[@class='px-[20px] h-[40px] border-[2px] border-[#333333] hover:border-[black] flex items-center rounded-3xl text-sm14 text-[#333333] hover:text-[black] font-medium'])[1]")
    private WebElement addcart;

    @FindBy(xpath = "(//*[@class='px-[20px] h-[40px] bg-primaryBlack flex items-center text-[#fff] rounded-3xl text-sm14 font-medium hover:bg-[#000]'])[1]")
    private WebElement shopnow;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnhomepage() {
        homepageElement.click();
    }

    public void clickonphoto() {
        clickinputElement.click();
    }

    public void clickonphoto2() {
        selectandclickElement.click();
    }

//    public void clickelement() {
//       clickinputElement2.click();
//    }

    public void size() {
        clickSizeElement.click();
    }

    public void orientation() {
        selectOrientation.click();
    }

    public void varticale() {
        selectvarticale.click();
    }

    public void addcartitem() {
        plusebutton.click();
    }

    public void addcart() {
        addcart.click();
    }

    public void shopnow() {
        shopnow.click();
    }

	public void selectOption1() {
	selectOption1();		
	}

	public void selectOption2() {
		// TODO Auto-generated method stub
		selectOption2();
	}

	public void selectPrintOrientation(String value) {
		// TODO Auto-generated method stub
		selectPrintOrientation(value);
	}

	public void selectArtPrintType(String value) {
		selectArtPrintType(value);
		
	}

	public void selectPrintSize(String value) {
		// TODO Auto-generated method stub
		selectPrintSize(value);
	}

	public void selectTopMatColour(String value) {
		// TODO Auto-generated method stub
		selectTopMatColour(value);
	}

	public void selectMaterialForPrint(String value) {
		// TODO Auto-generated method stub
		selectMaterialForPrint(value);
	}


}
