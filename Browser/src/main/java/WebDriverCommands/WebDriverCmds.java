package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCmds {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/";
        driver.get(url);

        String title = driver.getTitle();
        int titleLength = title.length();

        System.out.println("Title of the page is : "+title);
        System.out.println("Length of the title is : "+titleLength);

        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(url)){
            System.out.println("Verification successful - The correct url is opened");
        } else {
            System.out.println("Verification failed - An incorrect url is opened");

            System.out.println("Actual URL is : "+actualUrl);
            System.out.println("Expected URL is : "+url);
        }

        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();

        System.out.println("Total length of the page source is : "+pageSourceLength);

        driver.quit();
    }
}
