package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.youtube.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("search_query")).sendKeys("Hymn Cold Play");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}
