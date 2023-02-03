package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NewLogin {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.flipkart.com/");
        //Actions actions=new Actions(driver);
      //  Action sendEsc=actions.sendKeys(Keys.ESCAPE).build();
        //sendEsc.perform();
        driver.manage().window().maximize();
        driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
        driver.findElement(By.id("q")).sendKeys("Mobiles");
       // driver.findElement(By.className("_1_3w1N")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.quit();
    }
}
