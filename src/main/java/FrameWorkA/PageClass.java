package FrameWorkA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
    public WebDriver driver;
    public CommonFunctions commonFunctions;

    public PageClass(WebDriver driver){
        this.driver=driver;
        commonFunctions=new CommonFunctions(driver);
    }

    public void login(){
        commonFunctions.sendKeys(driver.findElement(By.id("txtUsername")), "Admin");
        commonFunctions.sendKeys(driver.findElement(By.id("txtPassword")), "admin123");
        commonFunctions.waitAndClick(driver.findElement(By.id("btnLogin")));
    }
}
