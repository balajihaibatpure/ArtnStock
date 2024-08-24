package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Photos {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='blackBtn mb-1']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@href='/photos-home']")
    private WebElement clickInput;

    public Photos(WebDriver driver) {
        this.driver = driver; 
         PageFactory.initElements(driver, this);
    }

    public void clickOnPhotos() {
        clickInput.click();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
