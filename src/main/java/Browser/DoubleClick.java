package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(3000);

        //Double click the button to launch an alertbox
        Actions actions = new Actions(driver);
        WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(click).perform();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: "+alert.getText());
        alert.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
