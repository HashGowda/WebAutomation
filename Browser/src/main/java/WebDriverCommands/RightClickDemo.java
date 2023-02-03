package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(btnElement).perform();

        WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));
        elementOpen.click();

        driver.switchTo().alert().accept();
        System.out.println("Right click alert accepted");

        driver.close();
    }
}
