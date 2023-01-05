package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class BrowserStackHomePage {

    WebDriver driver;

     @FindBy(xpath = "//h1")
    WebElement Header;

     @FindBy(xpath = "//*[@id='signupModalButton']")
    WebElement getStarted;

     public BrowserStackHomePage(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver, this);
     }

     public void verifyHeader(){
         String getHeaderText= Header.getText();
         Assert.assertEquals("App & Browser Testing Made Easy ", getHeaderText);
     }

     public void clickOnGetStarted(){
         getStarted.click();
     }
}
