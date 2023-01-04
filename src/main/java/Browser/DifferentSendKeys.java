package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentSendKeys {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(3000);

        //Javascript sendkeys
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='Javascript sendkeys';", searchBox);
        Thread.sleep(3000);
        searchBox.clear();
        Thread.sleep(3000);

        //Normal selenium sendkeys
        searchBox.sendKeys("Normal selenium sendkeys");
        Thread.sleep(3000);
        searchBox.clear();

        //Actions class sendkeys
        Actions actions=new Actions(driver);
        actions.sendKeys(searchBox,"Actions class sendkeys").perform();
        Thread.sleep(3000);
        searchBox.clear();

        //Javascript click
        WebElement element=driver.findElement(By.id("glow-ingress-line2"));
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        driver.quit();
    }
}
