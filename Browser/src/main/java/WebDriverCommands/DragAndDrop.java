package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));

        WebElement to = driver.findElement(By.id("droppable"));

        builder.dragAndDrop(from, to).perform();

        String textTo = to.getText();

        if (textTo.equals("Dropped!")) {
            System.out.println("Pass: Source is dropped to target as expected");
        } else {
            System.out.println("Fail: Source couldn't be dropped as expected");
        }


        //Perform dragAndDropBy
        builder.dragAndDropBy(from, 100, 100).perform();

        System.out.println("Dropped");

        driver.close();
    }
}
