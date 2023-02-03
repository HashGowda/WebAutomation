package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        WebElement btnEle = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(btnEle).perform();

        System.out.println("Button is double clicked");

        driver.switchTo().alert().accept();
        System.out.println("Double click alert accepted");

        driver.close();
    }
}
