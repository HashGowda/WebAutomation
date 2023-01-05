package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Profile {
    final WebDriver driver;


    //Constructor, as every page needs a Webdriver to find elements
    public Profile(WebDriver driver){
        this.driver=driver;
    }

    @FindBys({
            @FindBy(id ="books-wrapper"),
            @FindBy(id = "userName-value")
    })
    WebElement user;

    @CacheLookup
    @FindBy(id = "submit")

    WebElement logoutBtn;


    //Method to check logged in username
    public void verifyUser(String userNme){
        if(user.getText().equalsIgnoreCase(userNme)){
            System.out.println("Correct username, ie "+user.getText());
        } else {
            System.out.println("Incorrect username, ie "+user.getText());
        }
    }

    //method to logout
    public void logoutAction(){
        System.out.println("Lets logoff now!");
        logoutBtn.click();
    }
}
