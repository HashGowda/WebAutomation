package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQA {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Test");
        Thread.sleep(3000);

        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("User");
        Thread.sleep(2000);

        driver.findElement(By.id("userEmail")).sendKeys("Testuser@gmail.com");
        Thread.sleep(2000);


        WebElement pageHeader=driver.findElement(By.className("main-header"));
        String header=pageHeader.getText();
        System.out.println("Page Header : "+header);

        WebElement dob=driver.findElement(By.xpath("//*[@*='dateOfBirthInput']"));
        String Dob=dob.getAttribute("value");
        System.out.println("DOB : "+Dob);

        WebElement address=driver.findElement(By.xpath("//*[@*='currentAddress']"));
        System.out.println("Current address : "+address.getAttribute("placeholder"));
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@*='userNumber']")).sendKeys("9845006829");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@*='currentAddress']")).sendKeys("Bengaluru");
        Thread.sleep(2000);

        WebElement button=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        button.click();
        System.out.println("File Uploaded Successfully");

        Thread.sleep(2000);

        driver.quit();

    }
}
