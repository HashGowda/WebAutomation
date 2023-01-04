package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    //public static WebDriver driver;

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\Downloads\\chromedriver_linux64\\chromedriver");

            WebDriver driver=new ChromeDriver();
            driver.get("http://www.gooogle.com");
            driver.manage().window().maximize();
    }
}