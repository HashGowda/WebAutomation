package PumaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private WebElement loginLink = getDriver().findElement(By.xpath("//button[@data-test-id='account-button']"));
    private WebElement loginButton = getDriver().findElement(By.xpath("//*[text()='Login']"));
    private WebElement mobileNo = getDriver().findElement(By.xpath("//input[@data-test-id='auth-field-phoneNo']"));

    private WebElement OTP = getDriver().findElement(By.xpath("//button[@data-test-id='get-otp-btn']"));

    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getMobileNo(){
        return mobileNo;
    }

    public WebElement getOTP(){
        return OTP;
    }

    public void navigateTo(){
        loginLink.click();
    }
}
