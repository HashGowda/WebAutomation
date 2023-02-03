package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        String tabID = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.zomato.com/");
        driver.switchTo().window(tabID);
        System.out.println("Tab numbers : "+driver.getWindowHandles().size());

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()){
            System.out.println("Tab id : "+windowHandle);
        }

        driver.quit();
    }
}
