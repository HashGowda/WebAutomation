package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        //To take a full screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Image.png"));

        //To take a screenshot of small element
        WebElement element = driver.findElement(By.id("meta"));
        File scrnFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrnFile, new File("Screenshot.png"));
        driver.quit();
    }
}
