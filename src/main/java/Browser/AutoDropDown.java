package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//*[@*='LoginHeaderText']")).click();
//        Thread.sleep(2000);

//        driver.findElement(By.id("fromCity"));
//        WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
//        Thread.sleep(2000);
//        from.sendKeys("Chennai");
//        Thread.sleep(2000);
//        from.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(2000);
//        from.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);


        WebElement from=driver.findElement(By.id("fromCity"));
        Thread.sleep(2000);
        from.sendKeys("Bengaluru");
        Thread.sleep(2000);
        from.sendKeys(Keys.DOWN, Keys.ENTER);
        Thread.sleep(2000);

        WebElement to=driver.findElement(By.id("toCity"));
        Thread.sleep(2000);
        to.sendKeys("Delhi");
        Thread.sleep(2000);
        to.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(2000);
//        to.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
        driver.quit();
    }
}
