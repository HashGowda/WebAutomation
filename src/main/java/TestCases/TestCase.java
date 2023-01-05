package TestCases;

import PageObjectModel.HomePage;
import PageObjectModel.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

    WebDriver driver;
    Login objLogin;
    HomePage objHomePage;

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        Thread.sleep(3000);
    }

    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objHomePage = new HomePage(driver);

        //Verify login page title
        String loginPageTitle = objLogin.getTitleText();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        //Login to application
        objLogin = new Login(driver);

        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
}
