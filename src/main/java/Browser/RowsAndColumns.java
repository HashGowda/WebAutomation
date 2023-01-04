package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RowsAndColumns {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(2000);

        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of columns : " +col.size());

        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        System.out.println("No of rows : " +row.size());
        Thread.sleep(2000);
        driver.close();
    }
}
