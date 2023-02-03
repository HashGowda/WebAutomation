package FrameWorkB;

import FrameWorkA.PageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

    public WebDriver driver;
    CommonFunctions commonFunctions;

    public MyInfoPage(WebDriver driver){
        this.driver=driver;
        commonFunctions = new CommonFunctions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='My Info']")
    WebElement myInfoTab;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "middleName")
    WebElement middleName;

    @FindBy(name = "lastName")
    WebElement lastName;

//    @FindAll({
//            @FindBy(name="firstName"),
//            @FindBy(xpath = "//*[text()='My Info']"),
//            @FindBy(name="middleName"),
//            @FindBy(name="lastName")
//    })
//    WebElement element;

    public void navigateToMyInfo(){
//        CommonFunctions commonFunctions = new CommonFunctions(driver);
        commonFunctions.waitAndClick(myInfoTab);
    }

    public void enterPersonalDetails(){
//        CommonFunctions commonFunctions = new CommonFunctions(driver);
        commonFunctions.sendKeys(firstName,"Test");
        commonFunctions.sendKeys(middleName,"User");
        commonFunctions.sendKeys(lastName,"Data");
    }
}

