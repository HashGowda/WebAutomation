package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHover {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);

        WebElement mainItem = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
        actions.moveToElement(mainItem).perform();
        System.out.println("Done mouse hover on Main Item 2");

        WebElement subList = driver.findElement(By.xpath("//*[text()='SUB SUB LIST »']"));
        actions.moveToElement(subList).perform();
        System.out.println("Done mouse hover on Sublist item");

        WebElement subSubItem = driver.findElement(By.xpath("//*[text()='Sub Sub Item 1']"));
        actions.moveToElement(subSubItem).perform();
        System.out.println("Done mouse over on sub item");

        driver.close();
    }
}
