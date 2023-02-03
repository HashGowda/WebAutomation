package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.toolsqa.com/";
        driver.get(url);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@class,'btn-block')]")).click();

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().to(url);

        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.close();
    }
}
