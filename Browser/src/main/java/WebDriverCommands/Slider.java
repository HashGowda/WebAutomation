package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Slider {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/slider/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(By.id("slider"));
        actions.moveToElement(slider, 50,0).perform();
        slider.click();
        System.out.println("Moved slider in horizontal direction");

        driver.close();
    }
}
