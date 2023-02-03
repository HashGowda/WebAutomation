package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AmazonFramework {

    static WebDriver driver;

    static void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        search();
    }

    static void search() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
        System.out.println("Searched successfully");
        Thread.sleep(2000);
        clickOnItem();

        //To print the suggestion list

//        List<WebElement> suggList = driver.findElements(By.xpath("//*[@*='autocomplete-results-container']"));
//        for (WebElement list:suggList){
//            System.out.println(list.getText());
//        }
//        Thread.sleep(3000);
    }

    static void clickOnItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='autocomplete-results-container']")).click();
        System.out.println("Clicked on the item successfully");
        Thread.sleep(3000);
        navigateToClickedItem();
    }

    static void navigateToClickedItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='a-size-medium a-color-base a-text-normal']"));
        System.out.println("Navigated to clicked item");
        Thread.sleep(3000);
        checkBox();

        //To print the searched item list

//        List<WebElement> phoneList = driver.findElements(By.xpath("//*[@*='a-size-medium a-color-base a-text-normal']"));
//        for (WebElement list:phoneList){
//            System.out.println(list.getText());
//        }
//        Thread.sleep(3000);
    }

    static void screenShot() throws InterruptedException, IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Image.png"));
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.id("nav-logo-sprites"));
        File scrnFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrnFile, new File("Element.png"));
        System.out.println("Screenshot taken successfully");
        Thread.sleep(2000);
    }

    static void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //To scrolldown the page by 1000 pixel vertically

//        js.executeScript("window.scrollBy(0,1000)");

        //To scrolldown the page till the element is visible

//        WebElement element = driver.findElement(By.xpath("(//*[@*='a-size-medium-plus a-color-base'])[2]"));
//        js.executeScript("arguments[5].scrollIntoView(): ", element);

        //To scrolldown the page till the end

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        System.out.println("Scrolled down successfully");
        Thread.sleep(5000);
    }

    static void checkBox() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@*='a-icon a-icon-checkbox'])[1]")).click();
        System.out.println("Check box clicked successfully");
        Thread.sleep(3000);
        setPriceRange();
    }

    static void setPriceRange() throws InterruptedException {
        driver.findElement(By.id("low-price")).sendKeys("5000");
        Thread.sleep(2000);
        driver.findElement(By.id("high-price")).sendKeys("20000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='a-button-input']")).click();
        System.out.println("The Price range has been set successfully");
        Thread.sleep(3000);
        radioButton();
    }

    static void clickOnNext() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")).click();
        System.out.println("Clicked on next successfully");
        Thread.sleep(2000);
    }

    static void radioButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='icp-nav-link-inner']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@*='a-icon a-icon-radio'])[5]")).click();
        System.out.println("Radio button clicked successfully");
        Thread.sleep(2000);

        WebElement cancelBtn = driver.findElement(By.id("icp-cancel-button"));
        cancelBtn.click();
        System.out.println("Clicked on cancel button successfully");
        Thread.sleep(2000);
        clickOnAll();
    }

    static void clickOnAll() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='hm-icon nav-sprite']")).click();
        Thread.sleep(2000);
        System.out.println("Clicked an All button successfully");
        driver.findElement(By.xpath("//*[text()='Mobiles, Computers']")).click();
        Thread.sleep(2000);
        System.out.println("Clicked on Inside button successfully");
        driver.findElement(By.xpath("//*[text()='Power Banks']")).click();
        Thread.sleep(2000);
        System.out.println("Clicked on Power Banks successfully");
        clickOnElectronics();
    }

    static void clickOnElectronics() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Mobile holders & more']")).click();
        System.out.println("Clicked on mobile holders & more successfully");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//*[@*='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
//        System.out.println("Clicked on item successfully");
//        Thread.sleep(3000);
    }

    static void dropDown(){
        WebElement quantity = driver.findElement(By.xpath("//*[@id='quantity']"));
        //*[@class='a-native-dropdown a-declarative']
        quantity.click();
        System.out.println("Clicked dropdown successfully");
        Select Dropdown = new Select(quantity);
        Dropdown.selectByValue("4");
        System.out.println("Quantity has been selected successfully");
    }

    static void handleWindow() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@*='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
        Thread.sleep(2000);
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> itr = handle.iterator();
        String mainTab = itr.next();
        String subTab = itr.next();
        driver.switchTo().window(subTab);
        System.out.println("Switched to Subtab successfully");
        Thread.sleep(2000);

        //code to execute subtab
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(5000);

        //code to execute maintab
        driver.switchTo().window(mainTab);
        System.out.println("Switched to Maintab successfully");
        Thread.sleep(5000);
    }
    static void tearDown(){
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        launch();
//        search();
//        clickOnItem();
//        navigateToClickedItem();
//        screenShot();
//        checkBox();
//        setPriceRange();
//        scrollDown();
//        clickOnNext();
//        radioButton();
//        clickOnAll();
//        clickOnElectronics();
//        dropDown();
        handleWindow();
        tearDown();
    }
}
