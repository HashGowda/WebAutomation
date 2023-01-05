package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.net.IDN;

public class Login {
    final WebDriver driver;


    //Constructor, as every page needs a Webdriver to find elements
    public Login(WebDriver driver){
        this.driver=driver;
    }


    //Locating the username text box
    @FindAll({
            @FindBy(id = "userName-wrapper"),
            @FindBy(id = "userName")
    })
    WebElement username;


    //Locating the password text box
    @FindBy(id = "password")
    WebElement password;


    //Locating Login Button
    @FindBy(id = "login")
    WebElement loginBtn;


    //Method that performs login action using the web elements
    public void loginAction(String userName, String Password){
        username.sendKeys(userName);
        password.sendKeys(Password);
        loginBtn.click();
    }
}
