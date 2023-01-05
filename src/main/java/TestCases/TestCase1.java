package TestCases;

import Pages.Profile;
import Pages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class TestCase1 {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");

        //Instantiating Login & Profile page using initElements()
        Login loginPg = PageFactory.initElements(driver, Login.class);
        Profile profilePg = PageFactory.initElements(driver, Profile.class);

        //Using the methods created in pages class to perform actions
        loginPg.loginAction("gunjankaushik", "Jimmy@123");
        profilePg.verifyUser("gunjankaushik");
        profilePg.logoutAction();

        driver.quit();
    }
}
