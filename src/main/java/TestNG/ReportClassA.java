package TestNG;

import com.aventstack.extentreports.model.Report;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportClassA {

    @Test
    public void run(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Reporter.log("The browser 1 is opened in tab1");
        driver.manage().window().maximize();
        Reporter.log("The browse 1 is maximized in tab1");
        driver.get("https://www.google.co.in/");
        Reporter.log("The google website is opened in tab1");
        driver.findElement(By.className("gLFyf")).sendKeys("Intellij");
        Reporter.log("the data has been entered in tab1");
    }
}
