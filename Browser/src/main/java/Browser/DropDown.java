package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DropDown dropDown=new DropDown();
        dropDown.launchBrowser();
        dropDown.handleDropDown();
        dropDown.handleBySelectClass();
        dropDown.handleBySelectclass();
        dropDown.oldStyleText();
        dropDown.multiText();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
    }

    void handleDropDown() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Select Option']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Group 2, option 1']")).click();
        Thread.sleep(3000);
    }

    void handleBySelectClass() throws InterruptedException {
        WebElement element=driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(element);
        select.selectByVisibleText("Black");
        Thread.sleep(3000);
        select.selectByValue("2");
        Thread.sleep(3000);
        select.selectByIndex(6);
        Thread.sleep(3000);
    }

    void handleBySelectclass() throws InterruptedException {
        WebElement cars=driver.findElement(By.xpath("//*[@*='cars']"));
        Select Cars=new Select(cars);
        Cars.selectByVisibleText("Audi");
        Thread.sleep(3000);
    }

    void oldStyleText() throws InterruptedException {
        List<WebElement> list=driver.findElements(By.id("oldSelectMenu"));
        for(int i=0; i<list.size();i++){
            String Colours=list.get(i).getText();
            System.out.println("The colours list :\n"+Colours);
            Thread.sleep(3000);
        }
    }

    void multiText() throws InterruptedException {
        List<WebElement> car=driver.findElements(By.id("cars"));
        for(int j=0; j<car.size();j++){
            String carsList=car.get(j).getText();
            System.out.println("\nCars list is :\n"+carsList);
            Thread.sleep(3000);
        }
        driver.quit();
    }
}
