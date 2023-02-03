package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class AddScreenShot {

    ExtentReports extent;
    public WebDriver driver;

    @BeforeSuite
    public void setUp() {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("NewReport/spark.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Selenium Report");
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        extent.flush();
    }

    @BeforeClass
    public void launch(){
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void login() throws InterruptedException {
        ExtentTest test =extent.createTest("Sample Test");
//        driver.findElement(By.id("username")).sendKeys("Admin");
//        test.info("Username is entered");
//        driver.findElement(By.id("password")).sendKeys("admin123");
//        test.info("Password is entered");
//        driver.findElement(By.xpath("//*[contains(@class,'oxd-button')]")).click();
//        test.info("Login Button is clicked");
        Thread.sleep(3000);
//        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(getScreenShot()).build());
//        test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotAsBase64()).build());
        test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
    }

    public String getScreenShot() throws IOException {
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path= System.getProperty("user.dir")+"/ScreenShots/image.png";
        FileUtils.copyFile(file,new File(path));
        return path;
    }

    public String getScreenShotAsBase64() throws IOException {
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path= System.getProperty("user.dir")+"/ScreenShots/image.png";
        FileUtils.copyFile(file,new File(path));
        byte[] image= IOUtils.toByteArray(new FileInputStream(path));
        return Base64.getEncoder().encodeToString(image);

    }

    public String getBase64() {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }


    @AfterClass
    public void close(){
        driver.close();
    }
}