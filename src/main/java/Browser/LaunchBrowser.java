package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LaunchBrowser {

        public static void main(String[] args) {

           // String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
             //       File.separator + "resources" + File.separator + "chromedriver";

            System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\WebAutomation\\Browser\\src\\main\\resources\\chromedriver");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.youtube.com");
            driver.manage().window().maximize();
           // driver.get("https://chromedriver.chromium.org/downloads");
        }
    }
