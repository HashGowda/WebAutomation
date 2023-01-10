package FrameWorkC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    CommonFunctions commonFunctions;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        commonFunctions = new CommonFunctions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//*[contains(@class, 'oxd-button')]")
    WebElement loginBtn;

    public void Login(){
        commonFunctions.sendKeys(userName,"Admin");
        commonFunctions.sendKeys(password,"admin123");
        commonFunctions.waitAndClick(loginBtn);
    }
}
