//package Browser;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class SeleniumWaits {
//
//    public static WebDriver driver;
//
//    public static void main(String[] args) throws InterruptedException {
//        SeleniumWaits seleniumWaits = new SeleniumWaits();
//        seleniumWaits.launch();
//        seleniumWaits.waitForElement(WebElement);
//    }
//        void launch() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//*[contains(@class,'oxd-button')]")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //implicit and explicit
//
//        WebElement dashBoard=driver.findElement(By.id("menu_dashboard_index"));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(dashBoard));
//        wait.until(ExpectedConditions.elementToBeClickable(dashBoard));
//    }
//
//    void waitForElement(WebElement element){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
//}
