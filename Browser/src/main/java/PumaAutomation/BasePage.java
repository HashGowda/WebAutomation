package PumaAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    static WebDriver driver;

    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeDriver(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}

