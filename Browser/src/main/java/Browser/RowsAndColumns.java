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

        //Fetch rows and columns
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of columns : " +col.size());

        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        System.out.println("No of rows : " +row.size());
        Thread.sleep(2000);

        //Fetch cell value
        WebElement table = driver.findElement(By.className("dataTable"));

        WebElement tableRow = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[12]"));
        WebElement tableRowText = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[11]/td[4]"));
        String rowText = tableRow.getText();
        System.out.println("Twelfth row of the table : " + rowText);
        Thread.sleep(2000);

        WebElement cellIneed = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[12]/td[3]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is : "+valueIneed);
        Thread.sleep(5000);

        driver.close();
    }
}