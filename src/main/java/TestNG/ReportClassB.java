package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportClassB {

    @Test
    public void run(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Reporter.log("The browser 2 is opened in tab 2");
        driver.manage().window().maximize();
        Reporter.log("The browser 2 is maximized");
        driver.get("https://www.google.co.in/");
        Reporter.log("The google is opened in tab2");
        driver.findElement(By.className("gLFyf")).sendKeys("PyCharm");
        Reporter.log("The data has entered in tab2");
    }
}
