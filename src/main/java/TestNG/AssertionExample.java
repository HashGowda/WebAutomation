package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {

    public WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    void logoTest(){
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not matched on the page");
    }

    @Test
    void homePageTitle(){
        String Title=driver.getTitle();
        Assert.assertEquals("ToolsQA", Title,"Title is not matched");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
