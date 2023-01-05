package TestCases;

import Pages.BrowserStackHomePage;
import Pages.BrowserStackSignUpPage;
import Pages.Profile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserStackSetup {

    String path = "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe";
    WebDriver driver;
    BrowserStackHomePage objBrowserStackHomePage;
    BrowserStackSignUpPage objBrowserStackSignUpPage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/");
    }

    @Test(priority = 1)
    public void navigateToHomePage(){
        objBrowserStackHomePage = new BrowserStackHomePage(driver);
       // objBrowserStackHomePage.verifyHeader();
        objBrowserStackHomePage.clickOnGetStarted();
    }

    @Test(priority = 2)
    public void enterUserDetails(){
        objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
      //  objBrowserStackSignUpPage.verifyHeader();
        objBrowserStackSignUpPage.enterFullName("Testuser");
        objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
        objBrowserStackSignUpPage.enterPassword("TestUserPassword");
    }
}
