package PumaAutomation;

import Browser.DatePicker;

public class HomePage extends BasePage {

    public void navigateTo() {
        driver.navigate().to("https://in.puma.com/in/en");
        driver.manage().window().maximize();
    }
}
