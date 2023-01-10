package FrameWorkC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    public WebDriver driver;
    CommonFunctions commonFunctions;

    public AdminPage(WebDriver driver){
        this.driver=driver;
        commonFunctions = new CommonFunctions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Admin']")
    WebElement adminTab;

    @FindBy(xpath = "(//*[contains(@class,'oxd-input--active')])[2]")
    WebElement Username;

    @FindBy(xpath = "(//*[contains(@class,'oxd-select-text-input')])[1]")
    WebElement userRole;

    @FindBy(xpath = "//*[@placeholder='Type for hints...']")
    WebElement empName;

    @FindBy(xpath = "(//*[contains(@class,'oxd-select-text-input')])[2]")
    WebElement status;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement search;

    @FindBy(xpath = "(//*[contains(@class,'oxd-checkbox-wrapper')])[2]")
    WebElement radioBtn;

    public void navigateToAdmin(){
        commonFunctions.waitAndClick(adminTab);
    }

    public void enterDetails(){
        commonFunctions.sendKeys(Username,"Anthony.Nolan");
        commonFunctions.selectDropdown(userRole,"ESS");
        commonFunctions.sendKeys(empName,"Anthony Nolan");
        commonFunctions.selectDropdown(status, "Enabled");
    }

    public void clickSearch(){
        commonFunctions.waitAndClick(search);
    }

    public void clickRadioBtn(){
        commonFunctions.waitAndClick(radioBtn);
    }

}
