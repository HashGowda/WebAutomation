package PageObjectModel;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    By userName = By.name("uid");
    By password = By.name("password");
    By titleText = By.className("barone");
    By loginButton = By.name("btnLogin");

    public Login(WebDriver driver){
        this.driver=driver;
    }

    //Set user name in textbox
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    //Get the title of Login Page
    public String getTitleText(){
        return driver.findElement(titleText).getText();
    }

    public void login(String strUserName, String strPassword){
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLoginButton();
    }
}
