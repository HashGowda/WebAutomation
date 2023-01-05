package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class BrowserStackSignUpPage {

    WebDriver driver;

    @FindBy(className = "heading")
    WebElement Header;

    @FindBy(id = "user_full_name")
    WebElement userName;

    @FindBy(id = "user_email_login")
    WebElement businessEmail;

    @FindBy(id = "user_password")
    WebElement password;

    public BrowserStackSignUpPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyHeader(){
        String getHeaderText = Header.getText().trim();
        Assert.assertEquals("Create a Free Account ", getHeaderText);
    }

    public void enterFullName(String arg1){
        userName.sendKeys(arg1);
    }

    public void enterBusinessEmail(String arg2){
        businessEmail.sendKeys(arg2);
    }

    public void enterPassword(String arg3){
        password.sendKeys(arg3);
    }
}
