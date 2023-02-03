package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {
    public WebDriver driver;

    void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");
        Thread.sleep(3000);
    }

    void selectDateBySelectClass(String dayData, String monthData, String yearData) throws InterruptedException {
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        selectFromDropDown(month, monthData);
        Thread.sleep(3000);
        selectFromDropDown(year,yearData);
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='" + dayData + "']"));
        System.out.println("//div[contains(@class,'react-datepicker__day') and text()='" + dayData + "']");
        day.click();
        String selectedDate = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        System.out.println("Selected date is "+selectedDate);
    }

    void selectFromDropDown(WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    void selectDate(String dayValue, String monthValue, String yearValue) throws InterruptedException {
        driver.findElement(By.id("dateAndTimePickerInput")).click();
        WebElement month = driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']"));
        month.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='react-datepicker__month-option' and text()='" + monthValue + "']")).click();
        WebElement year = driver.findElement(By.xpath("//div[@class='react-datepicker__year-read-view']"));
        year.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='react-datepicker__year-option' and text()='" + yearValue + "']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker' and text()='" +dayValue+ "')]")).click();
        Thread.sleep(2000);
        String dateAndTime = driver.findElement(By.id("dateAndTimePickerInput")).getAttribute("value");
        System.out.println("Date and Time is "+dateAndTime);
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        DatePicker2 dp = new DatePicker2();
        dp.launch();
        dp.selectDateBySelectClass("27", "January", "1994");
        dp.selectDate("16", "February", "1998");
    }
}