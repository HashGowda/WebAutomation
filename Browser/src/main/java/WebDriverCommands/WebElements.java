package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.SortedMap;

public class WebElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@class,'btn-block')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Testuser");

        Thread.sleep(2000);
        WebElement lName = driver.findElement(By.name("lastName"));
        boolean status = lName.isDisplayed();
        System.out.println("Status is "+status);

        Thread.sleep(2000);
        boolean status1 = driver.findElement(By.id("email")).isEnabled();
        System.out.println("Status1 is "+status1);

        Thread.sleep(2000);
        boolean status2 = driver.findElement(By.id("country")).isSelected();
        System.out.println("Status2 is "+status2);

        Thread.sleep(2000);
        WebElement size = driver.findElement(By.id("code"));
        Dimension dimension = size.getSize();
        System.out.println("Height : "+ dimension.height + " Width : "+ dimension.width);

        Thread.sleep(2000);
        String tagName = driver.findElement(By.id("mobile")).getTagName();
        System.out.println("Tag name is "+tagName);

        Thread.sleep(2000);
        WebElement attribute = driver.findElement(By.name("city"));
        String attValue = attribute.getAttribute("id");
        System.out.println("Attribute value is "+attValue);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Send']")).submit();
        System.out.println("Submitted successfully");

        Thread.sleep(2000);
        driver.quit();

    }
}
